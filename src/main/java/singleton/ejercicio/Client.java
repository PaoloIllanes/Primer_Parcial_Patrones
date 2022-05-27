package singleton.ejercicio;

public class Client {
    public static void main(String[]args){

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Tesis tesis1 = new Tesis(new Estudiante("Jose",45435),"Tema1");
                TesisManager.getInstance().registrarTesis(tesis1);

            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Tesis tesis2 = new Tesis(new Estudiante("Juan",34324),"Tema2");
                TesisManager.getInstance().registrarTesis(tesis2);

            }
        });

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Tesis tesis3 = new Tesis(new Estudiante("Diego",432423),"Tema3");
                TesisManager.getInstance().registrarTesis(tesis3);

            }
        });

        Thread hilo4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Tesis tesis4 = new Tesis(new Estudiante("Pablo",432432),"Tema1");
                TesisManager.getInstance().registrarTesis(tesis4);

            }
        });

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }
}
