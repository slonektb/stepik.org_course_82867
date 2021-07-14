/*

Простые числа на промежутке

Напишите функцию simpleAB, которая принимает 2 натуральных числа a и b (a <= b) и анализирует все числа на промежутке от a до b включительно на их простоту. Она должна вывести на экран для каждого числа строку вида "{число} - {простое/составное/1}". Содержание функции main менять запрещено.

Sample Input:

1
6

Sample Output:

1 - 1
2 - простое
3 - простое
4 - составное
5 - простое
6 - составное

*/

import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x, y);
    }

    //разместите свои функции, например здесь
   static void simpleAB (int a, int b) {
        boolean f;
        for (int i = a;i <= b;i++) {
            f = true;
            for (int j = 2; j < i;j++) {
                if (i%j == 0) {
                    f = false;
                    break;
                }
            }
            if (i == 1 ) {
                System.out.println("1 - 1");
            } else if (f) {
                System.out.println(i + " - простое");
            } else {
                System.out.println(i + " - составное");
            }
        }
    }
}