/*

Больше соседей

Дан массив, состоящий из целых чисел. Напишите программу, которая в данном массиве определит количество элементов, у которых два соседних и, при этом, оба соседних элемента меньше данного.
Входные данные

Сначала задано число N — количество элементов в массиве (3 ≤ N ≤ 100). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
Выходные данные

Необходимо вывести количество элементов массива, у которых два соседа и которые при этом строго больше обоих своих соседей.

Sample Input 1:

5
1 2 3 4 5

Sample Output 1:

0

Sample Input 2:

6
1 5 1 5 1 7

Sample Output 2:

2

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
        int count = 0;
        for (int i = 2; i < n;i++) {
            if ((arr[i - 2] < arr[i -1]) && (arr[i - 1] > arr[i]) ) count++;
        }
        System.out.println("" + count);
    }
}