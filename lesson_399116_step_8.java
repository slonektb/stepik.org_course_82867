/*

Сумма

Вводится список (сначала количество элементов, потом сами элементы). Найдите сумму всех элементов и выведите её. А потом выведите введённые числа в обратном порядке.

Sample Input:

4
1
2
3
4

Sample Output:

10
4
3
2
1

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
            sum = sum + arr[i];
        }
        System.out.println("" + sum);

        for (int i = n-1;i >= 0;i--) {
            System.out.println("" + arr[i]);
        }
    }
}







                       
                    
                       















