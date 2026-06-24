import java.util.Scanner;
public class even_odd{
    public static void main(Stringargs[])
        {
           Scanner sc = new S   canner(System.in);
           System.out.println("enter the size of the array");
           int n = sc.nextInt();
           int arr[] = newInt();
           if (n==0){
            System.out.println("size of the array NULL");

           }else {
            System.out.println("input the elements");
             
            int  index = 0;
            while(index < n) {
                arr[index] = sc.nextInt();
                index++;
            }
            operation(arr);
           }
        }
    }
    
   static void operation(int[] arr){
    int even = 0;
    int odd = 0;
    for (int a=0; a< arr.length; a++)
    {
        if(arr[a] % 2 == 0 ){
            even++;
{
    else{
        odd++;
    }
}

        }
        System.out.println("no of odd element in the array "+ odd);
        System.out.println("no of even elements in the array is " + even);
     }
 }