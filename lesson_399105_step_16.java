/*

Улитка

Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?

Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.

Программа должна вывести одно натуральное число.

Sample Input 1:

10
3
2

Sample Output 1:

8

Sample Input 2:

20
7
3

Sample Output 2:

5

*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        sum = (1 + (h - b - 1)/(a - b));

        System.out.println("" + sum);
    }
}