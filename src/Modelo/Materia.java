package Modelo;
public class Materia {

    private int id_Materia;

    private String nombre;

    private int anio;

    private int estado;

    public Materia(String nombre, int anio, int estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia(int id_Materia, String nombre, int anio, int estado) {
        this.id_Materia = id_Materia;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia() {
    }

    public int getId_Materia() {
        return id_Materia;
    }

    public void setId_Materia(int id_Materia) {
        this.id_Materia = id_Materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Id-Materia: " + id_Materia + " |Nombre: " + nombre + " |Año: " + anio + " |Estado: " + estado;
    }
    
    
}
