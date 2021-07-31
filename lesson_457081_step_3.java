/*

Простой калькулятор

Пользователь вводит одну строку, в которой должно быть записано простое арифметическое выражение вида "a <операция> b", где a и b - какие-то действительные числа, а операция - один из символов "+", "-", "*", "/". Ваша задача - выполнить вычисление, если это возможно. Гарантируется, что в введённой строке ровно 2 пробела (значение пробел значение пробел значение) В результате работы могут произойти различные ошибки. Их нужно обработать следующим образом: 

    Если одно из чисел не является числом, то вывести на экран "Error! Not number"
    Если вместо знака операции было введено любое другое значение, то выведите "Operation Error!"  
    Если произошла попытка деления на ноль, то выведите на экран "Error! Division by zero"

Обрабатывать исключения необходимо в указанном выше порядке.

Sample Input 1:

35 + 14

Sample Output 1:

49.0

Sample Input 2:

123 - 34r

Sample Output 2:

Error! Not number

*/
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double result;
        try {
            result = maths(str.split(" "));
            System.out.println("" + result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static double maths (String[] arg) throws Exception{
        double a;
        double b;

        try {
            a = Double.parseDouble(arg[0]);
            b = Double.parseDouble(arg[2]);
        } catch (NumberFormatException e) {
            throw new Exception("Error! Not number");
        }


        if (!arg[1].equals("+") && !arg[1].equals("-") && !arg[1].equals("*") && !arg[1].equals("/")) {
            throw new Exception("Operation Error!");
        }

        if (arg[1].equals("+")) {
            return a + b;
        } else if (arg[1].equals("-")) {
            return a - b;
        } else if (arg[1].equals("*")) {
            return a * b;
        } else if (arg[1].equals("/")) {
            if (b == 0.0000) {
                throw new Exception("Error! Division by zero");
            }
            return a / b;
        } else return 0;
    }


}
