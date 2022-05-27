package prototype.ejercicio;

public class CelularA1 implements ICelular{
    /*modelo,
    tamaño,
    peso,
    cámara (foco,lente) ,
    imei,
    origen. El primer celular : modelo=A1 , Peso=60 ,
    Cámara (foco=10,lente= 5mp) imei=10001 , paisCreado= Bolivia*/
    private String modelo;
    private String tamano;
    private int peso;
    private String camara;
    private int imei;
    private String paisCreado;

    public CelularA1(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getPaisCreado() {
        return paisCreado;
    }

    public void setPaisCreado(String paisCreado) {
        this.paisCreado = paisCreado;
    }

    @Override
    public Object clone() {
        CelularA1 clone = new CelularA1();
        clone.setCamara(this.getCamara());
        clone.setImei(this.getImei());
        clone.setModelo(this.getModelo());
        clone.setPeso(this.getPeso());
        clone.setTamano(this.getTamano());
        clone.setPaisCreado(this.getPaisCreado());
        return clone;


    }

    public void showInfo(){
        System.out.println("Camara: "+getCamara());
        System.out.println("Imei: "+getImei());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Peso: "+getPeso());
        System.out.println("Tamano: "+getTamano());
        System.out.println("Pais de crecion: "+getPaisCreado());
        System.out.println("******************************");

    }
}
