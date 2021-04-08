package Testing;

public class SolveTask2
{
    //region Метод для решения задачи №2
    public boolean method(int[] inputArray)
    {
        boolean existOne = false;
        boolean existFour = false;

        // Выявление единиц и четверок в массиве
        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i] == 1)
            {
                existOne = true;
            }
            if (inputArray[i] == 4)
            {
                existFour = true;
            }
            if ((existOne == true) && (existFour == true))
            {
                break;
            }
        }

        // Вывод результата
        if ((existOne == true) && (existFour == true))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //endregion
}
