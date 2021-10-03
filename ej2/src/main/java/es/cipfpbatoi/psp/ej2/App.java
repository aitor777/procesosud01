package es.cipfpbatoi.psp.ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	try {
    	Process p = Runtime.getRuntime().exec("/home/batoi/Escritorio/Actividades/PSP/UD01/procesosud01/random10/target/random10-0.0.1-SNAPSHOT.jar");
    	InputStream is = p.getInputStream();
    	BufferedReader br = new BufferedReader(new InputStreamReader(is));
    	File fichero = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
    	String linea;
    	while((linea=br.readLine())!=null) {
    		System.out.println(linea);
    		linea = br.readLine();
    		bw.write("\n"+linea);
    	}
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }
}
