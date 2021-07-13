/*

Дискриминант

С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения a*x2 + b*x + c = 0 (a != 0). Вычислите дискриминант этого квадратного уравнения и выведите его на экран.

Sample Input:

1
-5
6

Sample Output:

1

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b*b-4*a*c;

        System.out.println("" + d);
    }
}