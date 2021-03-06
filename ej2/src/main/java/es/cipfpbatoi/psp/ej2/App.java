package es.cipfpbatoi.psp.ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    	String comando = "java -jar /home/batoi/Escritorio/Actividades/PSP/UD01/procesosud01/random10/target/random10-0.0.1-SNAPSHOT.jar";
    	
    	List<String> argsList = new ArrayList<>(Arrays.asList(comando.split(" ")));
    	
    	ProcessBuilder p = new ProcessBuilder(argsList);
    	
    	try {
    		
    		//inicio del proceso
    		Process random10 = p.start();
    		
    		//comunicacion de random10 con ej2
    		Scanner random10Scanner = new Scanner(random10.getInputStream());
    		
    		
    		//envio de palabras al proceso
    		OutputStream os = random10.getOutputStream();
    		OutputStreamWriter ow = new OutputStreamWriter(os);
    		BufferedWriter bw = new BufferedWriter(ow);
    		
    		
    		Scanner sc = new Scanner(System.in);
    		
    		String linea;
    		
    		while(!(linea=sc.nextLine()).equals("stop")) {
    			bw.write(linea);
       			bw.newLine();
    			bw.flush();
    			System.out.println(random10Scanner.nextLine());
    		}
    		   

    		
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }
}
