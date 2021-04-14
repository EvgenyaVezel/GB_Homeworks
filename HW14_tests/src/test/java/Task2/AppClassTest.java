package Task2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class AppClassTest {

    @Test
    public void trueTest() {
        int[] checkMas = {1, 4, 1, 1, 4, 4, 1, 4, 1};
        Assertions.assertTrue(AppClass.checkForAndOne(checkMas));
    }

    @Test
    public void falseTest() {
        int[] checkMas = {1, 4, 1, 1, 4, 4, 1, 4, 2};
        Assertions.assertFalse(AppClass.checkForAndOne(checkMas));
    }

    @Test
    public void failTest() {
        int[] checkMas = {4, 5, 6, 8, 7, 3};
        Assertions.assertTrue(AppClass.checkForAndOne(checkMas));
    }
}
