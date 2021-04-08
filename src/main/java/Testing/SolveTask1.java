package Testing;

import java.util.Arrays;

public class SolveTask1
{
    public int[] inputArray;

    public SolveTask1(int[] _inputArray)
    {
        this.inputArray = new int[_inputArray.length];
        for (int i = 0; i < _inputArray.length; i++)
        {
            this.inputArray[i] = _inputArray[i];
        }
    }

    //region Метод для решения задачи №1
    public int[] method() throws Exception
    {
        // Анализ входного массива
        int positionLast4 = -1;
        for (int i = 1; i < inputArray.length; i++)
        {
            if (inputArray[i] == 4) {
                positionLast4 = i;
            }
        }

        // Обработка ошибок:
        // 1) при отсутствии числа 4 в водимом массиве;
        // 2) если число 4 окажется последним числом в исходном массиве.
        if (positionLast4 == -1)
        {
            throw new RuntimeException("Ошибка в задаче №1: В исходном массиве " + Arrays.toString(inputArray) + " отсутствует число 4.");
        }
        if (positionLast4 == inputArray.length - 1)
        {
            throw new RuntimeException("Ошибка в задаче №1: В исходном массиве" + Arrays.toString(inputArray) + " за последним числом 4 больше нет других чисел.");
        }

        // Формирование выходного массива
        int[] outputArray = new int[inputArray.length - positionLast4 - 1];
        for (int i = positionLast4 + 1; i < inputArray.length; i++)
        {
            outputArray[i - positionLast4 - 1] = inputArray[i];
        }

        return outputArray;
    }
    //endregion
}
