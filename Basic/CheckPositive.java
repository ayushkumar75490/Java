import java.util.*;
public class CheckPositive{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner s =new Scanner (System.in);
        int no = s.nextInt();
        if(no<0){System.out.println("negative no");}
        else if(no>0){System.out.println("positive no");}
        else{System.out.println("neither positive nor negative ");}
    }
}
