/*


Цикл for является более удобным и лаконичным, но есть ряд задач, которые с его помощью решать либо просто неудобно, либо практически невозможно. Вот пример такой программы.
Считывание чисел с клавиатуры

Пользователь с клавиатуры вводит действительные числа до 0. Необходимо вычислить их среднее арифметическое. Гарантируется, что он введёт хотя бы одно ненулевое число.

Sample Input:

1
2
3
0

Sample Output:

2.0

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -1;
        double summ = 0;
        int i = 0;
        while (a != 0) {
            a = sc.nextInt();
            summ = summ + a;
            i++;
        }
        double step = i - 1;
        double midleSumm = summ / step;
        System.out.print(midleSumm);
    }
}








