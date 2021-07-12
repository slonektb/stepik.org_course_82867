/*

Повторение Строк

Напишите программу, которая считает строку и определит, есть ли в ней именно слово "повторение". Слово может быть написано как с маленькой, так и с большой буквы.  Гарантируется, что знаки препинания из текста были удалены. На экран выведите YES/NO.

Sample Input:

Повторение мать учения

Sample Output:

YES

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        boolean f = false;
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].equalsIgnoreCase("повторение")) {
                f = true;
            }
        }
        System.out.println((f)?"YES":"NO");
    }
}