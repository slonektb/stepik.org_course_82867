/*

Min и Max

Задача на поиск минимума и максимума. Пользователь вводит натуральное число n, затем n целых чисел. Необходимо определить и вывести на экран минимальное и максимальное из них

Sample Input:

5
6
10
-7
13
4

Sample Output:

-7
13

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arrN = new int[n];

        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }

        // Calling getMin() method for getting min value
        int min = getMin(arrN);
        System.out.println(min);
        
        int max = getMax(arrN);
        System.out.println(max);


    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method for getting the minimum value
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}





























