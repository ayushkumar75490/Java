public class Armstrong{
    public static void main(String[] args){
        int n = 153;
        System.out.println("check number is Armstrong := "+n);

        int rem, ans=0, num=n;
        while(num>0){
            rem = num%10;
            ans = ans + (rem*rem*rem);
            num =num/10;
        }
        if(n!=ans){
            System.out.println(n+" is not Armstrong number");
        }else{
            System.out.println(n+" is Armstrong number ");
        }
    }
}