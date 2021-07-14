/*

Формула Герона

Площадь треугольника можно вычислить по формуле Герона. Напишите функцию geron, которая по трём действительным числам находит площадь треугольника и выводит её на экран. Если такого треугольника не существует, то выведите на экран "Такого треугольника не существует". Содержимое функции main менять запрещено.

Sample Input:

3
4
5

Sample Output:

6.0

*/

import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        geron(s1, s2, s3);
    }

    //разместите свою функцию, например здесь
    static void geron (double a,double b,double c) {
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("" + ((s > 0)?s:"Такого треугольника не существует"));
    }
}