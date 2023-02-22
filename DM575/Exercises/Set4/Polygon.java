package DM575.Exercises.Set4;

public class Polygon {
    
    private Point2D[] vertices;

    public Polygon(Point2D[] vertices) {
        this.vertices = new Point2D[vertices.length];
        for (int i = 0; i < this.vertices.length; i++) {
            this.vertices[i] = vertices[i];
        }
    }

    public Point2D[] getVertices() {
        return this.vertices;
    }
    public Point2D getVertex(int index) {
        return this.vertices[index];
    }
    public void setVertex(int index, Point2D vertex) {
        this.vertices[index] = vertex;
    }

    public double[] sidesLength() {
        double[] sideLength = new double[this.vertices.length];
        for (int i = 0; i < this.vertices.length; i++) {
            sideLength[i] = this.vertices[i].distanceTo(
                this.vertices[(i+1) % this.vertices.length]);
        }
        return sideLength;
    }

    public double perimeter() {
        double[] sides = this.sidesLength();
        double sum = 0;
        for (int i = 0; i < sides.length; i++) {
            sum += sides[i];
        }
        return sum;
    }
    public Point2D nearest() {
        Point2D closest = this.vertices[0];
        for (int i = 1; i < this.vertices.length; i++) {
            if (this.vertices[i].distanceToOrigin() < closest.distanceToOrigin()) {
                closest = this.vertices[i];
            }
        }
        return closest;
    }
    public double longestSide() {
        double[] sides = this.sidesLength();
        double longest = sides[0];
        for (int i = 1; i < sides.length; i++) {
            longest = Math.max(longest, sides[i]);
        }
        return longest;
    }
}
