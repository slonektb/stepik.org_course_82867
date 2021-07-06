/*

Поворот на 90

Вводятся 2 натуральных числа: n и m. Затем вводится двумерный массив. Поверните его на 90 градусов по часовой стрелке и выведите на экран (через пробел).

Sample Input:

3
4
1 2 3 8
4 6 7 8
-5 6 3 4

Sample Output:

-5 4 1 
6 6 2 
3 7 3 
4 8 8 

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n;i++) {
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        for (int j = 0; j < m; j++) {
            for  (int i = n-1; i >= 0;i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}