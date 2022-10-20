package pro.sky.java.course2.calculator.exceptions;

public class DivisionByZeroException extends IllegalArgumentException {

    public DivisionByZeroException(String s) {
        super(s);
    }

    public DivisionByZeroException() {
        super();
    }

}
