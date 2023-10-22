package controller;

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
    }
    
    
}
