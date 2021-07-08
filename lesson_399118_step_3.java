/*

Соседи одного знака

Дан массив, состоящий из целых чисел. Напишите программу, которая определяет, есть ли в массиве пара соседних элементов с одинаковыми знаками.
Входные данные

Сначала задано число N — количество элементов в массиве (2 ≤ N ≤ 10000). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
Выходные данные

Необходимо вывести слово YES, если существует пара соседних элементов с одинаковыми знаками. В противном случае следует вывести слово NO.

Sample Input:

5
1 -3 4 -2 1

Sample Output:

NO

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 1; i < n;i++) {
            if (arr[i - 1] * arr[i] > 0) flag = true;
        }
        System.out.println((flag) ? "YES":"NO");
    }
}