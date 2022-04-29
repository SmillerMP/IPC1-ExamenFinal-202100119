/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;
import java.util.Scanner;

/**
 *
 * @author Samuellllll
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

        System.out.print("Ingrese una opcion: ");
        opcion = sc.nextInt();
            
        }while(opcion < 4);
    }
    
}
