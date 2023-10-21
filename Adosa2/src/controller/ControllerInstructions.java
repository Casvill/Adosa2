/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewInstructions;

/**
 *
 * @author andre
 */
public class ControllerInstructions 
{
    private ViewInstructions viewInstructions;

    public ControllerInstructions(ViewInstructions viewInstructions) 
    {
        this.viewInstructions = viewInstructions;
        this.viewInstructions.setVisible(true);
        this.viewInstructions.setLocationRelativeTo(null);
        
        this.viewInstructions.addBtnNextListener(new InstructionsListener());
        this.viewInstructions.addBtnExitInstructionstListener(new InstructionsListener());
    }
    
    class InstructionsListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equalsIgnoreCase("next"))
            {
                System.out.println("next");
            }
            
            if(e.getActionCommand().equalsIgnoreCase("exit"))
            {
                System.out.println("exit");
                viewInstructions.dispose();
            }
        }
        
    }
    
}
