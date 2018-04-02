package week_3;

import java.util.Arrays;

/**
 * Created by Konstantin on 30.03.2018.  WITH CORRECT
 */
public class Filter {

    private static int FilterName(String str)
    {
        int res = 0;
        Character[]publ=new Character[]{'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п','р', 'с', 'т', 'ф', 'х', 'ц','ч', 'ш','щ','Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П','Р', 'С', 'Т', 'Ф', 'Х', 'Ц','Ч', 'Ш','Щ'};
         for(Character character:str.toCharArray()) {
             for(Character pub:publ) {
                if(character.equals(pub)) {
                    res++;
                }
            }

        }
        return res;
    }

    public static Object CatDogGoodbye(Animal an_arr[]){
        int nElems = an_arr.length;
        for (int i = 0; i < nElems; i++) {
            String name = an_arr[i].getClass().getSimpleName();
            if (name.equals("Cat") && (an_arr[i].getAge() < 1.0 || an_arr[i].getAge() > 8.0)) {
                an_arr[i]=null;
            }
            else{
                if (name.equals("Dog")&& FilterName(an_arr[i].getName())>4) {
                    an_arr[i]=null;
                }
            }
        }
        return an_arr;
    }


    public static int []returnArr(int[]inputArray){
        if (inputArray.length==0) {
            return inputArray;
        }
        Arrays.sort(inputArray);
        int []outputArray = new int[inputArray[inputArray.length-1]+1];

        for (int i = 0; i <inputArray.length; i++) {
            outputArray[inputArray[i]]++;
        }
        return outputArray;
    }
}



