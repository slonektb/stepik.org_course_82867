/*

Повторение 2

Пользователь вводит с клавиатуры натуральное число n. Затем вводит целых n чисел. Необходимо найти и вывести на экран количество чётных.

Sample Input:

3
7
2
9

Sample Output:

1

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            if (b%2 == 0) {
                sum ++;
            }
        }
        System.out.println(sum);
    }
}






















