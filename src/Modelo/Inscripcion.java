package Modelo;
public class Inscripcion {

    private int id_Inscripto;

    private int nota;

    private Alumno alumno;

    private Materia materia;

    public Inscripcion(int nota, Alumno alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion(int id_Inscripto, int nota, Alumno alumno, Materia materia) {
        this.id_Inscripto = id_Inscripto;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion() {
    }

    public int getId_Inscripto() {
        return id_Inscripto;
    }

    public void setId_Inscripto(int id_Inscripto) {
        this.id_Inscripto = id_Inscripto;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.alumno = Alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Id-Inscripto: " + id_Inscripto + " |Nota: " + nota + " |Id_Alumno: " + alumno.getId_Alumno() + " |Id_Materia: " + materia.getId_Materia();
    }

}
