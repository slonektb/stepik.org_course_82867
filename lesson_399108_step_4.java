/*

Произведение трёх чисел

Напишите функцию multiply, которая будет принимать в себя три целых числа и распечатывать на строке их произведение. Содержание функции main менять запрещено.

Sample Input:

2
3
4

Sample Output:

24

*/

import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        multiply(a, b, c);
    }

    //разместите свою функцию, например здесь
    static void multiply(int a, int b, int c) {
        System.out.println("" + (a*b*c));    
    }
}