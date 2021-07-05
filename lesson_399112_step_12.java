/*

Сумма квадратов

По данному натуральному n вычислите сумму 12+22+...+n2.

Sample Input:

3

Sample Output:

14

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=a;i++) {
            sum = sum + i*i;
        }
        System.out.println(sum);
    }
}








