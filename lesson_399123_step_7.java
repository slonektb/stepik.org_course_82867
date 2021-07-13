/*

Строка и Столбец

Вводятся 2 натуральных числа: n и m. Затем вводится двумерный массив размером n*m. Определите, есть в ней строка и столбец, произведение элементов которой равно 15. Выведите на экран два ответа "YES/NO" построчно.

Sample Input:

3 4
1 1 3 5
4 6 7 8
-5 6 3 4

Sample Output:

YES
NO

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] num = new int[n][m];
        for (int i = 0;i < n; i++) {
            for (int j = 0;j < m;j++){
                num[i][j] = sc.nextInt();
            }
        }
        int sum = 1;
        boolean f = false;
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < m;j++){
                sum = sum * num[i][j];
            }
            f = (sum == 15)?true:f;
            sum = 1;
        }
        System.out.println((f)?"YES":"NO");
        f = false;
        for (int j = 0;j < m;j++) {
            for (int i = 0;i < n;i++){
                sum = sum * num[i][j];
            }
            f = (sum == 15)?true:f;
            sum = 1;
        }
        System.out.println((f)?"YES":"NO");

    }
}