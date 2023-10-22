package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.ModelGame;
import view.ViewGame;
import java.util.Timer;
import java.util.TimerTask;

//---------------------------------------------------------------------------------------------------
/**
 *
 * @author Daniel Casvill
 */
//---------------------------------------------------------------------------------------------------
public class ControllerGame 
{
    private ModelGame modelGame;
    private ViewGame viewGame;
    
    
    private final String url; //Path where figure images are located
    private List<String> figureImages;
    private List<String> squaresUsed;
    
    private TimerTask task;
    private Timer timer;
    private int timerInterval;
    
    //------------------------------------------------------------------------------------------------
    
    public ControllerGame(ViewGame viewGame, ModelGame modelGame) 
    {
        this.modelGame = modelGame;
        this.viewGame = viewGame;
        
        this.viewGame.setVisible(true);
        this.viewGame.setLocationRelativeTo(null);
        
        this.viewGame.addBtnButtonListener(new GameListener());
        
        figureImages = new ArrayList<String>();
        squaresUsed = new ArrayList<String>();
        url = "src/images/figures";      
        
        initGame();
    }
    
    //------------------------------------------------------------------------------------------------
    
    public void initGame()
    {
        resetFigures(3);        
        timer = new Timer();
        task = new UpdateFigures();
        timerInterval = 3000;
        timer.scheduleAtFixedRate(task, 0, timerInterval);
    }
    
    //------------------------------------------------------------------------------------------------
    
    private List<String> listFilesInFolder(String url) 
    {
        // Specify the path of the folder you want to list
        String folder = url;

        // Create a File object to represent the folder
        File directory = new File(folder);

        // Initialize a list to store file names
        List<String> fileNames = new ArrayList<>();

        // Check if the folder exists
        if (directory.exists() && directory.isDirectory()) 
        {
            // List the files inside the folder
            File[] files = directory.listFiles();

            // Iterate over the files and add their names to the list
            for (File file : files) 
            {
                fileNames.add(url+"/"+file.getName());
            }
        } 
        
        else 
        {
            System.out.println("The folder does not exist or is not a valid folder.");
        }

        // Return the list of file names
        return fileNames;
    }
    
    //------------------------------------------------------------------------------------------------
    
    public List<String> getFigureImages(int num) 
    {
        List<String> figures = listFilesInFolder(url);
        Collections.shuffle(figures);
        figures = figures.subList(0, num);
        String figure;
        
        for(int i = 0; i < figures.size(); i++)
        {         
            figure = figures.get(i).substring(3);
            figures.remove(i);
            figures.add(i, figure);
        }
        
        return figures;
    }
    
    //------------------------------------------------------------------------------------------------
    
    public List<String> getMethodsRandomly(byte num)
    {
        List<String> methods = new ArrayList<>();

        
        for(int i = 1; i <= 8; i++)
        {
            methods.add("setJLabel"+i+"Icon");
        }
  
        Collections.shuffle(methods);                   
        
        return methods.subList(0, num);
    }
    
    //------------------------------------------------------------------------------------------------
    
    public void resetFigures(int num)
    {
        figureImages = getFigureImages(num);
        List<String> methods = getMethodsRandomly((byte)num);
        String method;
               
        try
        { 
            Class<?> classViewGame = viewGame.getClass();
            for(int i = 0; i < num; i++)
            {
                method = methods.get(i);
                classViewGame.getMethod(method, String.class).invoke(viewGame, figureImages.get(i));
                squaresUsed.add(method);
            }
            
        }
        catch(IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException error)
        {
            System.out.println("error:" + error);

        }
    }
    
    //------------------------------------------------------------------------------------------------
    
    public boolean hasRepeatedElements(List<String> list)
    {
        for(int i = 0; i < list.size() - 1; i ++)
        {
            for(int j = i + 1; j < list.size(); j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    //------------------------------------------------------------------------------------------------
    
    public void cleanFigureImages() 
    {
        System.out.println("Squares: " + squaresUsed);
        try
        {            
            Class<?> classViewGame = viewGame.getClass();
            for(int i = 0; i < squaresUsed.size(); i++)
            {
                //String method = "setJLabel"+i+"Icon";
                classViewGame.getMethod(squaresUsed.get(i), String.class).invoke(viewGame, "");
            }
            squaresUsed.clear();
        }
        catch(IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException error)
        {
            System.out.println("error:" + error);
        }        
    }
    
    //------------------------------------------------------------------------------------------------
    
    public void updateLiveImage(int lives)
    {
        try
        {
            String method = "setJlLive"+(lives+1)+"Icon";
            
            Class<?> classViewGame = viewGame.getClass();
            classViewGame.getMethod(method, String.class).invoke(viewGame, "/images/live_red.png");
            
        }
        catch(IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException error)
        {
            System.out.println("error:" + error);

        }
    }
    
    //------------------------------------------------------------------------------------------------
    
    public void failure()
    {
        modelGame.setLives((byte) (modelGame.getLives()- 1)); 
        System.out.println("Failure!!");
        /*timer.purge();
        task.cancel();
        timerInterval += 250;
        
        timer.scheduleAtFixedRate(task, 0, timerInterval);*/
        
        
        if(modelGame.getLives() > 0)
        {
            
            updateLiveImage(modelGame.getLives());
            
            cleanFigureImages();
            
            if(figureImages.size() > 3)
            {                        
                resetFigures(figureImages.size() - 1);
            }
            else
            {
                resetFigures(3);
            }
        }
        else
        {
            updateLiveImage(modelGame.getLives());
            cleanFigureImages();
            task.cancel();
            timer.purge();
            System.out.println("Game ended! You lose!");
        }
        
    }
    
    //------------------------------------------------------------------------------------------------    
    
    public void hit()
    {
        System.out.println("hit!!");
        cleanFigureImages();
        /*timer.purge();
        task.cancel();
        timerInterval -= 250;
        
        timer.scheduleAtFixedRate(task, 0, timerInterval);*/
        
        if(figureImages.size() < 8)
        {
            resetFigures(figureImages.size() + 1);
        }
        else
        {
            resetFigures(8);
        }
    }
        
    //------------------------------------------------------------------------------------------------
    
    public void updateFigure()
    {
        int rand = (int)(Math.random() * squaresUsed.size());
        String newFigureImage = getFigureImages(1).get(0);
        figureImages.remove(rand);
        figureImages.add(rand, newFigureImage);
  
        try
        { 
            Class<?> classViewGame = viewGame.getClass();

            classViewGame.getMethod(squaresUsed.get(rand), String.class).invoke(viewGame, newFigureImage);

        }
        catch(IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException error)
        {
            System.out.println("error:" + error);
        }
    }
    
    //------------------------------------------------------------------------------------------------
    
    class UpdateFigures extends TimerTask
    {
        @Override
        public void run()
        {
            System.out.println("images:"+figureImages);
            updateFigure();
        }
    }
    
    //------------------------------------------------------------------------------------------------
    
    
    class GameListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equalsIgnoreCase("button"))
            {                                                
                if(hasRepeatedElements(figureImages))
                {
                    hit();
                }
                else
                {
                    failure();
                    
                }
            }                        
        }
        
    }
    
    //------------------------------------------------------------------------------------------------
    
}
