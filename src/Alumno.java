public class Alumno {

    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;

    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTituloFP() {
        return tituloFP;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Alumno{");

        sb.append(String.format("\n id: %d", id));
        sb.append(String.format(" nombre: %s", nombre));
        sb.append(String.format(" tituloFP: %s", tituloFP));
        sb.append(String.format(" edad: %d", edad));
        sb.append("}");

        return sb.toString();

    }

    public boolean updateEdad(int edad) {
        boolean resultado;

        if (edad <= 0 ){
            resultado = false;
        }
        else{
            this.edad = edad;
            resultado = true;
        }
        return resultado;
    }

}
