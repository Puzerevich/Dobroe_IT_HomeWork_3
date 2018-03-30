package week_3;

/**
 * Created by Konstantin on 27.03.2018.
 */
public class Pitomnik {

    private Animal[] animals = new Animal[8];
    private Animal[] newSpaciousArrayForAnimals;
    private int indexArrayAnimals = 0;

    public Pitomnik() {
        super();
    }

    public void addAnimals(Animal animal) {
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
    public void printAnimals(String cl, int begAge, int endAge){
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            if (animals[i] != null) {
                if (animals[i].getClass().getSimpleName().equals(cl)) {
                    double age = animals[i].getAge();
                    if (age >= begAge && age <= endAge) {
                        System.out.println(animals[i].toString());
                    }
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
