/*

Что он нам несёт?

Вводятся натуральное число n. Затем вводится двумерный массив. Отобразите его относительно главной диагонали (из левого верхнего угла до правого нижнего) и выведите на экран (через пробел).

Sample Input:

4
1 2 3 8
4 6 7 8
2 6 3 4
5 9 3 0

Sample Output:

1 4 2 5 
2 6 6 9 
3 7 3 3 
8 8 4 0 

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n;i++) {
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        for (int j = 0; j < m; j++) {
            for  (int i = 0; i < n;i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}