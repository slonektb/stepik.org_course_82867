/*

Вам есть 21?

Вася приехал в Америку и он оооооочень любит кофе. В Америке приобрести этот напиток можно лишь лицам достигшим  возраста 21 год. Напишите программу, которая считает возраст Васи и выведет ответ ("Да"/"Нет") на вопрос: попьёт ли Вася сегодня кофе? 

Sample Input:

18

Sample Output:

Нет

*/
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       if (n >= 21 ) {
           System.out.println("Да");
       }else {
           System.out.println("Нет");
       }
    }
}