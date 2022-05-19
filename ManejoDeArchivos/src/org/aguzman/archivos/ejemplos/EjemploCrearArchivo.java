package org.aguzman.archivos.ejemplos;

import org.aguzman.archivos.ejemplos.services.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\Cursos\\Java\\Archivos\\java.txt";
        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);
    }
}
