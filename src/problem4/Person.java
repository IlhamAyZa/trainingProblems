package problem4;

import problem4.Sex;

/**
 *
 * @author Ilham
 */
public class Person {

    String name;
    int age;
    Sex sex;

    // Constructor
    Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Get and Set methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }
 
}
