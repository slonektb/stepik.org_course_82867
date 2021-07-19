/*

Возведение в степень

Напишите функцию возведения числа в степень pow. 
Входные данные

Вводится 2 числа - a (вещественное) и n (целое неотрицательное).
Выходные данные

Необходимо вывести  значение an.

Пользоваться функцией pow из библиотеки Math запрещено. Содержание функции main менять запрещено.

Sample Input:

2
5

Sample Output:

32.0

*/

import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }
        static double pow (double a,int n) {
        double sum = 1;
        for (int i=1;i<=n;i++) {
            sum = sum * a;
        }
        return sum;
    }
}