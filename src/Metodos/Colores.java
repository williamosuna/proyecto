
package Metodos;

import java.awt.Color;
import javax.swing.JButton;


public class Colores {
   
    public void color_btn_iniciar(JButton btn_iniciar){
        btn_iniciar.setBackground(new Color(208,208,208));
        btn_iniciar.setToolTipText("Iniciar");
        btn_iniciar.setContentAreaFilled(true);
            }
    
     public void color_btn_iniciar_desactivar(JButton btn_iniciar){
        btn_iniciar.setBackground(new Color(240,240,240));
        btn_iniciar.setContentAreaFilled(false);
            }
    
    
    
    
}
