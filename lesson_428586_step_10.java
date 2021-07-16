/*

Число секунд

Напишите функцию second_count, которая принимает как целочисленные аргументы количество дней, часов, минут и секунд, которые прошли со времён какого - либо момента. Ваша функция должна вернуть одно целое число - количество секунд, которое прошло с того момента.  Содержание функции main менять запрещено.

Sample Input:

0
1
1
15

Sample Output:

Секунд прошло: 3675

*/

import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        System.out.println("Секунд прошло: " + second_count(d, h, m, s));
    }
    static int second_count(int d,int h,int m,int s) {
         return d*86400 + h*3600 + m*60 + s;
    }
}