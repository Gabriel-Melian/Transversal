/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.*;

/**
 *
 * @author Gabriel
 */
public class InscripcionData {
    
    private Connection con;
    
    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    public void inscribirAlumno(Inscripcion inscripcion) {//Funciona
        
        String sql = "INSERT INTO inscripcion(nota, id_Alumno, id_Materia) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getId_Alumno());
            ps.setInt(3, inscripcion.getMateria().getId_Materia());
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inscripcion.setId_Inscripto(rs.getInt(1));
            } else {
                System.out.println("No se pudo realizar la inscripcion.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        
    }
    
    public void actualizar(int nota, int id_Inscripto) {//Funciona
        
        String sql = "UPDATE inscripcion SET nota=? WHERE id_Inscripto=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nota);
            ps.setInt(2, id_Inscripto);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo la inscripcion correctamente.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Error al actualizar inscripcion.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        
    }
    
    public void eliminar(int id_Inscripto) {//Funciona
        
        String sql = "DELETE FROM inscripcion WHERE id_Inscripto=?";
        
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_Inscripto);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la inscripcion.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        
    }
    
    public ArrayList<Inscripcion> buscarInscripciones(int id_Inscripto) {//Funciona
        
        Inscripcion inscripcion = null;
        Alumno alumno = null;
        Materia materia = null;
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        
        String sql = "SELECT id_Inscripto, inscripcion.id_Alumno, inscripcion.id_Materia, nota\n"
                + "FROM alumno, materia, inscripcion\n"
                + "WHERE alumno.Id_Alumno = inscripcion.id_Alumno\n"
                + "AND materia.id_Materia = inscripcion.id_Materia\n"
                + "AND alumno.Id_Alumno =?";
        
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_Inscripto);
            
            ResultSet rs = ps.executeQuery();
            
            if (!rs.next()) {
                System.out.println("No hay inscripciones con ese IdAlumno");
            } else {
                do {
                    inscripcion = new Inscripcion();
                    alumno = new Alumno();
                    materia = new Materia();
                    
                    inscripcion.setId_Inscripto(rs.getInt("id_Inscripto"));
                    alumno.setId_Alumno(id_Inscripto);
                    materia.setId_Materia(rs.getInt("id_Materia"));
                    inscripcion.setNota(rs.getInt("nota"));
                    inscripcion.setAlumno(alumno);
                    inscripcion.setMateria(materia);
                    inscripciones.add(inscripcion);
                    
                } while (rs.next());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return inscripciones;
        
    }
    
    public ArrayList<Inscripcion> obtenerInscripciones() {//Funciona
        
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        
        String sql = "SELECT * FROM inscripcion";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            Alumno alumno;
            Materia materia;
            
            while(rs.next()) {
                inscripcion = new Inscripcion();
                alumno = new Alumno();
                materia = new Materia();
                inscripcion.setId_Inscripto(rs.getInt("id_Inscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                alumno.setId_Alumno(rs.getInt("id_Alumno"));
                materia.setId_Materia(rs.getInt("id_Materia"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return inscripciones;
        
    }
    
    public ArrayList<Materia> materiasCursadas(int id_Alumno) {//Funciona
        
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT * FROM alumno, materia, inscripcion\n" +
                    "WHERE alumno.id_Alumno = inscripcion.id_Alumno\n" +
                    "AND materia.id_Materia = inscripcion.id_Materia\n" +
                    "AND alumno.id_Alumno=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id_Alumno);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            
            while(rs.next()) {
                materia = new Materia();
                materia.setId_Materia(rs.getInt("id_Materia"));
                materia.setNombre(rs.getString("materia.nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getInt("materia.estado"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return materias;
        
    }
    
    public ArrayList<Materia> materiasNoCursadas(int id_Alumno) {//Funciona
        
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT * FROM materia,alumno WHERE id_Alumno=?\n" +
"                   AND id_Materia NOT IN(\n" +
"                   SELECT materia.id_Materia\n" +
"                   FROM materia JOIN inscripcion ON(materia.id_Materia = inscripcion.id_Materia)\n" +
"                   WHERE id_Alumno=?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id_Alumno);
            ps.setInt(2, id_Alumno);
            
            ResultSet rs = ps.executeQuery();
            Materia materia;
            
            while(rs.next()) {
                materia = new Materia();
                materia.setId_Materia(rs.getInt("id_Materia"));
                materia.setNombre(rs.getString("materia.nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getInt("materia.estado"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return materias;
        
    }
    
    public ArrayList<Alumno> AlumnosXMateria(int id_Materia) {
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        String sql = "SELECT * FROM alumno, materia, inscripcion\n" +
                    "WHERE alumno.id_Alumno = inscripcion.id_Alumno\n" +
                    "AND materia.id_Materia = inscripcion.id_Materia\n" +
                    "AND materia.id_Materia=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_Materia);
            
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setId_Alumno(rs.getInt("id_Alumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setEstado(rs.getInt("estado"));
                alumnos.add(alumno);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return alumnos;
    }
    
}
