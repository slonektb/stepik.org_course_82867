/*

Нормальный вид

Вводятся 2 натуральных числа: n и m. Затем вводится через пробел n*m целых чисел. Сохраните их в табличном виде и выведите на экран (разделитель - пробел).

Sample Input:

2 
3
2 5 89 12 4 -7

Sample Output:

2 5 89 
12 4 -7 

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


        for (int i = 0; i < n;i++) {
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}