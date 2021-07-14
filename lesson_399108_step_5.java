/*

Какое слово длиннее?

Напишите функцию twoWords, которая принимает две строки и сравнивает их длины. После чего выводит на экран либо "Первая строка длиннее", либо "Вторая строка длиннее", либо "Равная длина". Содержание функции main менять запрещено.

Sample Input:

Привет!
Пока(

Sample Output:

Первая строка длиннее

*/

import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        twoWords(s1, s2);
    }

    //разместите свою функцию, например здесь
        static void twoWords(String s1, String s2) {
        System.out.println((s1.length() > s2.length()) ? "Первая строка длиннее": ((s1.length() < s2.length())?"Вторая строка длиннее":"Равная длина"));
    }
}