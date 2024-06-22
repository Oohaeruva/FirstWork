import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is palindrome or not");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp!=0)
        {
            int d=temp%10;
            rev=rev*10+d;
            temp/=10;

        }
        if(rev==num)
        {
            System.out.println( num+ " is  a palindrome Number");
        }
        else
        {
            System.out.println(num+ " is not a palindrome number");
        }
    }
}
