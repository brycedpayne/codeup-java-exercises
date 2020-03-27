public class ArraysExercises {

    public static Person[] addPerson(Person[] arr, Person person) {
        Person newArr[] = new Person[arr.length + 1]; // creates a new array that is one index longer
        System.arraycopy(arr, 0, newArr, 0, arr.length); //copies the old array to the new array
        newArr[arr.length] = person; //adds the new Person to the last array index of the new array
        return newArr; //returns the new array
    }

    public static void main(String[] args) {
        Person person1 = new Person("John"); //creates new Person instance and sets name property to string passed
        Person person2 = new Person("Jane"); //creates new Person instance and sets name property to string passed
        Person person3 = new Person("Joe"); //creates new Person instance and sets name property to string passed

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] people = {person1, person2, person3}; //creates an array of Person objects

//        for (Person person : people) {
//            System.out.println(person.getName());
//        }

        Person person4 = new Person("Jack"); //creates new Person instance and sets name property to string passed
        people = addPerson(people, person4); //reset value of array to
        for (Person person : people) {
            System.out.println(person.getName());
        }

    }
}
