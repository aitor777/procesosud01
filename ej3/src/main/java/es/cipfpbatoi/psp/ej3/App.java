package es.cipfpbatoi.psp.ej3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
String comando = "java -jar /home/batoi/Escritorio/Actividades/PSP/UD01/procesosud01/Minusculas/target/Minusculas-0.0.1-SNAPSHOT.jar";
    	
    	List<String> argsList = new ArrayList<>(Arrays.asList(comando.split(" ")));
    	
    	ProcessBuilder p = new ProcessBuilder(argsList);
    	
    	try {
    		Process minusculas = p.start();
    		Scanner aMinusculas = new Scanner(minusculas.getInputStream());
    		
    		OutputStream os = minusculas.getOutputStream();
    		OutputStreamWriter ow = new OutputStreamWriter(os);
    		BufferedWriter bw = new BufferedWriter(ow);
    		
    		
    		Scanner sc = new Scanner(System.in);
    		
    		String linea;
    		
    		while(!(linea=sc.nextLine()).equals("finalzar")) {
    			bw.write(linea);
       			bw.newLine();
    			bw.flush();
    			System.out.println(aMinusculas.nextLine());
    		}
    		   
    		
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }
}
