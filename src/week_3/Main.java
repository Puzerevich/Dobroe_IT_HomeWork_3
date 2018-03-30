package week_3;

/**
 * Created by KOS on 18.03.2018.
 */

public class Main {

    public static void main(String[] args) {

//(Task 1) Create class and subclasses

        Dog dog1 = new Dog();
        dog1.setAnimal_type("Dog");
        dog1.setName("Sharik");
        dog1.setAge(3);
        System.out.print(dog1.getAnimal_type() + " name: " + dog1.getName() + " \nAge: " + dog1.getAge() + " \n" + dog1.getName() + " say: ");
        dog1.voice();

        System.out.println("- - - - - - - - - - - - - - - - - -");

        Cat cat1 = new Cat();
        dog1.setAnimal_type("Cat");
        cat1.setName("Garfield");
        cat1.setAge(5);
        System.out.print(cat1.getAnimal_type() + " name: " + cat1.getName() + " \nAge: " + cat1.getAge() + " \n" + cat1.getName() + " say: ");
        cat1.voice();

        System.out.println("- - - - - - - - - - - - - - - - - -");

        Dog dog2 = new Dog();
        dog2.setAnimal_type("Dog");
        dog2.setName("Pushok");
        dog2.setAge(1);
        // Один раз вывел просто название класса, вместо вида животного, так как название класса созвучно с видом животного.
        System.out.print(dog2.getClass().getSimpleName() + " name: " + dog2.getName() + " \nAge: " + dog2.getAge() + " \n" + dog2.getName() + " say: ");
        dog2.voice();

        System.out.println("\nВсего создано объектов: " + cat1.getAnimal_count());


//(Task 2) Create array of animal

        Animal[] animal_arr = new Animal[3];

        animal_arr[0] = new Cat();
        animal_arr[0].setAnimal_type("Cat");
        animal_arr[0].setName("Cat_1");
        animal_arr[0].setAge(1.5);

        animal_arr[1] = new Dog();
        animal_arr[1].setAnimal_type("Dog");
        animal_arr[1].setName("Degy_1");
        animal_arr[1].setAge(8);

        animal_arr[2] = new Cat();
        animal_arr[2].setAnimal_type("Cat");
        animal_arr[2].setName("Cat_2");
        animal_arr[2].setAge(11.5);

        System.out.println("\nArray of animals:\n");
        for (int i = 0; i < animal_arr.length; i++) {
            System.out.print("Animal type: " + animal_arr[i].getAnimal_type() + "\nName: " + animal_arr[i].getName() + " \nAge: " + animal_arr[i].getAge() + " \n" + animal_arr[i].getName() + " say: ");
            animal_arr[i].voice();
            System.out.println("");
        }

//(Task 3) Create array of animal
        System.out.println("BEGIN TASK #3");
        animal_arr = (Animal[]) Filter.CatDogGoodbye(animal_arr);
           for (int i = 0; i < animal_arr.length; i++) {
              if (animal_arr[i] != null)
               System.out.println("Animal type: " + animal_arr[i].getAnimal_type() + "Name: " + animal_arr[i].getName() + " Age: " + animal_arr[i].getAge() + " " + animal_arr[i].getName() + " say: ");
         }
        System.out.println("END TASK #3");

    }
}


