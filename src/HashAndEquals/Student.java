package HashAndEquals;

public class Student {
    String Name;
    int id;

   public Student(String Name, int id) {
        this.Name = Name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        Student s = (Student) o;

        if(this == s)return true;
        if(!(o instanceof Student))return false;

        return this.id == s.id;
    }

    @Override
    public int hashCode() {
       return id;
    }


}

