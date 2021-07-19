/*

Голосование

Напишите "функцию голосования" election,  возвращающую то значение (true или false), которое среди значений ее аргументов x, y, z встречается чаще.
Входные данные

Вводится 3 числа - x, y и z (x, y и z равны 0 или 1, 0 соответствует значению false, 1 соответствует значению true).
Выходные данные

Необходимо вывести  значение функции от x, y и z.

Содержание функции main менять запрещено.

Sample Input 1:

0
0
1

Sample Output 1:

false

Sample Input 2:

1
1
0

Sample Output 2:

true

*/
import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() == 1 ? true : false;
        boolean s = sc.nextInt() == 1 ? true : false;
        boolean t = sc.nextInt() == 1 ? true : false;
        System.out.println(election(f, s, t));
    }
    static boolean election (boolean a, boolean b, boolean c) {
        if ((a && b) || (a && c) || (b && c)) return true;
        return false;
    }
}