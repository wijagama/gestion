/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ws;

import java.util.List;


public interface Crud {
    public List listar();
    public User listarNomv(String Nomv);  
    public String Add(String Nomv,String Nomz,int Precio,int Unidad);
    public String Edit(String Nomv,String Nomz,int Precio,int Unidad);
    public String Delete(String Nomv,String Nomz,int Precio,int Unidad);
    
    }

