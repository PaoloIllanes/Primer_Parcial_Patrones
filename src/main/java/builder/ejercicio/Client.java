package builder.ejercicio;

public class Client {
    public static void main(String[]args) {

        Provider proveedor = new Provider();
        BuilderContrato contratoAmazon = new ContratoAmazon();
        BuilderContrato contratoHBO = new ContratoHBO();
        BuilderContrato contraoNetflix = new ContratoNetflix();

        proveedor.setBuilder(contratoAmazon);
        proveedor.procesarContrato();
        Contrato contrato1 = proveedor.getContratoProcesado();
        contrato1.showInfo();

        proveedor.setBuilder(contratoHBO);
        proveedor.procesarContrato();
        Contrato contrato2 = proveedor.getContratoProcesado();
        contrato2.showInfo();

        proveedor.setBuilder(contraoNetflix);
        proveedor.procesarContrato();
        Contrato contrato3 = proveedor.getContratoProcesado();
        contrato3.showInfo();

    }
}
