package Modelo;
public class Inscripcion {

    private int id_Inscripto;

    private int nota;

    private Alumno id_Alumno;

    private Materia id_Materia;

    public Inscripcion(int nota, Alumno id_Alumno, Materia id_Materia) {
        this.nota = nota;
        this.id_Alumno = id_Alumno;
        this.id_Materia = id_Materia;
    }

    public Inscripcion(int id_Inscripto, int nota, Alumno id_Alumno, Materia id_Materia) {
        this.id_Inscripto = id_Inscripto;
        this.nota = nota;
        this.id_Alumno = id_Alumno;
        this.id_Materia = id_Materia;
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

    public Alumno getId_Alumno() {
        return id_Alumno;
    }

    public void setId_Alumno(Alumno id_Alumno) {
        this.id_Alumno = id_Alumno;
    }

    public Materia getId_Materia() {
        return id_Materia;
    }

    public void setId_Materia(Materia id_Materia) {
        this.id_Materia = id_Materia;
    }

    @Override
    public String toString() {
        return "Id-Inscripto: " + id_Inscripto + " |Nota: " + nota + " |Id-Alumno: " + id_Alumno.getId_Alumno() + " |Id-Materia: " + id_Materia.getId_Materia();
    }

}
