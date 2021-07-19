/*

Исключающее ИЛИ

Напишите функцию xor реализующую функцию "Исключающее ИЛИ" двух логических переменных x и y. Функция Xor должна возвращать true, если ровно один из ее аргументов x или y, но не оба одновременно равны true.
Входные данные

Вводится 2 числа - x и y (x и y равны 0 или 1, 0 соответствует значению false, 1 соответствует значению true).
Выходные данные

Необходимо вывести false или true - значение функции от x и y.

Содержание функции main менять запрещено.

Sample Input:

1
0

Sample Output:

true

*/
import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() == 0 ? true : false;
        boolean s = sc.nextInt() == 0 ? true : false;
        System.out.println(xor(f, s));
    }
    static boolean xor (boolean a, boolean b) {
        if ((a && b) || (!a && !b)) return false;
        return true;
    }
}