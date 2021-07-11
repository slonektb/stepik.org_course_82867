/*

Интересный перевод

Ввод и вывод данных производятся через стандартные потоки ввода-вывода.

На планете Роботов очень не любят десятичную систему счисления, поэтому они попросили Вас написать программу, которая заменяет все встречающиеся в тексте числа на эти же числа, но в двоичной системе счисления.
Входные данные

Единственная строка, состоящая из любых символов. Длина строки не превышает 255 символов. Гарантируется, что во всех числах нет ведущих нулей.
Выходные данные

Выведите преобразованную строку.

Sample Input:

2+4

Sample Output:

10+100

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = 0;
        char temp;
        char[] chars = str.toCharArray();
        String result = "";
        String resTemp = "";
        for (int i = 0;i < chars.length;i++) {
            temp = chars[i];
            if (Character.isDigit(temp)) {
                resTemp = resTemp + temp;
                if (i == chars.length-1 || !Character.isDigit(chars[i+1])) {
                    a = Integer.parseInt(resTemp);
                    resTemp = "";
                    while(a > 0) {
                        if(a%2 == 0) resTemp = "0" + resTemp;
                        else resTemp = "1" + resTemp;
                        a = a/2;
                    }
                    result = result + resTemp;
                    resTemp = "";
                }
            } else {
                result = result + temp;
            }
        }
        System.out.println(result);
    }
}