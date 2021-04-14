package Task1;

public class ValueNotFoundException extends RuntimeException{
    private static final String MSG = "В массиве не найдено ни одного элемента равного %d";
    public ValueNotFoundException(int i) {
        super(String.format(MSG, i));
    }
}
