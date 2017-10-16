package java2days.examples.java.bean;

public class Person {

    private int key;

    private String firstName;

    private String secondName;

    private String thirdName;

    private int age;

    private int yearOfBirth;

    private double salary;

    public Person(int key, String firstName, String secondName, String thirdName, int age, int yearOfBirth,
        double salary) {
        this.key = key;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.age = age;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        if (key != person.key)
            return false;
        if (age != person.age)
            return false;
        if (yearOfBirth != person.yearOfBirth)
            return false;
        if (Double.compare(person.salary, salary) != 0)
            return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null)
            return false;
        if (secondName != null ? !secondName.equals(person.secondName) : person.secondName != null)
            return false;
        return thirdName != null ? thirdName.equals(person.thirdName) : person.thirdName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = key;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (thirdName != null ? thirdName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + yearOfBirth;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Person{" + "key=" + key + ", firstName='" + firstName + '\'' + ", secondName='" +
            secondName + '\'' + ", thirdName='" + thirdName + '\'' + ", age=" + age + ", yearOfBirth=" +
            yearOfBirth + ", salary=" + salary + '}';
    }
}

