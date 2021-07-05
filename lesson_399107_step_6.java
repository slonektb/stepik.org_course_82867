/*

Гипотенуза

Вводится два целых числа - длины катетов прямоугольного треугольника. Найдите гипотенузу этого треугольника. Если вы не знаете, как это сделать, то вот вам полезная ссылка

Sample Input:

3 4

Sample Output:

5.0

*/

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(sqrt(pow(a,2)+pow(c,2)));
    }
}