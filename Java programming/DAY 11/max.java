import java.util.Scanner;
public class max
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > m)
        {
            System.out.println("the maximum number is " + n);
        }
            else
        {
            System.out.println("the maximum number is " + m);
    
        }
    }
}