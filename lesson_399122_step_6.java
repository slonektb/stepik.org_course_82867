/*

Статистика по Персоналу

Вводится число n. Затем 2*n строк. Каждая пара строк - имя человека и его профессия. Определите, сотрудников какой профессии больше всего. Выведите на экран это количество, профессию и их имена на экран в том же порядке, в котором они вводились. Гарантируется, что будет введено не более 100 сотрудников.

Sample Input:

7
Иван
Токарь
Семён
Программист
Анатолий
Кузнец
Вася
Финансист
Кирилл
Программист
Оля
Программист
Валера
Токарь

Sample Output:

3
Программист
Семён
Кирилл
Оля

*/


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String,String> mapPeople=new LinkedHashMap<String,String>();
        
        List<String> list = new ArrayList();


        String a = "";
        String b = "";
        String res = "";
 //       while(sc.hasNext()){
        for (int i=0;i<n;i = i + 1){
            a = sc.next();
            b = sc.next();
            if (!mapPeople.containsKey(a)) {
                mapPeople.put(a,b);
            }
            list.add(b);
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

        System.out.println(i);
        System.out.println(res);
        Collection<String> collection= mapPeople.keySet();
        for (String key : collection) {
            if (res.equals(mapPeople.get(key))) {
                System.out.println("" + key ); // нашли наше значение и возвращаем  ключ
            }
        }
    }
}
