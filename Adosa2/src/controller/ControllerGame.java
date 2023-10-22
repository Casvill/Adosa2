package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelGame;
import view.ViewGame;


/**
 *
 * @author Daniel Casvill
 */
public class ControllerGame 
{
    private ModelGame modelGame;
    private ViewGame viewGame;

    public ControllerGame(ViewGame viewGame, ModelGame modelGame) 
    {
        this.modelGame = modelGame;
        this.viewGame = viewGame;
        
        this.viewGame.setVisible(true);
        this.viewGame.setLocationRelativeTo(null);
        
        this.viewGame.addBtnButtonListener(new GameListener());
    }
    
    class GameListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equalsIgnoreCase("button"))
            {
                System.out.println("Button Pressed");
            }                        
        }
        
    }
    
}
