package DM575.Lessions.Libary;

public class Author {
    private String name, pseudonym;

    public Author(String name, String pseudonym) {
        this.name = name;
        this.pseudonym = pseudonym;
    }
    public Author(String name) {
        this(name, null);
    }

    public String name() {
        return name;
    }

    public int compareTo(Author other) {

        return this.name.compareTo(other.name());
    }
    public boolean equals(Object other) {
        if (other instanceof Author) {
            Author a = (Author) other;
            return a.name().equals(this.name());
        }
        return false;
    }
}
