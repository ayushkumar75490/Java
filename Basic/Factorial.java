import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        int fac=1,num=n;
        while(num>=1){
           fac = fac*num;
           num -=1;
        }
        System.out.println("factorial of "+n+" is :-"+fac);
    }
}