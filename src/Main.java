
public class Main {
    public static void main(String[] args) {
        CentroFP centroFP = new CentroFP(20);

        Alumno alumno1 = new Alumno(1,"Juan","DAW",18);

        Alumno alumno2 = new Alumno(2,"Alex","DAM",19);

        System.out.println(centroFP.buscarAlumno(1));

        System.out.println(centroFP.registrarAlumno(alumno1));
        System.out.println(centroFP.registrarAlumno(alumno2));

        System.out.println(centroFP.mostrarAlumnos());
        System.out.println(centroFP.contarAlumnos());
    }
}