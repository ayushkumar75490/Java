import java.util.*;
public class ReverseNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem, ans=0;
        while(n!=0){
            rem = n%10;
            ans = ans*10 + rem;
            n /=10;
        }
        System.out.println("reverse number of given number " +ans);
    }
}
