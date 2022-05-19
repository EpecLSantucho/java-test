package org.aguzman.archivos.ejemplos.services;

import java.awt.print.Printable;
import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {
    public void crearArchivo (String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
            buffer.append("hola que tal amigos\n").append("todo bien??\n");
            //buffer.close();
            System.out.println("el archivo fue creado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2 (String nombre){
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))) {
            buffer.println("hola que tal amigos");
            buffer.println("todo bien??");
            //buffer.close();
            System.out.println("el archivo fue creado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ( (linea = br.readLine()) != null ){
                sb.append(linea).append("\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            Scanner s = new Scanner(archivo);
            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
