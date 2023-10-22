package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelInstructions;
import view.ViewInstructions;

/**
 *
 * @author andre
 */
public class ControllerInstructions 
{
    private final ViewInstructions viewInstructions;
    private final ModelInstructions modelInstructions;

    public ControllerInstructions(ViewInstructions viewInstructions, ModelInstructions modelInstructions) 
    {
        this.viewInstructions = viewInstructions;
        this.modelInstructions = modelInstructions;
        this.viewInstructions.setVisible(true);
        this.viewInstructions.setLocationRelativeTo(null);
        
        this.viewInstructions.addBtnNextListener(new InstructionsListener());
        this.viewInstructions.addBtnExitInstructionstListener(new InstructionsListener());
        this.viewInstructions.addBtnBackListener(new InstructionsListener());
    }
    
    class InstructionsListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equalsIgnoreCase("next"))
            {
                //System.out.println("next");
                byte pos = modelInstructions.getPosition();
                if(pos == 1)
                {
                    viewInstructions.setJlBackgroundIcon(modelInstructions.getInst2());                
                    modelInstructions.setPosition((byte)2);                                                           
                }
                if(pos == 2)
                {
                    viewInstructions.setJlBackgroundIcon(modelInstructions.getInst3());
                    modelInstructions.setPosition((byte)3);
                }
                if(pos == 3)
                {
                    viewInstructions.setJlBackgroundIcon(modelInstructions.getInst4());
                    modelInstructions.setPosition((byte)4);
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("back"))
            {
                //System.out.println("back");
                byte pos = modelInstructions.getPosition();
                if(pos == 2)
                {
                    viewInstructions.setJlBackgroundIcon(modelInstructions.getInst1());                
                    modelInstructions.setPosition((byte)1);                                                           
                }
                if(pos == 3)
                {
                    viewInstructions.setJlBackgroundIcon(modelInstructions.getInst2());
                    modelInstructions.setPosition((byte)2);
                }
                if(pos == 4)
                {
                    viewInstructions.setJlBackgroundIcon(modelInstructions.getInst3());
                    modelInstructions.setPosition((byte)3);
                }
            }
            
            if(e.getActionCommand().equalsIgnoreCase("exit"))
            {
                //System.out.println("exit");
                viewInstructions.dispose();
            }
        }
        
    }
    
}
