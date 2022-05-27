package interpreter.ejercicio;


public class Client {

    public static void main (String[]args){

        String msg="15 / 5 + 5 + 5 + 5";
        Interpreter parser = new Interpreter(msg);
        System.out.println("msg interpretado operacion matematica: "+parser.evaluateMsg());
    }
}
