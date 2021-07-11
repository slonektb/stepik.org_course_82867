/*

Кого больше?

Вводится строка, определите, каких символов в ней больше: цифр или букв? Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter". Если же их равное количество, то выведите слово "Equal".

Sample Input:

34Hi56

Sample Output:

Digit

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int charCount = 0;
        int digitCount = 0;
        char temp;
        for (int i = 0;i < str.length();i++) {
            temp = str.charAt(i);

            if (Character.isLetter(temp)) {
                charCount++;
            } else if (Character.isDigit(temp)) {
                digitCount++;
            }
        }
        System.out.println((charCount == digitCount) ? "Equal":((charCount>digitCount)?"Letter":"Digit"));
    }
}