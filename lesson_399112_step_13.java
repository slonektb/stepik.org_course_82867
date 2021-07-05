/*

Утренняя пробежка

В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
Входные данные

Программа получает на вход действительные числа x и y
Выходные данные

Программа должна вывести одно натуральное число.

Sample Input:

10
20

Sample Output:

9

*/


import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int d = 1;
        while (x < y) {
            d++;
            x = x + x/10;
        }
        System.out.println(""+d);
    }
}








