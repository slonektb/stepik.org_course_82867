/*

Факториал

Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n 

n! = 1∙2∙3∙…∙ n.

Sample Input:

5

Sample Output:

120

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
        int sum = 1;
        for (int i=1;i<=a;i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}













