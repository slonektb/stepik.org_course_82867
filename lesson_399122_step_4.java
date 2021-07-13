/*

Словарь синонимов

Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.

Для слова из словаря, записанного в последней строке, определите его синоним.

Вводится число n. Затем 2*n строк.

Sample Input:

3
Hello
Hi
Bye
Goodbye
List
Array
Goodbye

Sample Output:

Bye

*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String,String> map=new HashMap<String,String>();
        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        String a = "";
        String b = "";
        for (int i=0;i<n;i++){
            a = sc.next();
            b = sc.next();
            map.put(a,b);
        }
        String x = sc.next();
        String res = "";

        if (map.get(x) != null) {
            res = map.get(x);
        } else {
        for (Map.Entry<String,String> pair : entrySet) {
            if (x.equals(pair.getValue())) {
                res = pair.getKey(); // нашли наше значение и возвращаем  ключ
            }
        }
        }

        System.out.println(res);
    }
}










                       
                    
                       















