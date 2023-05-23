/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class AlumnoData {
    
    private Connection con;
    
    public AlumnoData() {
        con = Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno) {//Funciona
        
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fecha_nacimiento, estado) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFecha_nacimiento()));
            ps.setInt(5,alumno.getEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                alumno.setId_Alumno(rs.getInt(1));
            }
            else {
                System.out.println("El Alumno no se pudo guardar.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno " + ex.getMessage());
        }
        
    }
    
    public void actualizarAlumno(Alumno alumno) {
        
        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fecha_nacimiento=?, estado=? WHERE id_Alumno=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFecha_nacimiento()));
            ps.setInt(5,alumno.getEstado());
            ps.setInt(6, alumno.getId_Alumno());
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo el alumno.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Datos invalidos.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno " + ex.getMessage());
        }
        
    }
    
    public Alumno buscarAlumno(int id_Alumno) {//Funciona
        
        Alumno alumno = null;
        String sql = "SELECT id_Alumno, dni, apellido, nombre, fecha_nacimiento, estado FROM alumno WHERE id_Alumno=?";
        
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_Alumno);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setId_Alumno(rs.getInt("id_Alumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("Apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setEstado(rs.getInt("estado"));
            }
            else {
                System.out.println("Alumno no encontrado.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno " + ex.getMessage());
        }
        return alumno;
        
    }
    
    public Alumno buscarAlumnoDNI(int dni) {//Funciona
        
        Alumno alumno = null;
        String sql = "SELECT id_Alumno, dni, apellido, nombre, fecha_nacimiento, estado FROM alumno WHERE dni=?";
        
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setId_Alumno(rs.getInt("id_Alumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("Apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setEstado(rs.getInt("estado"));
            }
            else {
                System.out.println("Alumno no encontrado.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno " + ex.getMessage());
        }
        return alumno;
        
    }
    
    public ArrayList<Alumno> buscarAlumnos(int estado) {
        
        Alumno alumno = null;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        String sql = "SELECT id_Alumno, dni, apellido, nombre, fecha_nacimiento, estado FROM alumno WHERE estado=?";
        
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setId_Alumno(rs.getInt("id_Alumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("Apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setEstado(rs.getInt("estado"));
                alumnos.add(alumno);
            }
            
            if (alumnos.isEmpty()) {
                System.out.println("No encontro ningun alumno.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno " + ex.getMessage());
        }
        return alumnos;
        
    }
    
    //El metodo desacticar, solo modifica "estado".
    public void desactivar(int id_Alumno) {
        
        String sql = "UPDATE alumno SET estado=0 WHERE id_Alumno=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_Alumno);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "El alumno se dio de baja.");
            }
            else {
                JOptionPane.showMessageDialog(null, "El alumno no se encontro.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno " + ex.getMessage());
        }
        
        
        
    }
    
    
}
