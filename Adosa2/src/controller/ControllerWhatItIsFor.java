package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelWhatItIsFor;
import view.ViewWhatItIsFor;

public class ControllerWhatItIsFor {
    
    private final ViewWhatItIsFor viewWhatItIsFor;
    private final ModelWhatItIsFor modelWhatItIsFor;
    
    public ControllerWhatItIsFor(ViewWhatItIsFor viewWhatItIsFor, ModelWhatItIsFor modelWhatItIsFor) {
        this.viewWhatItIsFor = viewWhatItIsFor;
        this.modelWhatItIsFor = modelWhatItIsFor;
        this.viewWhatItIsFor.setVisible(true);
        this.viewWhatItIsFor.setLocationRelativeTo(null);
        
        // Agregar ActionListener al botón de salida
        this.viewWhatItIsFor.addButtonExitWhatItIsForListener(new ExitListener());
    }
    
    // Clase interna para el ActionListener del botón de salida
    class ExitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Código para salir de la ventana o de la aplicación
            // Por ejemplo:
            System.exit(0);
        }
    }
}
