/*

Сумма

Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.

Sample Input:

1
3

Sample Output:

6

*/

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        while (a <= b) {
            sum = sum + a;
            a++;
        }
        System.out.println(""+sum);
    }
}


