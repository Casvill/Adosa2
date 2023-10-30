package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.ModelGame;
import view.ViewGame;
import java.util.Timer;
import java.util.TimerTask;
import view.ViewStats;

//---------------------------------------------------------------------------------------------------
/**
 *
 * @author Daniel Casvill
 */
//---------------------------------------------------------------------------------------------------
public final class ControllerGame 
{
    private final ModelGame modelGame;
    private final ViewGame viewGame;
    
    
    private String url; //Path where figure images are located
    
    private List<String> figureImages;
    private List<String> squaresUsed;
    
    private TimerTask task;
    private Timer timer;
    private int timerInterval;
    private int minimumTimerInterval;
    private int maximumTimerInterval;
    private int timerSteps;
    private int delayTime;
    private int scoreSteps;
    
    private int numberOfTasks;
    
    //------------------------------------------------------------------------------------------------
    
    public ControllerGame(ViewGame viewGame, ModelGame modelGame) //throws InterruptedException 
    {
        this.modelGame = modelGame;
        this.viewGame = viewGame;
        
        this.viewGame.setVisible(true);
        this.viewGame.setLocationRelativeTo(null);
        
        this.viewGame.addBtnButtonListener(new GameListener());

        initGame();
    }
    //------------------------------------------------------------------------------------------------
    
    public void initGame()
    {
        numberOfTasks = 0;
        figureImages = new ArrayList<>();
        squaresUsed = new ArrayList<>();
        
        url = "src/images/figures";   
        
        timerInterval = 2000;
        minimumTimerInterval = 800;
        maximumTimerInterval = 2000;
        timerSteps = 200;
        delayTime = 1700;     
        scoreSteps = 2;
        
        resetFigures(3);
        initTimerTimer();
    }
    
    //------------------------------------------------------------------------------------------------
    
    public void initTimerTimer()
    {                  
        //System.out.println("1- Number of tasks: "+numerOfTasks);
        numberOfTasks++;        
        timer = new Timer();
        task = new UpdateFigures();        
        timer.scheduleAtFixedRate(task, delayTime, timerInterval);        
        //System.out.println("2- Number of tasks: "+numerOfTasks);
    }
    
    public void cancelTimer()
    {
        //System.out.println("3- Number of tasks: "+numerOfTasks);
        numberOfTasks--;        
        task.cancel();
        timer.purge();
        //System.out.println("4- Number of tasks: "+numerOfTasks);
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
                fileNames.add(url.substring(3)+"/"+file.getName());
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
        //System.out.println("*---getFigureImages:---------------------------------*");
        List<String> figures = listFilesInFolder(url);
        Collections.shuffle(figures);
        figures = figures.subList(0, num);
        //System.out.println("Target"+figures);
        //System.out.println("*----------------------------------------------------*\n");
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
    
    public void resetFigures(int numberOfFigures)
    {
        //figureImages.clear();
        //squaresUsed.clear();
        figureImages = getFigureImages(numberOfFigures);
        List<String> methods = getMethodsRandomly((byte)numberOfFigures);
        String method;
               
        try
        { 
            Class<?> classViewGame = viewGame.getClass();
            for(int i = 0; i < numberOfFigures; i++)
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
        //System.out.println("***updateLiveImage***");
        try
        {
            String method = "setJlLive"+(lives+1)+"Icon";
            //System.out.println("method:"+method);
            
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
        modelGame.setFailures((short) (modelGame.getFailures() + 1));
        
        viewGame.setEnabledButton(false);                
        
        modelGame.setLives((byte)(modelGame.getLives()- 1)); 
        updateLiveImage(modelGame.getLives());
        

        if(timerInterval < maximumTimerInterval)
        {
            timerInterval += timerSteps;
        }
                                                
        if(modelGame.getLives() > 0)
        {                                    
            cleanFigureImages();
            
            if(figureImages.size() > 3)
            {                        
                resetFigures(figureImages.size() - 1);
            }
            else
            {
                resetFigures(3);
            }   
            viewGame.setEnabledButton(true);
            initTimerTimer();
        }
        
        else
        {
            cancelTimer();
            endGame();
        }
        
    }
    
    //------------------------------------------------------------------------------------------------
    
    public void endGame()
    {                
        //System.out.println("Game over! You lose!");                  
        //pauseGame();
        cleanFigureImages();
        viewGame.dispose();
        new ControllerStats(new ViewStats(), modelGame);    
    }
    
    //------------------------------------------------------------------------------------------------    
    
    public void pauseGame()
    {                
        try
            {
                //System.out.println("PAUSE");
                Thread.sleep(2000);
            }
            catch(InterruptedException error)
            {
                System.out.println("error: " + error);
            }        
    }
    
    //------------------------------------------------------------------------------------------------  
    
    public void score()
    {
        int currentScore = modelGame.getScore();

        if(currentScore > 0)
        {
            modelGame.setScore(currentScore + (scoreSteps * 5));
            scoreSteps *= 2;
        }
        else
        {
            modelGame.setScore(5);
        }            
        
        viewGame.setJlScore(modelGame.getScore());
        
    }
    
    //------------------------------------------------------------------------------------------------    
    
    public void hit()
    {
        //System.out.println("Hit");
        modelGame.setHits((short) (modelGame.getHits() + 1));

        cleanFigureImages();

        if(timerInterval > minimumTimerInterval)
        {
            timerInterval -= timerSteps;
        }                       
                
        if(figureImages.size() < 8)
        {
            resetFigures(figureImages.size() + 1);
        }
        else
        {
            resetFigures(8);
        }
        
        score();
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
            if(hasRepeatedElements(figureImages))
            {                
                cancelTimer();             
                failure();         
                //initTimerTimer();
            }
            else
            {
                updateFigure();
            }
        }
    }
    
    //------------------------------------------------------------------------------------------------
    
    
    class GameListener implements MouseListener
    {


        @Override
        public void mouseClicked(MouseEvent e) 
        {
                                                           
            if(hasRepeatedElements(figureImages))
            {
                cancelTimer();
                hit();
                initTimerTimer();
            }

            else
            {
                cancelTimer();                
                failure();     
                //initTimerTimer();
            }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
    }
    
    //------------------------------------------------------------------------------------------------
    
}
