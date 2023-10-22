package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.ModelGame;
import view.ViewGame;

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
    private List<String> figures;
    
    
    //------------------------------------------------------------------------------------------------
    
    public ControllerGame(ViewGame viewGame, ModelGame modelGame) 
    {
        this.modelGame = modelGame;
        this.viewGame = viewGame;
        
        this.viewGame.setVisible(true);
        this.viewGame.setLocationRelativeTo(null);
        
        this.viewGame.addBtnButtonListener(new GameListener());
        
        url = "src/images/figures";
        figures = getFigures();
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
    
    public List<String> getFigures() // The same as the previous method but using the url of the class
    {
        List<String> figures;
        String figure;
        
        figure = getElementRandomly(listFilesInFolder(url)); //Choose a figure randomly
        figures = listFilesInFolder(figure); // Get the chosen figure
        Collections.shuffle(figures); // Shuffle the elements
        
        return figures;
    }
    
    //------------------------------------------------------------------------------------------------
    
    class GameListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equalsIgnoreCase("button"))
            {
                System.out.println("Button Pressed");
                System.out.println(figures);
            }                        
        }
        
    }
    
    //------------------------------------------------------------------------------------------------
    
}
