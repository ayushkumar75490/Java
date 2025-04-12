public class Fibonacci{
    public static void main(String[] args){
        int num = 7;
        System.out.println("table of Fibonacci series :- " +num);
        int first = 0, second = 1;
        int third;
        System.out.println(first+" ");
        System.out.println(second+" ");
        for ( int i=2 ;i<num; i++){   
            third = first + second;
            first=second;
            second=third;
            System.out.println(third+" ");
        }

    }
}
