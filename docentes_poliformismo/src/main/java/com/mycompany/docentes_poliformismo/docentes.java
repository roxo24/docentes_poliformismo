/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docentes_poliformismo;

/**
 *
 * @author roxo2
 */
public abstract class docentes {
    protected String nombre;
    protected String Facu;
    protected String Cadi;
    protected int num;

    public docentes(String nombre, String Facu, String Cadi, int num){
    this.nombre = nombre;
    this.Facu = Facu;
    this.Cadi = Cadi;
    this.num = num;

    }

    public void setNombre() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getFacu() {
        return Facu;
    }

    public String getCadi() {
        return Cadi;
    }
    public abstract int gettotal();
       

    public abstract void calcularDatos ();
    public String mostrarDatos (){
    
        return "nombre: "+nombre+"\nfacultad: "+Facu+"\nCadi: "+Cadi;
    
    }

}
