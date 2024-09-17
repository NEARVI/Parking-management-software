/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author carl1
 */
public class ConsultasParqueadero extends Conexion{
    // Metodo registrar
    public boolean registrar (Parqueadero p){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into vehiculo (placa, horaEntrada, horaSalida, precio, tipoVehiculo) values (?,?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getPlaca());
            ps.setString(2, p.getHoraEntrada());
            ps.setString(3, p.getHoraSalida());
            ps.setDouble(4, p.getPrecio());
            ps.setString(5, p.getTipoVehiculo());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    } 
    
     // Metodo modificar
    public boolean modificar (Parqueadero p){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update vehiculo set placa=?, horaEntrada=?, horaSalida=?, precio=?, tipoVehiculo=? where idVehiculo=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getPlaca());
            ps.setString(2, p.getHoraEntrada());
            ps.setString(3, p.getHoraSalida());
            ps.setDouble(4, p.getPrecio());
            ps.setString(5, p.getTipoVehiculo());
            ps.setInt(6, p.getIdVehiculo());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    } 
    
        // Metodo eliminar
    public boolean eliminar (Parqueadero p){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "delete from vehiculo where idVehiculo=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdVehiculo());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    } 
    
   // Metodo buscar
    public boolean buscar (Parqueadero p){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from vehiculo where idVehiculo=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdVehiculo());
            rs = ps.executeQuery();
            if(rs.next()){
                p.setIdVehiculo(Integer.parseInt(rs.getString("idVehiculo"))); 
                p.setPlaca(rs.getString("placa"));
                p.setHoraEntrada(rs.getString("horaEntrada"));
                p.setHoraSalida(rs.getString("horaSalida"));
                p.setPrecio(Double.parseDouble(rs.getString("precio")));
                p.setTipoVehiculo(rs.getString("tipoVehiculo")); 
                return true;
            }
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }  
    
    public ArrayList<Parqueadero> listaVehiculos() {
        ArrayList listaVehi = new ArrayList();
        Parqueadero p;
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from vehiculo";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p = new Parqueadero();
                p.setIdVehiculo(Integer.parseInt(rs.getString(1))); 
                p.setPlaca(rs.getString(2));
                p.setHoraEntrada(rs.getString(3));
                p.setHoraSalida(rs.getString(4));
                p.setPrecio(Double.parseDouble(rs.getString(5)));
                p.setTipoVehiculo(rs.getString(6));
                listaVehi.add(p);
            }
        } catch (Exception e) {
            
        }
        return listaVehi;
    }
}
