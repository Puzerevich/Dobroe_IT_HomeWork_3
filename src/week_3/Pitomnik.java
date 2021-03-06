package week_3;

import java.util.Objects;

/**
 * Created by Konstantin on 27.03.2018. WITH CORRECT
 */
public class Pitomnik {

    private Animal[] animals = new Animal[8];
    private Animal[] newSpaciousArrayForAnimals;
    private int indexArrayAnimals = 0;


    public void addAnimals(Animal animal) {
        if (animal!=null) {
            if (animals.length != indexArrayAnimals) {
                animals[indexArrayAnimals] = animal;
                indexArrayAnimals++;
            } else {
                int addSizeSpace = indexArrayAnimals + 10;
                newSpaciousArrayForAnimals = new Animal[addSizeSpace];
                for (int i = 0; i < newSpaciousArrayForAnimals.length; i++) {
                    newSpaciousArrayForAnimals[i] = animals[i];

                }
                animals = newSpaciousArrayForAnimals;
                animals[indexArrayAnimals] = animal;
                indexArrayAnimals++;
            }
          //  System.out.println("TEST: " + newSpaciousArrayForAnimals[i].getName());
        }
    }

    public void printAnimals(Pitomnik cl, int begAge, int endAge){
        for (int i = 0; i < animals.length; i++) {
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
            if(animals[i]!=null)
            System.out.println(animals[i].toString());
        }
    }

    public void printAllAnimals(Pitomnik shelter) {
          for (int i = 0; i < shelter.animals.length; i++) {
              System.out.println(shelter.animals[i].toString());
        }
    }
}
