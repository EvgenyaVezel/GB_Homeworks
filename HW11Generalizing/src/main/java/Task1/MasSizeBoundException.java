package Task1;

public class MasSizeBoundException extends RuntimeException{

    private static final String EXC_MSG = "В массиве нет элемента %d";

    public MasSizeBoundException(int i) {
       super(String.format(EXC_MSG,i));
    }
}
