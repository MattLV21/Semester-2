package DM575.Lessions.Scool;

public class Student extends Person {
    private double avg;

    public Student(String name, double avg) {
        super(name);
        this.avg = avg;
    }
    @Override
    public String toString() {
        return "Student " + super.toString();
    }

    public double getAvg() {
        return this.avg;
    }
    public void setAvg(double avg) {
        this.avg = avg;
    }
}
