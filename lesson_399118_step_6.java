/*

Побочная диагональ

Дано число n (n < 10). Создайте массив n×n и заполните его по следующему правилу:
- числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
- числа, стоящие выше этой диагонали, равны 0;
- числа, стоящие ниже этой диагонали, равны 2.
Входные данные

Программа получает на вход число n (1 < n).
Выходные данные

Необходимо вывести  полученный массив. Числа разделяйте одним пробелом.

Sample Input:

4

Sample Output:

0 0 0 1 
0 0 1 2 
0 1 2 2 
1 2 2 2 

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (i + j == n-1) ? 1 : ( (i + j < n - 1) ? 0 : 2);
            }
        }
        for (int i = 0; i < n;i++) {
            for (int j = 0;j < n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}