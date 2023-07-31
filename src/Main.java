import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Animal> array1 = new ArrayList<>();
        array1.add(new Animal());
        array1.add(new Animal());
        array1.add(new Animal());

        List<Dog> array2 = new ArrayList<>();
        array2.add(new Dog());
        array2.add(new Dog());
        array2.add(new Dog());

        Set<Cat> array3 = new HashSet<>();
        array3.add(new Cat());
        array3.add(new Cat());
        array3.add(new Cat());

        getCollection2(array1);
        getCollection2(array2);
//        getCollection2(array3); 
        getCollection(array1);
        getCollection(array2);
        getCollection(array3);


        
        Data<String> data1 = new Data<>("String 1");
        data1.print("text");
        Data<Integer> data2 = new Data<>(54);
        data2.print(12);
        Data<Double> data3 = new Data<>(1.687);
        data3.print(5.16);
    }

    public static void getCollection(Collection<? extends Animal> array) {

        System.out.println(array.toString());
    }
    public static void getCollection2(List<? extends Animal> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}