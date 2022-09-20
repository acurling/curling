/*
 Recursividad
 */
package recursividad;

import java.util.Scanner;


public class Recursividad 
{

   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();
        sc.close();
        String invertida = Invertida(palabra);
        System.out.printf("palabra introducida: %s%n", palabra);
        System.out.printf("palabra invertida: %s \n", invertida);
    }
    
    private static String Invertida(String palabra) 
    {
        if(palabra.length()==1)
        {
            return palabra;
        } 
        else 
        {
           return Invertida(palabra.substring(1)) + palabra.charAt(0);
        }
    }

    
    
}
