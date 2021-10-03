package es.cipfpbatoi.psp.random10;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Si escribes stop no te doy numero");
       Scanner sc = new Scanner(System.in);
       while(!sc.nextLine().equals("stop")) {
    	   int aleatorio = (int) (Math.random()*10+1);
    	   System.out.println("Numero aleatorio -> " +aleatorio);
       }
       System.out.println("Has escrito stop adios");
	   
       }
    }
