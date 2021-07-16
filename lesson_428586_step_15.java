/*

Простая динамика

На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз, к основанию. Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2. (То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.) Определить число всевозможных "маршрутов" мячика с вершины на землю.

Подсказка: Если ваша программа работает слишком долго, то может использовать кеш?

Sample Input 1:

3

Sample Output 1:

4

Sample Input 2:

10

Sample Output 2:

274

*/

import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(jump(n));
    }

    static int jump(int n) {
        int a = 1;
        int b = 2;
        int c = 4;

        if (n < 3)
            return n;
        int i = 3;
        int aa = 0;
        int bb = 0;
        while (i < n) {
            aa = a;
            bb = b;
            a = b;
            b = c;
            c = aa + bb + c;
            i++;
        }
        return c;
    }

}