package prototype.ejercicio;

public class Client {

    public static void main(String[]args){


        CelularA1 template = new CelularA1();
        template.setTamano("5plg");
        template.setPaisCreado("Bolivia");
        template.setModelo("A1");
        template.setImei(0);
        template.setCamara("foco=10,lente= 5mp");
        template.setPeso(120);

        CelularA1 celular1 =(CelularA1) template.clone();
        celular1.setImei(10001);
        celular1.showInfo();
        CelularA1 celular2 =(CelularA1) template.clone();
        celular2.setImei(10002);
        celular2.showInfo();
        CelularA1 celular3 =(CelularA1) template.clone();
        celular3.setImei(10003);
        celular3.showInfo();
        CelularA1 celular4 =(CelularA1) template.clone();
        celular4.setImei(10004);
        celular4.showInfo();
        CelularA1 celular5 =(CelularA1) template.clone();
        celular5.setImei(10005);
        celular5.showInfo();
    }
}
