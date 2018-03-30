package week_3;

/**
 * Created by Konstantin on 30.03.2018.
 */
public class Pitomnik {

    private Animal[] animals = new Animal[5];
    private Animal[] newSpaciousArrayForAnimals;
    private int indexArrayAnimals = 0;

    public void add(Animal animal) {
        if (animal==null){
            return;
        }
        if (animals.length != indexArrayAnimals) {
            animals[indexArrayAnimals] = animal;
            indexArrayAnimals++;
        } else {
            int addSizeSpace = indexArrayAnimals + 10;
            newSpaciousArrayForAnimals = new Animal[addSizeSpace];
            for (int i = 0; i < animals.length; i++) {
                newSpaciousArrayForAnimals[i] = animals[i];
            }
            animals = newSpaciousArrayForAnimals;
            animals[indexArrayAnimals] = animal;
            indexArrayAnimals++;
        }
    }
    public void print(Class  clazz, int startOfRange, int endOfRange) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i]==null){
                break;
            }
            if (animals[i].getClass().equals(clazz)) {
                double age = animals[i].getAge();
                if (age >= startOfRange && age <= endOfRange) {
                    System.out.println(animals[i]);
                }
            }
        }
    }

    public void printAllAnimals() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
