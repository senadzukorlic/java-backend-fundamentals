package Generics;

import java.util.ArrayList;
import java.util.List;

public class ex <T> {

private T element;

public ex(T element) {
    this.element = element;
}

   public T getValue(){
       return element;
    }

    public void setValue(T element){
    this.element = element;
    }

    public static <T> void print(T value){
    System.out.println(value);
    }


}

