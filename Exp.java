class Anotherclass{}
class Exp extends Anotherclass {
    public static void main(String[]args)
    {
        Exp d = new Exp();
        System.out.println(d instanceof Exp);
        System.out.println(d instanceof Anotherclass );
        //true
    }
}
