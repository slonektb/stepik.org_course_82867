/*

Таблица умножения

Вводятся 2 натуральных числа: n и m. Выведите на экран таблицу умножения от n*m через пробел.  

Sample Input:

3
4

Sample Output:

1 2 3 4 
2 4 6 8 
3 6 9 12 

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int col = 1;
        int row = 1;
        for (int i = 0; i < n;i++) {
            for (int j = 0; j < m; j++){
                arr[i][j] = col * row;
                row++;
            }
            col++;
            row = 1;
        }


        for (int i = 0; i < n;i++) {
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

















                       
                    
                       















