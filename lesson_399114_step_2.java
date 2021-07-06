/*

Повторение на флаги

Вводится количество чисел n, затем n чисел. Необходимо выяснить есть ли среди них такое, которое заканчивается на 4? Если такое число имеется среди введённых выведите на экран слово "Yes", иначе "No".

Sample Input:

5
21
32
45
64
98

Sample Output:

Yes

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;
        boolean is_Four = false;
        for (int i = 0;i < n;i++) {
            j = sc.nextInt();
            if (j > 9) {
                is_Four = (j%((j/10)*10) == 4) ? true:is_Four;
            } else {
                is_Four = (j == 4) ? true:is_Four;
            }

        }
        System.out.println((is_Four) ? "Yes":"No");
    }
}









                       
                    
                       















