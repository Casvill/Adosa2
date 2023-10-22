package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelInstructions;
import view.ViewInstructions;
import view.ViewLobby;

/**
 *
 * @author Daniel Casvill
 */
public class ControllerLobby 
{
    private final ViewLobby viewLobby;

    public ControllerLobby(ViewLobby viewLobby) 
    {
        this.viewLobby = viewLobby;
        this.viewLobby.setVisible(true);
        this.viewLobby.setLocationRelativeTo(null);
        
        this.viewLobby.addBtnInstructionsListener(new LobbyListener());
        this.viewLobby.addBtnPlayListener(new LobbyListener());
        this.viewLobby.addBtnWhatItIsForListener(new LobbyListener());
    }
    
    class LobbyListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equalsIgnoreCase("instructions"))
            {
                //System.out.println("test1");
                new ControllerInstructions(new ViewInstructions(),new ModelInstructions());
            }
            
            if(e.getActionCommand().equalsIgnoreCase("play"))
            {
                System.out.println("test2");
            }
            
            if(e.getActionCommand().equalsIgnoreCase("whatItIsFor"))
            {
                System.out.println("test3");
            }
            
        }
        
    }
    
}
