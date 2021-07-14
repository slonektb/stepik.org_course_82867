/*

Максимин

На вход вашей функции maximin даётся зубчатый двумерный массив (сначала даётся число  n - количество строк, а потом сами строки). Найдите максимальное значение среди минимальных элементов каждой строки. Содержание функции main менять запрещено.

Как бонус вы можете посмотреть на код считывания неизвестного количества чисел в строке.

Sample Input:

4
1 2 4 3 5
3 2 4 4
6 5 3 4 6 7 5
1 2 1 2 1 2 2 1 1

Sample Output:

3

*/

import java.util.*;

class Example{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        maximin(mas);
    }

    //разместите свою функцию, например здесь
    static void maximin (int[][] ss) {
        int max = -1000;
        int min = 1000;
        for (int i = 0;i < ss.length;i++) {
            Arrays.sort(ss[i]);
            min = ss[i][0];
            if (max < min) {
                max = min;
            }
            min = 1000;
        }

        System.out.println("" + max);
    }
}