/*
Калькулятор. Финал.

Продолжите работу над проектом. Теперь в файле input.txt лежит не одна, а неизвестное количество строк (пример строки описан в задаче Простой калькулятор). Ваша задача - сформировать файл output.txt, в котором для каждой строчки будет лежать ответ вида: "<исходная строка> = <ответ к этой строке>". В качестве ответа пришлите ссылку на git - репозиторий вашего проекта.

Пример:
input.txt 	output.txt

23 + 42

14 - f

15 / 0

45 * 2
	

23 + 42 = 65.0

14 - f = Error! Not number

15 / 0 = Error! Division by zero

45 * 2 = 90.0
https://github.com/slonektb/stepik.org_lesson_457081_step_4

*/
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        String str = "";
        double result = 0;
        /*
            Читаю из файла всё что есть
         */
        try (FileReader reader = new FileReader("input.txt")) {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
            }
            str = String.valueOf(buf);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        /*
            Разбиваю на мссивы и для каждого элемента формирую выводимую строку
         */
        String[] arr = str.split("\r\n\r\n");
        String strOut = "";
        for (int i = 0;i < arr.length;i++) {
            try {
                result = maths(arr[i].split(" "));
                strOut = strOut + arr[i] + " = " + result + "\n\n";
            } catch (Exception ex) {
                strOut = strOut + arr[i] + " = " + ex.getMessage() + "\n\n";
            }
        }

        /*
            Записываю всё в файл
         */
        try(FileWriter writer = new FileWriter("output.txt", false))
        {
            // запись всей строки
            writer.write(strOut);
            // запись по символам
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

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
        } else {
            if (b == 0.0) {
                throw new Exception("Error! Division by zero");
            }
            return a / b;
        }
    }

}
