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
    
    private MateriaData materiaData;
    
    private AlumnoData alumnoData;
    
    public InscripcionData() {
        con = Conexion.getConexion();
        materiaData = new MateriaData();
        alumnoData = new AlumnoData();
    }
    
    public void inscribirAlumno(Inscripcion inscripcion) {//Funciona
        
        String sql = "INSERT INTO inscripcion(nota, id_Alumno, id_Materia) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getId_Alumno().getId_Alumno());
            ps.setInt(3, inscripcion.getId_Materia().getId_Materia());
            
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
                    inscripcion.setId_Alumno(alumno);
                    inscripcion.setId_Materia(materia);
                    inscripciones.add(inscripcion);
                    
                } while (rs.next());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return inscripciones;
        
    }
    
}