/*

Сколько слов?

Маша и Олег играли в игру. Маша читала статьи в газете и выписывала слова, которые начинаются на её любимую букву и заканчиваются на любимую букву её друга Олега. Олег же наоборот - слова, которые начинаются на его любимую букву и заканчиваются на любимую букву Маши. Обратите внимание, что буквы могут быть в разных регистрах (большие/маленькие).
Формат входных данных:

На первой вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены слова, которые написаны в газете. Определите, сколько слов выписали дети.
Формат выходных данных:

На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.  

Sample Input:

а
в
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда

Sample Output:

2
3

*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String ss = sc.nextLine();

        String[] words = ss.split(" ");
        int count_ab = 0;
        int count_ba = 0;

        for(String word : words){
            if (a.equalsIgnoreCase(word.substring(0,1)) && b.equalsIgnoreCase(word.substring(word.length()-1))) {
                count_ab++;
            }
            if (b.equalsIgnoreCase(word.substring(0,1)) && a.equalsIgnoreCase(word.substring(word.length()-1))) {
                count_ba++;
            }
        }

        System.out.println("" + count_ab);
        System.out.println("" + count_ba);
    }
}