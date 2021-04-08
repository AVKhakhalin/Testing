package Testing;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Arrays;
import java.util.logging.*;

public class MainApp
{
    public static void main(String[] args)
    {
        /*Домашнее задание №14 студента GeekBrains Хахалина Андрея Владимировича
            Задача №1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
            Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
            Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
            Написать набор тестов для этого метода (по 3-4 варианта входных данных).
            Вх: [1 2 4 4 2 3 4 1 7] -> вых: [1 7].

            Задача №2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false;
            Написать набор тестов для этого метода (по 3-4 варианта входных данных).
            [1 1 1 4 4 1 4 4] -> true
            [1 1 1 1 1 1] -> false
            [4 4 4 4] -> false
            [1 4 4 1 1 4 3] -> false
        */

        Logger logger = Logger.getLogger(MainApp.class.getName());
        try
        {
            LogManager.getLogManager().readConfiguration(MainApp.class.getResourceAsStream("/config/logging.properties"));
//            Handler fh = new FileHandler(new File("").getAbsolutePath() + "/application_log.txt");
//            Handler fh = new FileHandler("%t/application_log.txt");
//            logger.getLogger("").addHandler(fh);
//        System.out.println(new File("").getAbsolutePath());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //region Демонстрация работоспособности метода для решения задачи №1
        // Вариант 1
        try
        {
            int[] inputArray1 = {1, 2, 5, 0, -1, 3};
            SolveTask1 solveTask1_1 = new SolveTask1(inputArray1);
            System.out.println("РЕШЕНИЕ ЗАДАЧИ №1\nВариант 1 исходного массива: " + Arrays.toString(inputArray1));
            System.out.println("Результат работы метода: " + Arrays.toString(solveTask1_1.method()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            logger.log(Level.INFO, "Exception: ", e);
        }
        System.out.println();

        // Вариант 2
        try
        {
            int[] inputArray2 = {1, 2, 5, 0, -1, 3, 4};
            SolveTask1 solveTask1_2 = new SolveTask1(inputArray2);
            System.out.println("Вариант 2 исходного массива: " + Arrays.toString(inputArray2));
            System.out.println("Результат работы метода: " + Arrays.toString(solveTask1_2.method()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            logger.log(Level.INFO, "Exception: ", e);
        }
        System.out.println();

        // Вариант 3
        try
        {
            int[] inputArray3 = {1, 4, 5, 4, -1, 3};
            SolveTask1 solveTask1_3 = new SolveTask1(inputArray3);
            System.out.println("Вариант 3 исходного массива: " + Arrays.toString(inputArray3));
            System.out.println("Результат работы метода: " + Arrays.toString(solveTask1_3.method()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            logger.log(Level.INFO, "Exception: ", e);
        }
        System.out.println();

        // Вариант 4
        try
        {
            int[] inputArray4 = {1, 4, 5, 2, -1, 3};
            SolveTask1 solveTask1_4 = new SolveTask1(inputArray4);
            System.out.println("Вариант 3 исходного массива: " + Arrays.toString(inputArray4));
            System.out.println("Результат работы метода: " + Arrays.toString(solveTask1_4.method()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            logger.log(Level.INFO, "Exception: ", e);
        }
        System.out.println();
        //endregion

        //region Демонстрация работоспособности метода для решения задачи №2
        SolveTask2 solveTask2 = new SolveTask2();
        // Вариант 1
        int[] inputArray5 = {1, 4, 5, 4, -1, 3};
        System.out.println("РЕШЕНИЕ ЗАДАЧИ №2\nВариант 1 исходного массива: " + Arrays.toString(inputArray5));
        System.out.println("Результат работы метода: " + solveTask2.method(inputArray5));

        // Вариант 2
        int[] inputArray6 = {1, 1, 1, 2, 3, 5};
        System.out.println("\nВариант 2 исходного массива: " + Arrays.toString(inputArray6));
        System.out.println("Результат работы метода: " + solveTask2.method(inputArray6));

        // Вариант 3
        int[] inputArray7 = {4, 4, 5, 6, 7, 8};
        System.out.println("\nВариант 3 исходного массива: " + Arrays.toString(inputArray7));
        System.out.println("Результат работы метода: " + solveTask2.method(inputArray7));

        // Вариант 4
        int[] inputArray8 = {2, 3, 5, 6, 7, 8};
        System.out.println("\nВариант 4 исходного массива: " + Arrays.toString(inputArray8));
        System.out.println("Результат работы метода: " + solveTask2.method(inputArray8));
        //endregion
    }
}
