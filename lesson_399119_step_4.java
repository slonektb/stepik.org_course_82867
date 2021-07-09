/*

Это цифра?

Напишите программу, определяющую, является ли данный символ цифрой или нет.
Входные данные

Задан единственный символ c.
Выходные данные

Необходимо вывести  строку "yes", если символ является цифрой, и строку "no" в противном случае.

Sample Input 1:

8

Sample Output 1:

yes

Sample Input 2:

e

Sample Output 2:

no

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if ((c >= '0') && (c <= '9')) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}