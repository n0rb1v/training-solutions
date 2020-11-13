package week03;

public class Operation {
    private int leftOp;
    private int rightOp;

    public  Operation(String s) {
        leftOp = Integer.parseInt(s.substring(0,s.indexOf("+")));
        rightOp = Integer.parseInt(s.substring(s.indexOf("+")+1,s.length()));
    }

    public int getResult(){
        return leftOp+rightOp;

    }
}
