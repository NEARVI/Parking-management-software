/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VParqueadero;
import Vista.VPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author carl1
 */
public class ControladorPrincipal implements ActionListener{
    private VPrincipal frmPri;
    private VParqueadero frmPrq;

    public ControladorPrincipal(VPrincipal frmPri, VParqueadero frmPrq) {
        this.frmPri = frmPri;
        this.frmPrq = frmPrq;
        this.frmPri.btnEntrar.addActionListener(this);
        this.frmPri.btnSalir.addActionListener(this);
        
    }
    
    public void inciar(){
        frmPri.setTitle("Principal");
        frmPrq.setTitle("Parqueadero");
        frmPri.setLocationRelativeTo(null);
        frmPrq.setLocationRelativeTo(null);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frmPri.btnEntrar){
            frmPrq.setVisible(true);
            frmPri.dispose();
        }
        
        if(e.getSource()==frmPri.btnSalir){
            System.exit(0);
        }
    }
    
    
    
}
