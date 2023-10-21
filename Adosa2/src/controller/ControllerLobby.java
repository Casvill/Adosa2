/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewLobby;

/**
 *
 * @author Daniel Casvill
 */
public class ControllerLobby 
{
    private ViewLobby viewLobby;

    public ControllerLobby(ViewLobby viewLobby) 
    {
        this.viewLobby = viewLobby;
        viewLobby.setVisible(true);
        viewLobby.setLocationRelativeTo(null);
        
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
                System.out.println("test1");
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
