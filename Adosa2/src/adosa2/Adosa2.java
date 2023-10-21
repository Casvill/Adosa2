/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adosa2;

import controller.ControllerLobby;
import view.ViewInstructions;
import view.ViewLobby;

/**
 *
 * @author Daniel Casvill
 */
public class Adosa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ViewLobby view = new ViewLobby();
        ControllerLobby controller = new ControllerLobby(view);
        //new ViewInstructions().setVisible(true);
    }
    
}
