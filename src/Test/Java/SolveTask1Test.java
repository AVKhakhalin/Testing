import Testing.SolveTask1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolveTask1Test
{
    private SolveTask1 solveTask1_1;
    private SolveTask1 solveTask1_2;
    private SolveTask1 solveTask1_3;
    private SolveTask1 solveTask1_4;

    @Before
    public void setup()
    {
        int[] inputArray1 = {1, 2, 5, 0, -1, 3};
        solveTask1_1 = new SolveTask1(inputArray1);
        int[] inputArray2 = {1, 2, 5, 0, -1, 3, 4};
        solveTask1_2 = new SolveTask1(inputArray2);
        int[] inputArray3 = {1, 4, 5, 4, -1, 3};
        solveTask1_3 = new SolveTask1(inputArray3);
        int[] inputArray4 = {1, 4, 5, 2, -1, 3};
        solveTask1_4 = new SolveTask1(inputArray4);
    }

    @Test
    public void method1_1()
    {
        Assert.assertThrows(RuntimeException.class, () ->
        {
            solveTask1_1.method();
        });
    }

    @Test
    public void method1_2()
    {
        Assert.assertThrows(RuntimeException.class, () ->
        {
            solveTask1_2.method();
        });
    }

    @Test
    public void method1_3()
    {
        int[] resArray1_3 = {-1, 3};
        try
        {
            Assert.assertArrayEquals(resArray1_3, solveTask1_3.method());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void method1_4()
    {
        int[] resArray1_4 = {4, 5, 2, -1, 3};
        try
        {
            Assert.assertNotEquals(resArray1_4, solveTask1_4.method());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
