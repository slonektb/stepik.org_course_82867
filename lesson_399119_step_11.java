/*

Просто соедини их

Вводится число n, затем n строчек, которые необходимо соединить. После вводится ещё одна строка - которая должна быть в качестве разделителя. Выведите одну строку - все введённые выше слова через разделитель.

Sample Input:

5
Привет
это
курсы
по
Java
-

Sample Output:

Привет-это-курсы-по-Java

*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] str = new String[a];
        for (int i = 0; i < a; i++) {
            str[i] = sc.next();
        }
        String splitter = sc.next();

        System.out.println(String.join(splitter,str));
    }
}
         






















                       
                    
                       















