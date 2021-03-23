import java.io.IOException;

public class MyArrayDataException extends RuntimeException {
    int i,j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
