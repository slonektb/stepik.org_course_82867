/*

Вспомним for

Напишите программу, которая считает натуральное число n, а затем выведет на экран построчно все числа от 1 до n включительно.

Sample Input:

3

Sample Output:

1
2
3

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i < n;i++) {
            System.out.println("" + (i+1));
        }
    }
}