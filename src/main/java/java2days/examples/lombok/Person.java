package java2days.examples.lombok;

import java.io.Serializable;

public class Person implements Serializable {

    private int key;

    private String firstName;

    private String secondName;

    private String thirdName;

    private int age = 10;

    private int yearOfBirth;
}
