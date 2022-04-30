/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;
import java.util.Scanner;

/**
 *
 * @author Samuel MP
 * @link 
 * @Tema Examen Final
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
        // Espaciado    
        System.out.print("\n\n\n");
            
        //Menu de Inicio
        System.out.println("=========== Examen Final ===========");
        System.out.println("1. Problema 1");
        System.out.println("2. Problema 2");
        System.out.println("3. Problema 3");
        System.out.println("4. Salir");

        // Seleccion de opciones
        System.out.print("Ingrese una opcion: ");
        opcion = sc.nextInt();
        
        System.out.print("\n");
        
        
        switch(opcion){
            
            // Primer Programa
            case 1:
                // Ingreso del primer numero
                System.out.print("Ingrese un Primer numero: ");
                int n1 = sc.nextInt();
                
                // Ingreso del segundo numero
                System.out.print("Ingrese un Segundo numero: ");
                int n2 = sc.nextInt();
                
                System.out.print("\n");
                
                // Comparacion de numero mayor
                if(n1 > n2){
                    System.out.print("El numero Mayor es: " + n1);
                } else {
                    System.out.print("El numero Mayor es: " + n2);
                }
                
                System.out.print("\n\n\n");
                break;
           
                
            case 2:
                
                System.out.print("Ingrese el tama;o de la Piramide: ");
                int piramide = sc.nextInt();

                if (piramide % 2 != 0) {
                    int asterisco = 1;
                    int espaciador = (piramide / 2) + 1;
                    for (int i = 0; i < (piramide / 2) + 1; i++) {
                        espaciador--;
                        for (int j = 0; j < espaciador; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < asterisco; k++) {
                            System.out.print("*");
                        }
                        asterisco = asterisco + 2;
                        System.out.print("\n");
                    }
                } else {
                    System.out.print("Solo se aceptan numeros impares");
                }
                
                
                
                
                
        }
            
        }while(opcion < 4);
    }
    
}
