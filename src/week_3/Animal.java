package week_3;

/**
 * Created by Konstantin on 20.03.2018.  WITH CORRECT
 */
public class Animal {
 
    private String name;
    private double age;
    private static int animal_count;

    public Animal(){
        animal_count++;
    }

    public Animal(  String a_name,  double a_age) {
        this.name = a_name;
        this.age = a_age;

    }

    public int getAnimal_count() {
         return animal_count;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
               "animal_type='" + getClass().getSimpleName() + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    void voice(){}
}
