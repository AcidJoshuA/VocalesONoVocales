/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalesonovocales;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Vocalesonovocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresar letras: ");
    while (true){
    System.out.print("Ingresa una letra: ");
    char letra = scanner.next().charAt(0); 
    if (letra == ' '){
    System.out.println("El programa ha terminado.");
    break;
    }
    if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' 
    || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U') {
    System.out.println("La letra '" + letra + "' es una vocal.");
    }else if (Character.isLetter(letra)){ 
    System.out.println("La letra '" + letra + "' es una consonante.");
    }else {
    System.out.println("Ingresar solo letras.");
    }
  }
}    
}
