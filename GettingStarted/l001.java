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

    public static void printDigit(int n){

        int count = countDigit(n);

        while(n!=0){
            int rem = n%count;
        }

    }

    public static void main(String[] args){
        int n = sc.nextInt();
        // System.out.println(countDigit(n));
        printDigitInReverse(n);
    }

}

rouiter.get('/login', abc() , (req, res) => {
    res.render('login')
})

let abc(a,b) => {
    a = 10
    b = 12

    log(a + b)
}

abc(2, 3)
