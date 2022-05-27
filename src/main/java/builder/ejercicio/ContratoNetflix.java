package builder.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class ContratoNetflix extends BuilderContrato{
    @Override
    public void buildCosto() {
        this.contrato.setCosto(150);
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("Netflix");

    }

    @Override
    public void buildListaDeCanales() {
        List<String> peliculas= new ArrayList<>();
        peliculas.add("forest gump");
        peliculas.add("stranger things");
        peliculas.add("chernobyl");
        this.contrato.setPeliculas(peliculas);

    }
}
