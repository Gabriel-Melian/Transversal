/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import Control.*;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alumno = new Alumno(10,42674723,"Cabrera","Gonzalo",LocalDate.of(2001, 06, 2),1);
        Alumno alumno2 = new Alumno(36674723,"Saez","Juanjo",LocalDate.of(1998, 04, 12),1);
        AlumnoData ad = new AlumnoData();
        
        System.out.println("~Metodos AlumnoData~");
        //ad.guardarAlumno(alumno);//Funciona
        //System.out.println(ad.buscarAlumno(4));//Funciona
        //System.out.println(ad.buscarAlumnoDNI(42674723));//Funciona
        //for (Alumno aux : ad.buscarAlumnos(1)) {//Funciona
            //System.out.println(aux);
        //}
        //ad.actualizarAlumno(alumno);//Funciona
        //ad.desactivar(2);//Funciona
        
        System.out.println("~Metodos MateriaData~");
        
        Materia materia = new Materia(7,"Quimica",2023,1);
        MateriaData md = new MateriaData();
        
        //md.guardarMateria(materia);//Funciona
        //md.actualizarMateria(materia);//Funciona
        //System.out.println(md.buscarMateria(1));//Funciona
        //for (Materia aux : md.buscarMaterias(1)) {//Funciona
            //System.out.println(aux);
        //}
        //md.desactivar(2);//Funciona
        
        System.out.println("~Metodos InscripcionData~");
        
        Inscripcion inscripcion = new Inscripcion(6,alumno,materia);
        InscripcionData id = new InscripcionData();
        
        //id.inscribirAlumno(inscripcion);//Funciona
        //id.actualizar(8, 15);//Funciona
        //id.eliminar(12);//Funciona
        //for (Inscripcion aux : id.buscarInscripciones(1)) {//Funciona
            //System.out.println(aux);
        //}
        //for (Inscripcion aux : id.obtenerInscripciones()) {//Funciona
            //System.out.println(aux);
        //}
        //for (Materia aux : id.materiasCursadas(1)) {//Funciona
            //System.out.println(aux);
        //}
        
    }
    
}
