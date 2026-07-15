package CollectionFramework;

import HashAndEquals.Student;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    private final int id;

    public HashSetEx(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { //provera da li obe reference imaju istu instancu u memoriji
            return true; // ako jesu, vrati odmah true, jer ne zelim da se uporedjujem sa samim sobom
        }

        if (!(o instanceof HashSetEx set)) { // ako objekat o nije tipa HashSetEx, vrati false. Ako jeste, onda nastavi sa proverama. Kada se i ta provera izvrsi, radimo kastovanje objekta, jer smo proverili da je objekat odgovarajuceg tipa.
            return false;
        }

        return id == set.id; // sada uporedi da li su im id jedanki, ako nisu, mozes dodati objeakt u set
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    public static void main(String[] args) {
        HashSet<HashSetEx> hs = new HashSet<>();

        hs.add(new HashSetEx(1));
        hs.add(new HashSetEx(2));
        hs.add(new HashSetEx(3));
        hs.add( new HashSetEx(4));
        hs.add(new HashSetEx(5));
        hs.add(new HashSetEx(5));

//        hs.remove("D");

//        Iterator<HashSetEx> iterator = hs.iterator();
//
//
//        while (iterator.hasNext())
//            System.out.print(iterator.next() + ", ");

        for (HashSetEx h : hs) {
            System.out.println(h.id);
        }

        System.out.println();
    }

}
