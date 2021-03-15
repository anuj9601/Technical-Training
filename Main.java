//tail & head recursion
import java.util.Scanner;
public class Main{
    public static void faunt(int n){
        if(n==0)
        {
            System.out.println( n);
        }
        else{
            faunt(n-1);
            System.out.println(n + " ");
            
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