/*

Сортировка по длине строки

Напишите функцию sortByLength,  которая принимает как аргумент строку и сортирует её по длине слова. Если длины слов одинаковы, то сортировать в алфавитном порядке. Содержание функции main менять запрещено.

Sample Input:

cad aba q we qwert

Sample Output:

q we aba cad qwert

*/

import java.util.*;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sortByLength(s);
    }

    //разместите свою функцию, например здесь
        static void sortByLength (String ss) {
        String[] array = ss.split(" ");
        //Arrays.sort(array);    
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i ; j--) {
                if (array[i].length() > array[j].length()){
                    String s = array[j];
                    array[j] = array[i];
                    array[i] = s;
                } else if (array[i].length() == array[j].length()) {
                    String[] bufArr = {array[i],array[j]};
                    Arrays.sort(bufArr);
                    array[j] = bufArr[1];
                    array[i] = bufArr[0];
                }

            }
        }
        String res = "";
        for (int i = 0;i< array.length;i++) {
            res = res + " " + array[i];
        }
        System.out.println(res.trim());
    }
}