package singleton.ejercicio;

public class Estudiante {
    private String nombre;
    private int ci;

    public Estudiante(String nombre,int ci){
        this.ci=ci;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
