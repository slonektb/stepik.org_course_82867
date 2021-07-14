/*

Простое число

Напишите функцию simple, которая принимает одно целое число и определяет, является ли число простым и выводит на экран ответ: "YES"/"NO". Содержание функции main менять запрещено.

Sample Input:

3
4
19

Sample Output:

YES
NO
YES

*/

import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simple(a);
        simple(b);
        simple(c);
    }

    //разместите свою функцию, например здесь
    static void simple (int a) {
        boolean f = true;
        for (int i = 2;i < a;i++) {
            if (a%i == 0) {
                f = false;
                break;
            }
        }
        f = (a == 1)?false:f;
        System.out.println((f)?"YES":"NO");
    }
}