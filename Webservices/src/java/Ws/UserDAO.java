/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ws;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;

public class UserDAO implements Crud{
    PreparedStatement ps;
    ResultSet rs ;
    Connection con;
    Conexion conex = new Conexion();
    @Override
    public List listar() {
      List<User> datos = new ArrayList<>();
      String sql="select * from zapatos"; 

       try{
           con=conex.getConnection();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
               User u=new User();
               u.setId(rs.getInt("id"));
               u.setNomv(rs.getString("nomw"));
               u.setNomz(rs.getString("nomz"));
               u.setPrecio(rs.getInt("precio"));
               u.setUnidad(rs.getInt("unidad"));
               datos.add(u);
           }
       } catch(Exception e){    
       } 
       return datos;
    }

    @Override
    public User listarNomv(String Nomv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Add(String Nomv, String Nomz, int Precio, int Unidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Edit(String Nomv, String Nomz, int Precio, int Unidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Delete(String Nomv, String Nomz, int Precio, int Unidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
    
}
