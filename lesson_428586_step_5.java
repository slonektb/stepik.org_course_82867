/*

Есть ли 0?

Напишите функцию find_0, которая принимает на вход двумерный массив целых чисел и возвращает в ответ индекс первой строчки, на которой встретился 0. Если такой строки нет, то возвращает значение -1. Содержание функции main менять запрещено.

Sample Input:

4
1 2 4 3 5
3 2 4 4
6 5 0 4 6 7 5
1 2 1 2 1 2 2 1 1

Sample Output:

0 in 3 line

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
        int ans = find_0(mas);
        if (ans != -1)
            System.out.println("0 in " + (ans+1) + " line");
        else
            System.out.println("0 not found");
    }

    //разместите свою функцию, например здесь
        static int find_0 (int[][] mass) {
        for (int i = 0;i < mass.length;i++) {
            Arrays.sort(mass[i]);
            if (mass[i][0] == 0) return i;
        }
        return -1;
    }
}