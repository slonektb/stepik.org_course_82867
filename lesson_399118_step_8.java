/*

Магический квадрат

Напишите программу, которая проверяет, является ли квадратная матрица магическим квадратом?
Входные данные

Программа получает на вход число n < 11, являющееся числом строк и столбцов в массиве. Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.
Выходные данные

Программа должна выводить слово YES для магического квадрата и слово NO для не магического.

Sample Input 1:

3
2 7 6
9 5 1
4 3 8

Sample Output 1:

YES

Sample Input 2:

4
1 2 3 4
5 6 7 8
9 3 4 5
3 2 1 5

Sample Output 2:

NO

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean f = isMagic(arr,n);
        System.out.println((f) ? "YES":"NO");
    }

    public static boolean isMagic(int[][] a, int m){
        int sum = 0;
        int temp_sum = 0;
        for (int i = 0; i < m; i++)
            sum += a[i][i];
        for (int i = 0; i < m; i++)
            temp_sum += a[i][m - i - 1];
        if (sum != temp_sum)
            return false;
        for (int i = 0; i < m; i++) {
            temp_sum = 0;
            for (int j = 0; j < m; j++)
                temp_sum += a[i][j];
            if (sum != temp_sum)
                return false;
            temp_sum = 0;
            for (int j = 0; j < m; j++)
                temp_sum += a[j][i];
            if (sum != temp_sum)
                return false;
        }
        return true;
    }
}