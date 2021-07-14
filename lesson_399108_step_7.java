/*

Площадь и периметр

Необходимо написать программу для поиска площади и периметра квадрата или круга. Напишите две функции: perimeter и area, каждая из них принимает строку - название фигуры и одно целое число (либо радиус круга, либо сторону квадрата). Как результат они выводят периметр и площадь фигуры соответственно. В ответ они должны вывести именно целое число (при надобности округлять "вверх", то есть до ближайшего большего целого числа). Содержание функции main менять запрещено. Пи брать как 3.14.

Sample Input 1:

Квадрат
5

Sample Output 1:

20
25

Sample Input 2:

Круг
3

Sample Output 2:

19
29

*/

import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }

    //разместите свои функции, например здесь
        static void perimeter (String s, int a) {
        if (s.equals("Квадрат")) {
            System.out.println("" + (a*4));
        } if (s.equals("Круг")) {
            System.out.println("" + (int)Math.ceil(2*3.14*a));
        }
    }
    static void area (String s, int a) {
        if (s.equals("Квадрат")) {
            System.out.println("" + (a*a));
        } if (s.equals("Круг")) {
            System.out.println("" + (int)Math.ceil(3.14*a*a));
        }
    }
}