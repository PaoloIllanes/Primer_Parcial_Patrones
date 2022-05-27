package builder.ejercicio;

import java.util.List;

public class Contrato {
     /*(costo=100bs, empresa=hbo,
listaDeCanales=llenar con algunas peliculas)*/
    private int costo;
    private String empresa;
    private List<String> peliculas;


    public Contrato(){}

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public List<String> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<String> peliculas) {
        this.peliculas = peliculas;
    }

    public void showInfo(){
        System.out.println("Costo: "+costo);
        System.out.println("Costo: "+empresa);
        System.out.println("Peliculas: ");
        for(String peli:peliculas) {
            System.out.println(peli);
        }
        System.out.println("***************");
    }

}
