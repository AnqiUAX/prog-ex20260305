public class CentroFP {

    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    public CentroFP(int max_alumnos) {
        MAX_ALUMNOS = max_alumnos;
        alumnos = new Alumno[MAX_ALUMNOS];
    }

    public Alumno findAlumno(int idAlumno) {
        boolean seguirBuscar = true;
        Alumno alumnoEncontrado = null;

        for(int i = 0; i < MAX_ALUMNOS && seguirBuscar; i++){
            if(alumnos[i] != null && alumnos[i].getId() == idAlumno){
                alumnoEncontrado = alumnos[i];
                seguirBuscar = false;
                alumnoEncontrado = alumnos[i];
            }
        }
        return alumnoEncontrado;
    }


}
