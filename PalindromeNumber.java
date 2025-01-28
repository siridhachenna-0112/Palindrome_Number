import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,sum=0;
        int temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is a palindrome");
        }
        else{
            System.out.println(temp+ " is not a palindrome");
        }
        sc.close();
    }
        
}
