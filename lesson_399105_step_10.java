/*

Площадь и периметр

На одной строчке через запятую записаны два целых числа: длина и ширина прямоугольника. Вычислите его площадь и периметр (именно в таком порядке). Результат выведите на разных строках.

Sample Input:

5 10

Sample Output:

50
30

*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new  Scanner (System.in);
        int a = scanner.nextInt();
		int b = scanner.nextInt();
        System.out.println("" + (a*b));
        System.out.println("" + (a+b)*2);
    }
}