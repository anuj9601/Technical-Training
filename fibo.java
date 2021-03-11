public class Main
{
  public static void fibo()
  {
    int n = 6;
    int c;
    int var1 = 0;
    int var2 = 1;
    for (int i = 2; i <= n; i++){
      c = var1 + var2;
      var1 = var2;
      var2 = c;
    }
    System.out.println("number present is: " +var2);
  }

  public static void main (String[]args)
  {
      
        fibo();
  }
}
