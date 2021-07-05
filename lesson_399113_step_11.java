/*

Произведение

Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет). Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".

Для того, чтобы превратить String в другой тип данных используйте конструкцию подобную этой:
 

String s = "45";
int n = Integer.parseInt(s); //в переменной n окажется число 45

Sample Input:

3
0
2
4
СТОП

Sample Output:

24

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        int sum = 1;
        int i = 0;
        while (true) {
            a = sc.nextLine();
            if (a.equals("СТОП")) {
                break;
            } else {
                int b = Integer.parseInt(a);
                if (b != 0) {
                    sum = sum * b;
                    i = 1;
                }
            }
        }

        if (i == 0) {
            System.out.println("Не найдено");
        } else {
            System.out.println(sum);
        }
    }
}












