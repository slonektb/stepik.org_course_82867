/*

Быстрое возведение в степень (рекурсия)

Напишите функцию быстрого возведения в степень pow. Количество действий должно быть пропорционально двоичному логарифму n.
Входные данные

Вводится 2 числа - a (вещественное) и n (целое неотрицательное).
Выходные данные

Необходимо вывести  значение an.

Решите эту задачу используя рекурсию.

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
        if (n == 0)
            return 1;
        if (n % 2 == 1)
            return pow (a, n-1) * a;
        else {
            double b = pow(a, n/2);
            return b * b;
        }
    }



}