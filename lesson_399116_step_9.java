/*

Сумма 2

Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.

Sample Input:

4
1
2
3
4

Sample Output:

4
1
3

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
            sum = (i%2==0) ? sum + arr[i]:sum;
        }
        System.out.println("" + sum);

        for (int i = 0;i < n;i++) {
            if (i%2 == 0) System.out.println("" + arr[i]);
        }
    }
}







                       
                    
                       















