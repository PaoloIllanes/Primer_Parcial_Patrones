package singleton.ejercicio;

public class ClientNoThreads {
    public static void main(String[]args){

        Tesis tesis1 = new Tesis(new Estudiante("Pablo",432432),"Tema1");
        TesisManager.getInstance().registrarTesis(tesis1);

        Tesis tesis2 = new Tesis(new Estudiante("Juan",4324),"Tema2");
        TesisManager.getInstance().registrarTesis(tesis2);

        Tesis tesis3 = new Tesis(new Estudiante("Pedro",545),"Tema3");
        TesisManager.getInstance().registrarTesis(tesis3);

        Tesis tesis4 = new Tesis(new Estudiante("Jose",56565),"Tema1");
        TesisManager.getInstance().registrarTesis(tesis4);


    }
}
