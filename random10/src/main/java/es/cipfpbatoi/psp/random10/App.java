package es.cipfpbatoi.psp.random10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
       int aleatorio;
       Scanner sc = new Scanner(System.in);
       String palabra=" ";
       String linea;
       try{
       File prueba = new File("randoms.txt");
       BufferedWriter bw = new BufferedWriter(new FileWriter(prueba));
       
  
       
       System.out.println("Hola, si me escribes stop no te dare ningun número");
       
       while(palabra.equals("stop")) {
    		 
    	   aleatorio = (int) (Math.random()*10+1);
    	   System.out.println("Numero aleatorio -> " +aleatorio);
    	   bw.write(aleatorio);
    	 
       }
    	   
  		 System.out.println("Has escrito stop adios");
  	 
       	
	   
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
   	}
}
