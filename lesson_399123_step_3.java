/*

Сколько корней?

С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения a*x2 + b*x + c = 0 (a != 0).  Определите, сколько корней будет у этого уравнения. Выведите на экран одно число - количество корней уравнения.

Sample Input:

1
-5
6

Sample Output:

2

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b*b-4*a*c;

        System.out.println("" + ((d > 0)?2:(d == 0)?1:0));
    }
}