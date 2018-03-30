package week_3;

/**
 * Created by Konstantin on 20.03.2018.
 */
public class Animal {

    private String animal_type;
    private String name;
    private double age;
    private static int animal_count;

    public Animal(){
        animal_count++;
    }

    public Animal(  String a_type, String a_name,  double a_age) {
        this.animal_type = a_type;
        this.name = a_name;
        this.age = a_age;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
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

    void voice(){}
}
