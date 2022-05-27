package singleton.ejercicio;

public class Tesis {
    private String horaDeRegistro;
    private Estudiante estudiante;
    private String tema;

    public Tesis(Estudiante estudiante,String tema){
        this.estudiante=estudiante;
        this.tema= tema;
    }


    public String getHoraDeRegistro() {
        return horaDeRegistro;
    }

    public void setHoraDeRegistro(String horaDeRegistro) {
        this.horaDeRegistro = horaDeRegistro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    public void showInfo(){

        System.out.println("Autor: "+estudiante.getNombre());
        System.out.println("CI: "+estudiante.getCi());
        System.out.println("Hora registro: "+getHoraDeRegistro());
        System.out.println("Tema: "+getTema());



    }
}
