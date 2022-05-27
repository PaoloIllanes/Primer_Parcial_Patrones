package builder.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class ContratoAmazon extends BuilderContrato{
    @Override
    public void buildCosto() {
        this.contrato.setCosto(50);
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("AWS");

    }

    @Override
    public void buildListaDeCanales() {
        List<String> peliculas= new ArrayList<>();
        peliculas.add("invincible");
        peliculas.add("ted");
        peliculas.add("batman");
        this.contrato.setPeliculas(peliculas);

    }
}
