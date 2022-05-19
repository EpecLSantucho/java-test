package org.aguzman.archivos.ejemplos;

import org.aguzman.archivos.ejemplos.services.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\Cursos\\Java\\Archivos\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(servicio.leerArchivo2(nombreArchivo));
    }
}
