import java.util.Scanner;

public class Person {

    private String name;
    private int age;


    // constructor prop name
    public Person (String name){
        this.name = name;
    }
    // constructor prop name and age
    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }
    // getter for age returns age prop
    public int getAge() {
        return age;
    }
    //setter for age prop
    public void setAge(int age) {
        this.age = age;
    }
    // getter for name returns the person's name
    public String getName(){
        return name;
    }
    // setter for name changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello from %s\n", name);
    }

    public static void main(String[] args) {
        Person person = new Person("Bryce");
        person.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}



