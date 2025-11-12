package SystemDesign.comparable_and_Comparator;

class Person implements Comparable {
    int age;
    String name;
    int rollno;


    public Person(int age, String name, int rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Person) o).name);  //  compareTo() -> This method compares two strings lexicographically
    }
}
