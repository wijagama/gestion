/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ws;

/**
 *
 * @author wija
 */
public class User {
    int id;
    String Nomv;
    String Nomz;
    int Precio;
    int Unidad;
  
    public User(){
        
    }

    public User(int id, String Nomv, String Nomz, int Precio, int Unidad) {
        this.id = id;
        this.Nomv = Nomv;
        this.Nomz = Nomz;
        this.Precio = Precio;
        this.Unidad = Unidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomv() {
        return Nomv;
    }

    public void setNomv(String Nomv) {
        this.Nomv = Nomv;
    }

    public String getNomz() {
        return Nomz;
    }

    public void setNomz(String Nomz) {
        this.Nomz = Nomz;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getUnidad() {
        return Unidad;
    }

    public void setUnidad(int Unidad) {
        this.Unidad = Unidad;
    }
      
}
