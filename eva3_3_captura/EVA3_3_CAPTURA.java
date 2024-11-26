/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = capturaTexto("Introduce el nombre");
        String apellido = capturaTexto("Intrduce el apellido");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+ apellido);
        
        int edad = edadPersona("Introduce la edad: ");
        double sal = salario("Introduce la paga: ");
       
        
        
        
        
        
    }
    public static String capturaTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        String nombre;
        System.out.println(mensaje);
        nombre = captu.nextLine();
        return nombre;
        
    }
     public static int edadPersona(String mensaje){
      Scanner captu = new Scanner(System.in);
        int edad1;
         System.out.println(mensaje);
         
     
        edad1 = captu.nextInt();
        return edad1;   
     }
     public static double salario(String mensaje){
         Scanner captu = new Scanner(System.in);
        double sal;
         System.out.println(mensaje);
                
        sal = captu.nextDouble();
        return sal; 
     }
     
        
    
    
    
}
