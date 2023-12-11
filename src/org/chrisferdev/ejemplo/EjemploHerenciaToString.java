package org.chrisferdev.ejemplo;

import org.chrisferdev.pooherencia.Alumno;
import org.chrisferdev.pooherencia.AlumnoInternacional;
import org.chrisferdev.pooherencia.Persona;
import org.chrisferdev.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======= Creando la instancia de la clase Alumno ======");
        Alumno alumno = new Alumno("Andres", "Guzman", 13, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("andres@correo.com");

        System.out.println("====== Creando la instancia de la clase AlumnoInternacional =====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("====== Creando la instancia de la clase de Profesor =======");
        Profesor profesor = new Profesor("Luci", "Perez", "Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("Profesor.luci@colegio.com");

        System.out.println(" ========= - ========");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println("=========================");
        System.out.println(persona);
    }
}
