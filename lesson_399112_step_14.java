/*

Сумма цифр натурального числа

Дано натуральное число N. Напишите програму, вычисляющую сумму цифр числа N.

Sample Input:

1234

Sample Output:

10

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = 0;
        while (a > 0) {
            sum = sum + a%10;
            a = a / 10;
        }
        System.out.println(sum);
    }
}













