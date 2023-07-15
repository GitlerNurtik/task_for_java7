package org.example;

import java.util.Arrays;

public class Task {

    /**
     * В качестве параметра приходит одно число, получить сумму всех чисел из заданной числы.
     *
     * @param a = 345;
     * @return 12;
     */
    public int getSum(int a) {
        int b = 1;
        int count1 = 0;
        int a2 = 0;
        while(a < 0){
            a = a/b;
            count1++;
        }
        for (int i = 0; i < count1; i++) {
            a2+=a/(Math.pow(10,count1));
        }

        return count1;
    }

    /**
     * В качестве параметра приходит массив целых чисел.
     * Вывести на консоль четвертый максимальный элемент.
     *
     * @param array = {5, 9, 4, 12, 20, -2};
     *              Например: четвертый максимальный элемент это 5.
     */
    public void getArray(int[] array) {
        int maxNumber = 0;
        int max2Number = array[1];
        int max3Number = array[1];
        int max4Number = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber += array[i];
            }
        }
        for (int i = 01; i < array.length; i++) {
            if (array[i] > max2Number && max2Number > maxNumber){
                max2Number+=array[i];
        }
            }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max3Number && max3Number > max2Number){
                max3Number+=array[i];
            }}
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max4Number && max4Number > max3Number){
                max4Number+=array[i];
            }}

        System.out.println(max4Number);
    }


    /**
     * В качестве параметра приходит текст,
     * ваша задача вытащить самую последнюю букву в алфавитном порядке.
     *
     * @param text = "Школа"
     * @return "Ш"
     */
    public char getLastSymbol(String text) {
        char[] alphabet = new char[]{'a','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
        char q1 = 0;
        int d1 = 0;
        char[] text1 = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if(text.toCharArray()[d1] == alphabet[i]){
                q1 = alphabet[i];
                d1++;
                i=0;
            }

        }
        return q1;
    }


    /**
     * В качестве параметра приходит массив строк, ваша задача вернуть самую длинную строку.
     *
     * @param wordArray = {delphin, dream, Los_Angeles}
     * @return "Los_Angeles"
     */
    public String getWord(String[] wordArray) {
        return "";
    }


    /**
     * В качестве параметра приходит массив строк,
     * ваша задача вернуть строку, которая повторяется наибольшее количество раз.
     *
     * @param text {ручка, телефон, книга, телефон, ручка, телефон}
     * @return телефон
     */
    public String getMaxDuplicateWord(String[] text) {

        return "";
    }


    /**
     * @param a = 8;
     * @return array = {1,2,3,4,5,6,7,8}
     */
    public String[] buildArray(int a) {
        return new String[0];
    }


    /**
     * В качестве параметра метода приходит текст,
     * ваша задача, если встречается пробел,
     * то следующее слово опустить на новую строку.
     *
     * @param text {Hello world, my name is Mr.Prospector}
     *             Вывод на консоль: hello
     *             world,
     *             my
     *             name
     *             is
     *             Mr.Prospector
     */
    public void method(String text) {

    }


    /**
     * Учитывая массив целых чисел num и целочисленное целевое значение,
     * верните индексы двух чисел таким образом, чтобы они складывались в целевое значение.\
     * Входные данные: array = [2,7,11,15], target = 9
     * Выход: [0,1]
     * Пояснение: Поскольку array[0] + array[1] == 9, мы возвращаем [0, 1].
     *
     * @param array  = {2,7,11,15};
     * @param target = 9;
     * @return {0, 1}.
     */
    public int[] getSum(int[] array, int target) {
        return new int[0];
    }


}
