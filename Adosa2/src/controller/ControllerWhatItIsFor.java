package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewWhatItIsFor;

/**
 * Autor: andre
 */
public class ControllerWhatItIsFor {
    
    private final ViewWhatItIsFor viewWhatItIsFor;
    
    
    public ControllerWhatItIsFor(ViewWhatItIsFor viewWhatItIsFor) {
        this.viewWhatItIsFor = viewWhatItIsFor;
        this.viewWhatItIsFor.setVisible(true);
        this.viewWhatItIsFor.setLocationRelativeTo(null);
        
        this.viewWhatItIsFor.addButtonExitWhatItIsForListener(new WhatItIsForListener());
    }
    
    class WhatItIsForListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Código para salir de la ventana o de la aplicación
            // Por ejemplo:
            //System.exit(0);
            
            if ("exit".equalsIgnoreCase(e.getActionCommand())) {
                viewWhatItIsFor.dispose();
            }
        }
    }
}
