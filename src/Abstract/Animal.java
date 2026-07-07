package Abstract;

public abstract class Animal {

   String name;
   abstract void makeSound();

    public Animal(String name) {
    this.name = name;
    }

    public void sleep()
    {
        System.out.println(name + " is Sleeping");
    }

    public static void main (String[] args){
        Animal goldRetriver  = new Dog("Zlatni retriver");
        goldRetriver.makeSound();
        Animal siamianCat = new Cat("Sam Sam");
        siamianCat.makeSound();
        siamianCat.sleep();
    }
}

 class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

  @Override void makeSound(){
      System.out.println("Abstract.Dog");
  }
 }

 class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override void makeSound(){
        System.out.println("Abstract.Cat");
    }
 }

