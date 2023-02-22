:::mermaid
flowchart RL
    Student -.-> interface
    Prof -.-> interface
    Student -.-> IDProvider
    Prof -.-> IDProvider
    interface[ Interface \n +String name \n +int id ]
    Student[Student \n +double avg]
    Prof[Prof \n +position]
    IDProvider[IDProvider \n +issuedNewID]
:::

:::mermaid
classDiagram
    Person <-- Student
    Person <-- Prof
    class Person{
        +id
        +String name
        +Person(name)
    }
    class Student{
        +double avg
    }
    class Prof{
        +position
    }
:::