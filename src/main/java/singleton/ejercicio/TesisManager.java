package singleton.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class TesisManager {
    private static TesisManager tesisManager;
    private List<Tesis> registro ;
    private TesisManager(){
        registro= new ArrayList<>();
    }

    private synchronized static void multiThradControl(){
        if (tesisManager==null){
            tesisManager= new TesisManager();
        }
    }

    public static TesisManager getInstance(){
        if(tesisManager==null){
            multiThradControl();
        }
        return tesisManager;
    }

    public synchronized void registrarTesis(Tesis tesis) {
        if(registro.isEmpty()) {
            registro.add(tesis);
            tesis.showInfo();
        }else{
            register(registro,tesis);

        }
    }
    public synchronized void register(List<Tesis> lista,Tesis tesis){
        for (Tesis t : lista) {
            if (t.getTema().equals(tesis.getTema())) {
                System.out.println("Esta tesis es duplicada");

            } else {
                tesis.setHoraDeRegistro(java.time.LocalDateTime.now().toString());
                lista.add(tesis);
                tesis.showInfo();

            }

        }
    }

}
