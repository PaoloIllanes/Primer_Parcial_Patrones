package interpreter.ejercicio;


public class Addition extends OperationM {

    public Addition(int digit){
        this.digit=digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("+")){
            context.signo="+";
            context.input=context.input.substring(this.digit);
        }

    }
}
