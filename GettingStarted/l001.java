import java.util.*;

public class l001{

    public static Scanner sc = new Scanner(System.in);

    public static int countDigit(int n){
        int count  = 0;
        while(n>0){
            n /=10;
            count++;
        }
        return count;
    }

    public static void printDigitInReverse(int n){

        while(n!=0){
            int rem = n%10;
            n/=10;
            System.out.println(rem);
        }
    }

    public static int powerEqualDigits(int n){
        int pow = 1;
        while(n!=0){
            n/=10;
            pow *= 10;
        }
        return pow;
    }

    public static void countDigitOfNumber(int n){

        int pow = powerEqualDigits(n);
        pow /= 10;

        while(n!=0){
            int digit = n/pow;
            System.out.println(digit);
            n%=pow;
            pow/=10;
        }
    }

    public static void main(String[] args){
        int n = sc.nextInt();
        // System.out.println(countDigit(n));
        // printDigitInReverse(n); 
        
        // System.out.println(powerEqualDigits(n));
        countDigitOfNumber(n);
    }

}