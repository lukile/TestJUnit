package math;

public class Calculator {
    public Long add(Long a, Long b){
        return a + b;
    }

    public Long substract(Long a, Long b){
        return a - b;
    }

    public Long divide(Long a, Long b){
        if(b.equals(0)){
            throw new OperationException("Division by 0 forbidden");
        }
        return a / b;
    }

    public Long multiplicate(Long a, Long b){
        return a * b;
    }

    public Character readSymbol(){
        return '-';
    }
}
