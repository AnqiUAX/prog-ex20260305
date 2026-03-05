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

    private int buscarPrimerHuecoLibre(){
        int posicionAlumno =-1;
        boolean seguirBuscar = true;

        for(int i = 0; i < MAX_ALUMNOS && seguirBuscar; i++){
            if(alumnos[i] != null){
                posicionAlumno = i;
                seguirBuscar = false;
            }
        }

        return posicionAlumno;
    }

    public boolean registrarAlumno(Alumno alumno){
        boolean alumnoAnadido = false;
        int posicion;

        if (findAlumno(alumno.getId()) == null ) {
            posicion = buscarPrimerHuecoLibre();
            if(posicion >= 0){
                alumnos[posicion] = alumno;
                alumnoAnadido = true;
            }
        }

        return alumnoAnadido;
    }

    public int contarAlumnos() {
        int contador = 0;

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                contador++;
            }
        }

        return contador;
    }


    public String mostrarAlumnos(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < MAX_ALUMNOS; i++){
            if(alumnos[i] != null){
                sb.append(alumnos[i].toString());
            }
        }
        sb.append("\n");

        return sb.toString();
    }


}
