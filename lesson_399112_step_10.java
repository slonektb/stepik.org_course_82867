/*

Чётные числа

Вводятся целые числа a и b. Гарантируется, что a не превосходит b.

Выведите все четные числа от a до b (включительно).

Sample Input:

1 
9

Sample Output:

2
4
6
8

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}








