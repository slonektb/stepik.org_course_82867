/*

Сумма чисел, заканчивающихся на 7 или 3

С клавиатуры вводятся 2 числа: a и b соответственно. Необходимо найти сумму всех чисел от a до  b включительно, заканчивающихся на 3 или 7. 

Sample Input:

10
30

Sample Output:

80

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        while (a <= b) {
            if (a%10 == 3 || a%10 == 7) sum = sum + a;
            a++;
        }
        System.out.println("" + sum);
    }
}