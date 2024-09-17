/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_parqueadero;

import Controlador.ControladorParqueadero;
import Controlador.ControladorPrincipal;
import Modelo.ConsultasParqueadero;
import Modelo.Parqueadero;
import Vista.VParqueadero;
import Vista.VPrincipal;

/**
 *
 * @author carl1
 */
public class CRUD_Parqueadero {

    /**
     * @param args the command line arguments
     */
    private static CRUD_Parqueadero instancia1 = new CRUD_Parqueadero();
    
    private CRUD_Parqueadero (){
        
    }
    
    public static CRUD_Parqueadero getInstance(){
        return instancia1;
  
    }
    public static void main(String[] args) {
        Parqueadero Prq = new Parqueadero();
        ConsultasParqueadero CPrq= new ConsultasParqueadero();
        VParqueadero frmPrq = new VParqueadero();
        ControladorParqueadero ctrPrq = new ControladorParqueadero(Prq, frmPrq, CPrq);
        VPrincipal frmPri = new VPrincipal();
        ControladorPrincipal CPri = new ControladorPrincipal(frmPri, frmPrq);
        CPri.inciar();
        frmPri.setVisible(true);
    }
    
}
