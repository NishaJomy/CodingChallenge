public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String compareAge(Person other) {
        if (other.age > this.age) {
            return other.name + " is older than me.";
        } else if (other.age < this.age) {
            return other.name + " is younger than me.";
        } else {
            return other.name + " is the same age as me.";
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Samuel", 24);
        Person p2 = new Person("Joel", 36);
        Person p3 = new Person("Lily", 24);

        System.out.println(p1.compareAge(p2)); // Output: "Joel is older than me."
        System.out.println(p2.compareAge(p1)); // Output: "Samuel is younger than me."
        System.out.println(p1.compareAge(p3)); // Output: "Lily is the same age as me."
    }
}