/*

Тот же кофе

Решите первую задачу из этого урока, используя тернарный оператор.

Условие:

Вася приехал в Америку и он оооооочень любит кофе. В Америке приобрести этот напиток можно лишь лицам достигшим  возраста 21 год. Напишите программу, которая считает возраст Васи и выведет ответ ("Да"/"Нет") на вопрос: попьёт ли Вася сегодня кофе? 

Sample Input:

18

Sample Output:

Нет

*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n>=21) ? "Да" : "Нет");
    }
}