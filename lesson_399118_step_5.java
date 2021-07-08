/*

Сортировка массива

Дан массив, состоящий из целых чисел. Напишите программу, которая отсортирует его по возрастанию.
Входные данные

Сначала задано число N — количество элементов в массиве (1 ≤ N ≤ 100). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
Выходные данные

Необходимо вывести отсортированный по возрастанию массив.
Комментарий

Существует ооооочень большое количество различных сортировок. Самая простая из них - сортировка "пузырьком".

Sample Input:

7
3 4 2 5 8 9 2

Sample Output:

2 2 3 4 5 8 9

*/


import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}