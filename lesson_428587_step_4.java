/*

Сколько цифр

Дана строка, содержащая цифры и английские буквы (большие и маленькие). Напишите функцию digit_count, которая найдёт количество цифр в этой строке.
Входные данные

Вводится строка ненулевой длины. Известно также, что длина строки не превышает 1000 знаков.
Выходные данные

Выведите количество цифр, которые присутствуют в строке.

Содержание функции main менять запрещено.

Sample Input:

aifun3eIYFI2bisdb45YFybjyFVUVYFV113

Sample Output:

7

*/

import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(digit_count(s));
    }
    static int digit_count (String s) {
       char[] c = s.toCharArray();
       int cD = 0;
       for (int i = 0;i < c.length;i++) {
           if (Character.isDigit(c[i])) cD++;
       }
       return cD;
    }
}