package Task1;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;

public class MainClassTest {


    @Test
    public void testException(){
        int[]m = {1,1,1,1,1,1};
        Executable executable = () -> MainClass.changeMass(m);
        Assertions.assertThrows(ValueNotFoundException.class, executable);
    }

    @Test
    public void changeMasTestTrue(){
        int[]mOrigin = {1,5,6,9,4,7,8,3};
        int[]mResult = {7,8,3};

        Assertions.assertArrayEquals(mResult, MainClass.changeMass(mOrigin));
    }

    @Test
    public void changeMasTestSome4(){
        int[]mOrigin = {1,4,4,9,4,7,1,3};
        int[]mResult = {7,1,3};

        Assertions.assertArrayEquals(mResult, MainClass.changeMass(mOrigin));
    }

    @Test
    public void changeMasTestFalse(){
        int[]mOrigin = {1,4,4,9,4,7,1,3};
        int[]mResult = {9,4,7};

        Assertions.assertFalse(Arrays.equals(mResult, MainClass.changeMass(mOrigin)));
    }

}