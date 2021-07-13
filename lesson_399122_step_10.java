/*

Количество слов

Дан текст: в первой строке записано число строк, далее идут сами строки. Определите, сколько различных слов содержится в этом тексте.

Словом считается последовательность непробельных символов идущих подряд, слова разделены одним или большим числом пробелов или символами конца строки.

Sample Input:

4
She sells sea shells on the sea shore;
The shells that she sells are sea shells I'm sure.
So if she sells sea shells on the sea shore,
I'm sure that the shells are sea shore shells.

Sample Output:

19

*/


import java.util.HashSet;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> words = new HashSet<String>();
        String str = "";
        for (int i = 0; i < n;i++) {
            str = sc.nextLine();
            String[] s = str.split(" ");
            for (int j = 0;j < s.length;j++) {
                words.add(s[j]);
            }
        }
        System.out.println("" + words.size());
    }
}
