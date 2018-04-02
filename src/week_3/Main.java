package week_3;

import java.util.Arrays;

/**
 * Created by KOS on 18.03.2018. WITH CORRECT
 */

public class Main {

    public static void main(String[] args) {

//(Task 1) Create class and subclasses

        System.out.println("BEGIN TASK #1");
        Animal dog1 = new Dog("Шарик",0.4);
        Animal dog2 = new Dog("Гуффи",1.2);
        Animal dog3 = new Dog("Мопсик",5.0);
        Animal dog4 = new Dog("Жучка",8.2);
        Animal dog5 = new Dog("Жирик",9.1);

        System.out.print(dog1.toString());  dog1.voice();
        System.out.print(dog2.toString());  dog2.voice();
        System.out.print(dog3.toString());  dog3.voice();
        System.out.print(dog4.toString());  dog4.voice();
        System.out.print(dog5.toString());  dog5.voice();

        System.out.println("");
        Animal cat1 = new Cat("Аякс",0.7);
        Animal cat2 = new Cat("Базилио",1.0);
        Animal cat3 = new Cat("Барсик",3.0);
        Animal cat4 = new Cat("Пуфик",7.2);
        Animal cat5 = new Cat("Феликс",8.1);

        System.out.print(cat1.toString());  cat1.voice();
        System.out.print(cat2.toString());  cat2.voice();
        System.out.print(cat3.toString());  cat3.voice();
        System.out.print(cat4.toString());  cat4.voice();
        System.out.print(cat5.toString());  cat5.voice();

        System.out.println("\nВсего создано объектов: " + cat1.getAnimal_count());

//(Task 2) Create array of animal

        System.out.println("\nBEGIN TASK #2");
        Animal[] animal_arr = new Animal[5];
            animal_arr[0] = dog1;
            animal_arr[1] = dog3;
            animal_arr[2] = cat1;
            animal_arr[3] = cat3;
            animal_arr[4] = cat5;

        System.out.println("\nArray of animals:\n");
        for (int i = 0; i < animal_arr.length; i++) {
            System.out.print("Animal type: "  + "\nName: " + animal_arr[i].getName() + " \nAge: " + animal_arr[i].getAge() + " \n" + animal_arr[i].getName() + " say: ");
            animal_arr[i].voice();
            System.out.println("");
        }

//(Task 3) Create array of animal
        System.out.println("\nBEGIN TASK #3");
        animal_arr = (Animal[]) Filter.CatDogGoodbye(animal_arr);
           for (int i = 0; i < animal_arr.length; i++) {
              if (animal_arr[i] != null)
               System.out.println("Animal type: "  + "Name: " + animal_arr[i].getName() + " Age: " + animal_arr[i].getAge() + " " + animal_arr[i].getName() + " say: ");
         }


//(Task 4) Pitomnik2

        System.out.println("\nBEGIN TASK #4");
        Pitomnik shelter = new Pitomnik();

        shelter.addAnimals(cat1);
        shelter.addAnimals(cat2);
        shelter.addAnimals(cat3);
        shelter.addAnimals(cat5);

        shelter.addAnimals(dog1);
        shelter.addAnimals(dog2);
        shelter.addAnimals(dog4);
        shelter.addAnimals(dog5);

       //  shelter.printAllAnimals(shelter);
         shelter.printAllAnimals();

 // TASK 5
        System.out.println("\nBEGIN TASK #5");
        int[] inputArray ={5,3,7,3,1,9,2,9,0,4,9};
        System.out.println(Arrays.toString(Filter.returnArr(inputArray)));

    }
}
