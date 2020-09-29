import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int random =(int)(Math.random() * 6) + 1;
        return random;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] x = new int[]{ 0,0,0,0,0,0,0,0,0,0,0 };
        int y = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                y += rollDie();
            }
            x[y - 2] += 1;
            y = 0;
        }
        return x;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type how many pair of dice would you like to roll:"); 
        int roll = sc.nextInt();
        int[] sum = sumOfTwoDice(roll);
        for (int i = 0; i < 11; i++){
            double total = sum[i];
            double percent = total / roll * 100;
            int counter = i + 2;
            System.out.println("% of rolls where sum == " + counter + ": " + percent);
        }
        sc.close();
    }
}
