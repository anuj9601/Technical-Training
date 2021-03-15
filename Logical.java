import java.util.Scanner;
public class Logical{
    public static void main (String[] args){
        int[] bit = {0000,0001,0010,0011,0100,0101,0110,0111,1000,1001,1010,1011,1100,1101,1110,1111};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("enter the operator");
        char op = sc.next().charAt(0);
        sc.close();
        switch(op){
            case '^' :
                if(num1==1 && num2==1)
                {
                    System.out.println("true");
                }
                else
                System.out.println("false");
        }
    }
}