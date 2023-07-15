package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Task task = new Task();
        task.getSum(35443);

        int[] forArray1 = new int[]{234,12,34,54,2,3};
        task.getArray(forArray1);

        String school = "школа";
        task.getLastSymbol(school);
        System.out.println(task.getLastSymbol(school));
    }

}
