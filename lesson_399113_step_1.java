/*

Повторение 1

Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.

Sample Input:

3
7
2
9

Sample Output:

18

*/


import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n;i++) {
            sum = sum + sc.nextInt();
        }
        System.out.println(""+sum);
    }
}
















