public class Main
{
	public static void main(String[] args) {
	    int n = 300;
	    if (n%4==0){
	        if (n%100==0){
	            if (n%400==0){
	                System.out.println("leap year " +n);
	            }
	                else{
	                    System.out.println("not a leap year " +n);
	                }
	        }
	            else{
	                System.out.println("leap year " +n);
	            }
	        } 
	        else{
	            System.out.println("not a leap year " +n);
	        }
	}
}
