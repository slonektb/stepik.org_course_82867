/*

Факториал

Напишите рекурсивную функцию factorial, которая принимает как аргумент одно неотрицательное целое число и возвращает его значение. Напоминаю, что 0! = 1.  Содержание функции main менять запрещено.

Sample Input:

5

Sample Output:

120

*/

import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n) {
        if (n==0) {
            return 1;
        } else
            return n * factorial(n-1);
    }

}