/*

Самый часто встречаемый символ

Вводится единственная непустая строка, состоящая исключительно из букв латинского алфавита и пробелов. Определить самую часто встречаемую букву и вывести на экран эту букву и количество её вхождений в строку. Учтите, что буквы могут быть записаны в разном регистре. Если таких букв несколько, то выведите первую по алфавиту.
Примечание

Ответ записывается в нижнем регистре на одной строке через пробел

Sample Input:

a bb a c C c

Sample Output:

c 3

*/

import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxL = 0;
        int tempMax = 0;
        String maxW = "a";
        char temp;
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0;i < chars.length;i++) {
            temp = chars[i];
            if (temp != ' ') {
                tempMax = (str + "\0").split(Character.toString(temp)).length - 1;
                if (maxL < tempMax) {
                    maxL = tempMax;
                    maxW = Character.toString(temp);
                }
            }
        }
        System.out.println(maxW + " " + maxL);
    }
}