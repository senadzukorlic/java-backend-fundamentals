package Generics;

import java.util.ArrayList;
import java.util.List;

public class Repository<T>{
    List<T> items = new ArrayList<>();

   public void add(T element){
        items.add(element);
    }

  public  void printAll(){
        for(T element : items){
            System.out.println(element);

        }
    }
}