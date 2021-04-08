import Testing.SolveTask2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolveTask2Test
{
    private SolveTask2 solveTask2 = new SolveTask2();
    private int[] inputArray1 = {1, 4, 5, 4, -1, 3};
    private int[] inputArray2 = {1, 1, 1, 2, 3, 5};
    private int[] inputArray3 = {4, 4, 5, 6, 7, 8};
    private int[] inputArray4 = {2, 3, 5, 6, 7, 8};

    @Test
    public void method2_1()
    {
        Assert.assertEquals(true, solveTask2.method(inputArray1));
    }

    @Test
    public void method2_2()
    {
        Assert.assertEquals(false, solveTask2.method(inputArray2));
    }

    @Test
    public void method2_3()
    {
        Assert.assertEquals(false, solveTask2.method(inputArray3));
    }

    @Test
    public void method2_4()
    {
        Assert.assertNotEquals(true, solveTask2.method(inputArray4));
    }
}