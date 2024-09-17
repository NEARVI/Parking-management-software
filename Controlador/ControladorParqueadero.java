/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasParqueadero;
import Modelo.Parqueadero;
import Vista.VParqueadero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carl1
 */
public class ControladorParqueadero implements ActionListener{
    private Parqueadero Prq;
    private VParqueadero frmPrq;
    private ConsultasParqueadero CPrq;
    DefaultTableModel mdlo = new DefaultTableModel();
    
    public ControladorParqueadero(Parqueadero Prq, VParqueadero frmPrq, ConsultasParqueadero CPrq) {
        this.Prq = Prq;
        this.frmPrq = frmPrq;
        this.CPrq = CPrq;
        this.frmPrq.btnRegistrar.addActionListener(this);
        this.frmPrq.btnModificar.addActionListener(this);
        this.frmPrq.btnEliminar.addActionListener(this);
        this.frmPrq.btnBuscar.addActionListener(this);
        this.frmPrq.btnListasVehiculos.addActionListener(this);
    }
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        //// boton registar
        if(e.getSource()==frmPrq.btnRegistrar){
            Prq.setPlaca(frmPrq.txtPlaca.getText());
            Prq.setHoraEntrada(frmPrq.txtHoraEntrada.getText());
            Prq.setHoraSalida(frmPrq.txtHoraSalida.getText());
            Prq.setPrecio(Double.parseDouble(frmPrq.txtPrecio.getText()));
            Prq.setTipoVehiculo(frmPrq.txtTipoVehiculo.getText());
            if(CPrq.registrar(Prq)){
                JOptionPane.showMessageDialog(null, "Vehiculo agregado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Vehiculo no se encontro");
                limpiar();
            }
        } 
        
         //// boton modificar
        if(e.getSource()==frmPrq.btnModificar){
            Prq.setIdVehiculo(Integer.parseInt(frmPrq.txtIdVehiculo.getText()));
            Prq.setPlaca(frmPrq.txtPlaca.getText());
            Prq.setHoraEntrada(frmPrq.txtHoraEntrada.getText());
            Prq.setHoraSalida(frmPrq.txtHoraSalida.getText());
            Prq.setPrecio(Double.parseDouble(frmPrq.txtPrecio.getText()));
            Prq.setTipoVehiculo(frmPrq.txtTipoVehiculo.getText());
          
            if(CPrq.modificar(Prq)){
                JOptionPane.showMessageDialog(null, "Vehiculo modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
        } 
        
          // boton eliminar
        if(e.getSource()==frmPrq.btnEliminar){
            Prq.setIdVehiculo(Integer.parseInt(frmPrq.txtIdVehiculo.getText()));
            
            if(CPrq.eliminar(Prq)){
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
        } 
        
        // boton Buscar
        if(e.getSource()==frmPrq.btnBuscar){
            Prq.setIdVehiculo(Integer.parseInt(frmPrq.txtIdVehiculo.getText()));
            if(CPrq.buscar(Prq)){
                frmPrq.txtIdVehiculo.setText(String.valueOf(Prq.getIdVehiculo()));
                frmPrq.txtPlaca.setText(Prq.getPlaca());
                frmPrq.txtHoraEntrada.setText(Prq.getHoraEntrada());                
                frmPrq.txtHoraSalida.setText(Prq.getHoraSalida());
                frmPrq.txtPrecio.setText(String.valueOf(Prq.getPrecio()));
                frmPrq.txtTipoVehiculo.setText(Prq.getTipoVehiculo());
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro Vehiculo");
                limpiar();
            }
        } // fin buscar
        
        // boton listar
        if(e.getSource()==frmPrq.btnListasVehiculos){
            ListarDa(frmPrq.jtDatos);
        }
        
        
    } 
        
    public void limpiar(){
        frmPrq.txtPlaca.setText(null);
        frmPrq.txtHoraEntrada.setText(null);
        frmPrq.txtHoraSalida.setText(null);
        frmPrq.txtPrecio.setText(null);
        frmPrq.txtTipoVehiculo.setText(null);
        frmPrq.txtIdVehiculo.setText(null);
    }
    
    public void ListarDa(JTable tablaV){
        mdlo = (DefaultTableModel)tablaV.getModel();
        List<Parqueadero> lista = CPrq.listaVehiculos();
        
        Object[] dc = new Object[6];
             
        for (int i = 0; i < lista.size(); i++) {
            dc[0] = lista.get(i).getIdVehiculo();
            dc[1] = lista.get(i).getPlaca();
            dc[2] = lista.get(i).getHoraEntrada();
            dc[3] = lista.get(i).getHoraSalida();
            dc[4] = lista.get(i).getPrecio();
            dc[5] = lista.get(i).getTipoVehiculo();
            mdlo.addRow(dc);
        }
        frmPrq.jtDatos.setModel(mdlo);
    }    
   
}










