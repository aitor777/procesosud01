package es.cipfpbatoi.psp.ej1;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
  
        public static void main(String[] args) {
            ArrayList<String> argumentos = new ArrayList<>(Arrays.asList(args));
            try{
            	//Aquí instanciamos el proceso Hijo dandole como parámetros los argumentos pasados a lista
            	
                ProcessBuilder pb = new ProcessBuilder(argumentos);
                //Inicializamos el proceso
                Process ls = pb.start();
                
                //Hacemos que le proceso padre espere 2 segundos
                TimeUnit.SECONDS.sleep(2);
                
                // creamos los objetos para leer las instrucciones del proceso
                InputStream is = ls.getInputStream();
                InputStreamReader ir = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(ir);

                //Instanciamos los objetos que nos permitiran 
                File prueba = new File("output.txt");
                BufferedWriter bw = new BufferedWriter(new FileWriter(prueba));
                
                System.out.print("Estos son los argumentos utilizados -> " +argumentos+"\n");
                
                //Tenemos el String linea para almacenar el contenido deñ comando
                String linea;

                //Aqui indicamos que lo que se lea en el comando es lo mismo que linea
                //Mientras no se nulo pinta el contenido de linea y lo escribe en el fichero de output
                while((linea = br.readLine())!=null){
                    System.out.println(linea);
                    bw.write("\n"+linea);
                }
                
                bw.close();

            }catch(IOException e){
                System.out.println("El proceso se ha finalizado ");
            }catch(InterruptedException exception){
                System.out.println("El tiempo ha finalizado");
            }
            
    }
}
