import java.util.Scanner;
public class head {
    public static void faunt(int n){
        if(n==0)
        {
            System.out.println( n);
        }
        else{
            
            System.out.println(n + " ");
            faunt(n-1);
            
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        sc.close();
        faunt(n);
    }
}
