import Generics.Repository;

public class Main {
    public static void main(String[] args) {
        Repository <String> repo = new Repository<>();

        repo.add("Java");
        repo.add("Spring");
        repo.printAll();

    }
}
