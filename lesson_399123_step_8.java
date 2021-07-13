/*

Люблю букву А!

Вводится строка. Определите, сколько слов в ней начинается с маленькой или большой буквы а (только русской). Словом считается любая последовательность символов, не содержащая пробелов.

Sample Input:

Алёнка, привет. Выходи к арке

Sample Output:

2

*/

import java.util.Locale;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] s = str.split(" ");
        int count = 0;
        for (int i = 0;i < s.length;i++) {
            if (s[i].substring(0,1).equals("а")) count++;
        }
        System.out.println("" + count);
    }
}