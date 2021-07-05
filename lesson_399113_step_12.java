/*

Геометрическая прогрессия

По данному действительному числу a и натуральному n вычислите сумму 1+a+a2+...+an, не используя формулу суммы геометрической прогрессии. Время работы программы должно быть пропорционально n.
Входные данные

Вводятся 2 числа - a и n.
Выходные данные

Необходимо вывести  значение суммы.

Sample Input:

2
2

Sample Output:

7

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        int n = sc.nextInt();
        double sum = 1 + a;
        for (int i = 2;i <= n;i++) {
            sum = sum + Math.pow(a,i);
        }
        System.out.println("" + (int)sum);
    }
}












