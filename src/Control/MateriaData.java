package Control;

import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Grupo 7
 */
public class MateriaData {
    
    private Connection con;
    
    public MateriaData() {
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia) {//Funciona
        
       String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                materia.setId_Materia(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia creada exitosamente.");
            }
            else {
                JOptionPane.showMessageDialog(null, "No se pudo crear la materia.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia " + ex.getMessage());
        }
        
    }
    
    public void actualizarMateria(Materia materia) {//Funciona
        
        String sql = "UPDATE materia SET nombre=?, anio=?, estado=? WHERE id_Materia=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getEstado());
            ps.setInt(4, materia.getId_Materia());
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo la materia.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Datos invalidos.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia " + ex.getMessage());
        }
        
    }
    
    public Materia buscarMateria(int id_Materia) {//Funciona
        
        Materia materia = null;
        String sql = "SELECT id_Materia, nombre, anio, estado FROM materia WHERE id_Materia=?";
        
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_Materia);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                materia = new Materia();
                materia.setId_Materia(rs.getInt("id_Materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getInt("estado"));
            }
            else {
                JOptionPane.showMessageDialog(null, "La materia no existe.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia " + ex.getMessage());
        }
        return materia;
        
    }
    
    public ArrayList<Materia> buscarMaterias(int estado) {//Funciona
        
        Materia materia = null;
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT id_Materia, nombre, anio, estado FROM materia WHERE estado=?";
        
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                materia = new Materia();
                materia.setId_Materia(rs.getInt("id_Materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getInt("estado"));
                materias.add(materia);
            }
            
            if (materias.isEmpty()) {
                System.out.println("No se encontro ninguna materia.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia " + ex.getMessage());
        }
        return materias;
        
    }
    
    public void desactivar(int id_Materia) {//Funciona
        
        String sql = "UPDATE materia SET estado=0 WHERE id_Materia=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_Materia);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "La materia se dio de baja.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Materia no encontrada.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia " + ex.getMessage());
        }
        
    }
    
    public void borrar(int id_Materia) {
        
        String sql = "DELETE FROM materia WHERE id_Materia=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_Materia);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada correctamente.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Materia no encontrada.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia " + ex.getMessage());
        }
    }
    
    
}
