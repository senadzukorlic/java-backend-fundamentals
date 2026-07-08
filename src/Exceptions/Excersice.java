package Exceptions;

public class Excersice {
    int a ;
    int b ;

    public  Excersice(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void operation (int a, int b) {

        try{
          int res=   a/b;
        }catch (ArithmeticException e){
        System.out.println("Expception caught " + e);
        }
    }
}
