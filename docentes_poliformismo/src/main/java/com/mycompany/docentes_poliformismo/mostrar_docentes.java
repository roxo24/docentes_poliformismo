/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docentes_poliformismo;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author roxo2
 */
public class mostrar_docentes {
    public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);

        ArrayList<docentes> doc = new ArrayList<> ();
        
        System.out.println("Bienvenidos a nuestra calculadora de sueldos");
        System.out.println("Ingrese cuantos docentes quiere ingresar: ");
        int num = teclado.nextInt();
        String nombre[] = new String [num];
        String Facu[] = new String [num];
        String Cadi[] = new String [num];
        int horas[] = new int [num];
        int valor[] = new int [num];
        int sueldo[] = new int [num];
        int trabajo[] = new int [num];
        docentes misdocentes[] = new docentes[num];
        
        for(int i = 0; i < num; i++){
            int des;
            System.out.println("si el docente " + i + " es de catedra ingrese 1, si es de TCO ingrese 2");
            des= teclado.nextInt();
            switch (des) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del docente " + i+1 +" :");
                    nombre[i] = teclado.next();
                    System.out.println("Ingrese la facultad a la que pertenece");
                    Facu [i]= teclado.next();
                    System.out.println("Ingrese a que cadi pertenece");
                    Cadi[i] = teclado.next();
                    System.out.println("Ingrese la cantidad de horas trabajadas ");
                    horas[i] = teclado.nextInt();
                    System.out.println("Ingrese el valor de cada una de ellas ");
                    valor[i] = teclado.nextInt();
                    misdocentes[i] = new docente_catedra(nombre[i],Facu[i],Cadi[i], num, horas[i],valor[i]);
                    doc.add(new docente_catedra(nombre[i],Facu[i],Cadi[i], num, horas[i],valor[i]));

                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del docente: " +i+1 + " ");
                nombre[i] = teclado.next();
                System.out.println("Ingrese la facultad a la que pertenece");
                Facu[i] = teclado.next();
                System.out.println("Ingrese a que cadi pertenece");
                Cadi[i] = teclado.next();
                System.out.println("Ingrese su sueldo mensual");
                sueldo[i] = teclado.nextInt();
                System.out.println("Ingrese cuantos trabajos de grado realizo");
                trabajo[i] = teclado.nextInt();
                    misdocentes[i] = new docentes_TCO(nombre[i],Facu[i],Cadi[i], num, sueldo[i],trabajo[i]);
                    doc.add(new docentes_TCO(nombre[i],Facu[i],Cadi[i], num, sueldo[i],trabajo[i]));
                }
                default -> {
                    System.out.println("numero equivocado");
                }
            }
        }
        
        int salarioTC=0;
        int salarioTT=0;
        
        
        
       
        
        for (docentes docente: misdocentes) {
            docente.calcularDatos();
            for (docentes docentesC : doc){
            
                if(docentesC instanceof docente_catedra cat){
                salarioTC += cat.gettotal();}
                if(docentesC instanceof docentes_TCO tco){
                salarioTT += tco.gettotal();}
            }
        
             
            System.out.println (docente.mostrarDatos ()) ;
            System.out.println("");
            
            
            
        }
                 System.out.println("el salario de todos los docentes de catedra es: " + salarioTC);
                 System.out.println("el salario de todos los docentes de tiempo completo es: " + salarioTT);
    }    
}       
