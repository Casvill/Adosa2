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
    
    TimerTask task;
    Timer timer;
    
    //------------------------------------------------------------------------------------------------
    
    public ControllerGame(ViewGame viewGame, ModelGame modelGame) 
    {
        this.modelGame = modelGame;
        this.viewGame = viewGame;
        
        this.viewGame.setVisible(true);
        this.viewGame.setLocationRelativeTo(null);
        
        this.viewGame.addBtnButtonListener(new GameListener());
        
        figureImages = new ArrayList<>();
        url = "src/images/figures";      
        
        initGame();
    }
    
    //------------------------------------------------------------------------------------------------
    
    public void initGame()
    {
        updateFigures(3);        
        timer = new Timer();
        task = new UpdateFigures();
        timer.scheduleAtFixedRate(task, 0, 3000);
    }
    
    
    //------------------------------------------------------------------------------------------------
    
    private String getElementRandomly(List<String> list)
    {
        int max = list.size();
        
        int rand = (int)(Math.random() * max);
        
        String element = list.get(rand);
        
        
        return element;
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
        List<String> Figures = new ArrayList<>();
        String figure;
        
        for(int i = 0; i < num; i++)
        {
            figure = getElementRandomly(listFilesInFolder(url)); //Choose a figure randomly
            Figures.add(figure.substring(3));            
        }
        
        return Figures;
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
    
    public void updateFigures(int num)
    {
        figureImages = getFigureImages(num);
        List<String> methods = getMethodsRandomly((byte)num);
        
               
        try
        {
            
            Class<?> classViewGame = viewGame.getClass();
            for(int i = 0; i < num; i++)
            {
                classViewGame.getMethod(methods.get(i), String.class).invoke(viewGame, figureImages.get(i));
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
        try
        {
            Class<?> classViewGame = viewGame.getClass();
            for(int i = 1; i <= 8; i++)
            {
                String method = "setJLabel"+i+"Icon";
                classViewGame.getMethod(method, String.class).invoke(viewGame, "");
            }
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
        
        System.out.println("lives:"+modelGame.getLives());
        if(modelGame.getLives() > 0)
        {
            
            updateLiveImage(modelGame.getLives());
            
            cleanFigureImages();
            
            if(figureImages.size() > 3)
            {                        
                updateFigures(figureImages.size() - 1);
            }
            else
            {
                updateFigures(3);
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
    
    class UpdateFigures extends TimerTask
    {
        public void run()
        {
            cleanFigureImages();
            updateFigures(figureImages.size());
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
                    System.out.println("hit!!");
                    cleanFigureImages();
                    if(figureImages.size() < 8)
                    {
                        updateFigures(figureImages.size() + 1);
                    }
                    else
                    {
                        updateFigures(8);
                    }
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
