package DM575.Lessions.Scool;

public class Person {
    private final int id;
    private String name;
    private static int lastIssuedID = 0;

    public Person(String name) {
        this.name = name;
        this.id = lastIssuedID;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return this.id;
    }
}
