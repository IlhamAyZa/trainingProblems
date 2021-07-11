package problem4;

import java.util.*;
import problem4.Person;
import problem4.Sex;

/**
 *
 * @author Ilham
 */
public class Problem4 {

    public static void main(String[] args) {
        List<Person> aListOfPeople = Arrays.asList(new Person("Вася", 16, Sex.MAN), new Person("Петя", 23, Sex.MAN), new Person("Елена", 42, Sex.WOMEN),
        new Person("Иван Иванович»", 69, Sex.MAN));
	
        System.out.println(aListOfPeople.stream().filter(x -> x.getSex() == Sex.MAN).mapToInt(x -> x.getAge()).sum());
        
        System.out.println(aListOfPeople.stream().filter(x -> x.getAge() >= 18 | x.getAge() <=60).count());
    }
 
}