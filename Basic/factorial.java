import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) 
        nt n =sc.nextInt();
        nt fac=1,num=n;
        hile(num>=1){
           fac = fac*num;
           num -=1;
        
        ystem.out.println("factorial of "+n+" is :-"+fac);
        
    }
}