package builder.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class ContratoHBO extends BuilderContrato{
    @Override
    public void buildCosto() {
        this.contrato.setCosto(100);
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("HBO");

    }

    @Override
    public void buildListaDeCanales() {
        List<String> peliculas= new ArrayList<>();
        peliculas.add("gotham");
        peliculas.add("wanda vision");
        peliculas.add("logan");
        this.contrato.setPeliculas(peliculas);

    }
}
