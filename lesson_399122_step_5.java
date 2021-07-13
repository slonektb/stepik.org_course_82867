/*

Что ты сказал?

Вводится натуральное число n, затем n слов на разных строках. Определите, какое слово встречается чаще всего. Гарантируется, что такое слово одно. Все слова вводятся в нижнем регистре на русском языке.

Sample Input 1:

6
да
я
прикалывался 
просто
да
успокойся

Sample Output 1:

да

Sample Input 2:

9
просто
будь
собой
просто
будь
весел
просто
будь
добр
будь

Sample Output 2:

будь

*/


import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> list = new ArrayList();

        String a = "";
        String res = "NO";
        while(sc.hasNext()){
        //for (int i=0;i<=n;i = i + 1){
            try {
                a = sc.next();
            } catch(Exception e) {
                break;
            }
            list.add(a);
            res = a;
        }
        Map<String, Long> frequency =
                list.stream().collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
        long i = 1;
        for (Map.Entry<String,Long> pair : frequency.entrySet()) {
            if ( i < pair.getValue()) {
                i = pair.getValue();
                res = pair.getKey(); // нашли наше значение и возвращаем  ключ
            }
        }

        System.out.println(res);
    }
}