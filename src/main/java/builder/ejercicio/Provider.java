package builder.ejercicio;

public class Provider {
    private BuilderContrato builder;

    public Contrato getContratoProcesado(){
        return builder.getProduct();
    }

    public  void setBuilder(BuilderContrato builder){
        this.builder= builder;

    }

    public void procesarContrato(){
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildListaDeCanales();
    }
}
