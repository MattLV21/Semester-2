# Libary class diagram!
## Libary.
::: mermaid
classDiagram
    Libary --> Book
    Book <|-- ISBN
    Book <|-- Author

    Comparable <|-- Book
    Comparable <|-- ISBN
    Comparable <|-- Author

    class Libary{
        +main(String[] args)
    }
    class Book{
        +Book(ISBN, String Title, Authors[])
        +Book(ISBN, String Title, Author)
        +title() String
        +isbn() ISBN
        +authors() Author[]
        +compareTo(Book) int
    }
    class ISBN{
        +gruop() byte[]
        +publisher() byte[]
        +title() byte[]
        +checkedsum() byte
        +ISBN(byte[])
        +compareTo(ISBN) int
    }
    class Author{
        +Author()
        +Author(String name)
        +name() String
        +pseudoym() String
        +compareTo(Author) int
    }
    class Comparable{
        +compareTo(...) int
    }
:::