import java.io.IOException;

public class MyArrayDataException extends RuntimeException {

    private static final String EXC_MSG = "В строке %d и в столбце  %d не удалось преобразовать строку в число";

    public MyArrayDataException(int i, int j) {
       super(String.format(EXC_MSG, i,j));
    }
}
