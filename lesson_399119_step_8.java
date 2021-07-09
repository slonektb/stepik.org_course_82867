/*

Строки

Дана строка.

Сначала выведите третий символ этой строки.

Во второй строке выведите предпоследний символ этой строки.

В третьей строке выведите первые пять символов этой строки.

В четвертой строке выведите всю строку, кроме последних двух символов.

На пятой строке выведите всю строку, кроме первых 3 символов.

На шестой строке выведите длину данной строки.

Гарантируется, что вводится строчке, состоящая не менее, чем из 5 символов.

Sample Input:

ABCDEFGHI

Sample Output:

C
H
ABCDE
ABCDEFG
DEFGHI
9

*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        System.out.println(""+n.substring(2,3));
        System.out.println(""+n.substring(n.length()-2,n.length()-1));
        System.out.println(""+n.substring(0,5));
        System.out.println(""+n.substring(0,n.length()-2));
        System.out.println(""+n.substring(3));
        System.out.println(""+n.length());
    }
}
