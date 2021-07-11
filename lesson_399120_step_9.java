/*

Самое длинное слово

Вводится единственная строка без знаков препинания. Определите длину самого длинного слова в ней.

Sample Input:

Это самое длинное слово здесь

Sample Output:

7

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int maxL = 0;
        for (String word : words) {
            if (maxL < word.length()) {
                maxL = word.length();
            }
        }
        System.out.println("" + maxL);
    }
}