package es.cipfpbatoi.psp.Minusculas;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("La palabra que me escribas te la paso a minuscula");
    	while(!(palabra=sc.nextLine()).equals("finalizar") ) {
      
        System.out.println(palabra.toLowerCase());
    	}
    	
    }
}
