package Modelo;
import java.time.LocalDate;

public class Alumno {

    private int id_Alumno;

    private int dni;

    private String apellido;

    private String nombre;

    private LocalDate fecha_nacimiento;

    private int estado;

    public Alumno() {
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fecha_nacimiento, int estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = estado;
    }
    
    public Alumno(int id_Alumno, int dni, String apellido, String nombre, LocalDate fecha_nacimiento, int estado) {
        this.id_Alumno = id_Alumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = estado;
    }

    

    public int getId_Alumno() {
        return id_Alumno;
    }

    public void setId_Alumno(int id_Alumno) {
        this.id_Alumno = id_Alumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Id-Alumno: " + id_Alumno + " |DNI: " + dni + " |Apellido: " + apellido + " |Nombre: " + nombre + " |Fecha de Nacimiento: " + fecha_nacimiento + " Estado: " + estado;
    }

    
}
