package week_3;

/**
 * Created by Konstantin on 20.03.2018. WITH CORRECT
 */
public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String a_name, double a_age) {
        super(a_name, a_age);
    }

    @Override
        void voice() {
            System.out.println("Гав");
        }
}
