package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx {

    public static void main (String[] args){
//        ArrayList<String> gradovi = new ArrayList<>();
//
//        gradovi.add("Novi Pazar");
//        gradovi.add("Sjenica");
//        gradovi.add("Tutin");
//        gradovi.add("Rozaje");
//
//        System.out.println(gradovi.get(0));
//        System.out.println(gradovi.get(gradovi.size()-1));
//        gradovi.set(1,"Bijelo Polje");
//        System.out.println(gradovi.get(1));
//        gradovi.remove(2);
//        for(String i : gradovi){
//            if(gradovi.contains("Bijelo Polje")){
//                System.out.println("sadezi");
//            }
//            System.out.println(i);
//        }

        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(6);
        brojevi.add(7);
        brojevi.add(8);
        brojevi.add(9);
        brojevi.add(10);

        double sum = 0;
        int parni = 0;
        int brNeparnih = 0;
        for(Integer i : brojevi){
            if(i % 2 == 0){
                parni += i;
            } else if (i % 2 != 0) {
                brNeparnih ++;
            }
            sum += i;
        }
        System.out.println(sum);
        int najmanji = Collections.min(brojevi);
        int najveci = Collections.max(brojevi);
        double average = sum/brojevi.size();
        System.out.println(brNeparnih);
    }
}


