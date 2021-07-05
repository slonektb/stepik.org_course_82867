/*

Упорядочить три числа

Дано три числа, записанный в отдельных строках. Упорядочите их в порядке неубывания. Программа должна считывать три числа a, b, c, затем программа должна менять их значения так, чтобы стали выполнены условия a <= b <= c, затем программа выводит тройку a, b, c.
Входные данные

Вводятся три числа, каждое записано в отдельной строке.
Выходные данные

Выведите ответ на задачу.

Sample Input:

2
6
-4

Sample Output:

-4 2 6

*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int buf = 0;

        if (a > b) {
            buf = a;
            a = b;
            b = buf;
        }
        if (b > c) {
            buf = b;
            b = c;
            c = buf;
        }
        if (a > b) {
            buf = a;
            a = b;
            b = buf;
        }
        System.out.println(a + " " + b + " " + c);
    }
}