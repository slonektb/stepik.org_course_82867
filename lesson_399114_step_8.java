/*

Последовательность

Маша занималась обработкой больших и не очень больших данных. На её компьютер время от времени приходили числа и она хотела понять, каких больше: кратных 3, или отрицательных. Помогите Маше с её вопросом.

Вводятся целые числа до тех пор, пока не будет введён 0.

Если больше чисел, кратных 3, то выведите "333", если больше отрицательных чисел, то выведите "negative", если их одинаковое количество, то выведите "Equal".

Sample Input 1:

3
6
7
-3
5
1
2
0

Sample Output 1:

333

Sample Input 2:

-5
-6
2
7
-4
0

Sample Output 2:

negative

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        int count333 = 0;
        int countNeg = 0;
        while (n!=0) {
            n = sc.nextInt();
            count333 = ((n%3 == 0) && (n!=0)) ? count333 + 1 : count333;
            countNeg = (n < 0) ? countNeg + 1 : countNeg;
        }
        if (count333 > countNeg) {
            System.out.println("333");
        } else if (count333 < countNeg) {
            System.out.println("negative");
        } else {
            System.out.println("Equal");
        }
    }
}








                       
                    
                       















