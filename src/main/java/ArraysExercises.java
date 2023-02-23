//java

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Jason");
        people[1] = new Person("Tom");
        people[2] = new Person("Bruce");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person personToAdd = new Person("Kate");
        Person[] newPeople = addPerson(people, personToAdd);
        for (Person person : newPeople) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person personToAdd) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = personToAdd;
        return newPeople;
    }

    private static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}


//import java.util.Random;
//
//public class ServerNameGenerator {
//
//    public static void main(String[] args) {
//        String[] adjectives = {"dedicated", "adventurous", "ambitious", "reliable", "bright", "impressive", "courageous", "dynamic", "enviable", "magical"};
//        String[] nouns = {"photon", "wave", "spark", "orbit", "energy", "vortex", "galaxy", "nebula", "star", "atom"};
//
//        int randomAdjective = new Random().nextInt(adjectives.length);
//        int randomNoun = new Random().nextInt(nouns.length);
//
//        String serverName = adjectives[randomAdjective] + "-" + nouns[randomNoun];
//        System.out.println("Here is your server name: " + serverName);
//    }
//
//}
//


//import java.util.Arrays;
//
//class Person1 {
//    private String name;
//
//    public Person1() {
//        this.name = "Bart Simpson";
//    }
//
//    public String getName() {
//        return this.name;
//    }
//}
//
//class ArraysExercises {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//
//        Person1[] personsGroup = new Person1[3];
//        for (int i = 0; i < personsGroup.length; i++) {
//            personsGroup[i] = new Person1();
//        }
//
//        for (int i = 0; i < personsGroup.length; i++) {
//            System.out.println(personsGroup[i].getName());
//        }
//
//        Person1 newPerson1 = new Person1();
//        personsGroup = addPerson1(personsGroup, newPerson1);
//    }
//
//    public static Person1[] addPerson1(Person1[] personsGroup, Person1 person) {
//        Person1[] newPeople = new Person1[personsGroup.length + 1];
//        for (int i = 0; i < personsGroup.length; i++) {
//            newPeople[i] = personsGroup[i];
//        }
//        newPeople[personsGroup.length] = person;
//        return newPeople;
//    }
//}
