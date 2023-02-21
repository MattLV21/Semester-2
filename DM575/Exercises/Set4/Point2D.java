package DM575.Exercises.Set4;

public class Point2D {
    private double x, y;
    private static int originCount = 0;
    protected void finalize() {
        if (this.isOrigin()) {
            originCount--;
        }
    }

    public static void main(String[] args) {
        Point2D point = new Point2D(1, 0);
        System.out.println(point.distanceToOrigin());
    }

    public Point2D(double x, double y) {
        this.x = x; 
        this.y = y;
        if (x == 0 && y == 0) {
            originCount++;
        }
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        if (this.x == 0 && this.y == 0 && x != 0) {
            originCount--;
        } else if (x == 0 && this.y == 0) {
            originCount++;
        }
        this.x = x;
    }
    public void setY(double y) {
        if (this.x == 0 && this.y == 0 && y != 0) {
            originCount--;
        } else if (this.x == 0 && y == 0) {
            originCount++;
        }
        this.y = y;
    }
    public static int howManyOrigins() {
        return originCount;
    }

    public boolean isOrigin() {
        return this.x == 0.0 && this.y == 0.0;
    }
    public void move(double deltaX, double deltaY) {
        this.x = this.x + deltaX;
        this.y = this.y + deltaY;
    }
    public double distanceToOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public double distanceTo(Point2D point) {
        double dx = Math.pow(this.x - point.getX(), 2);
        double dy = Math.pow(this.y - point.getY(), 2);
        return Math.sqrt(dx + dy);
    }

    public boolean equals(Object other) {
        if (other instanceof Point2D) {
            Point2D otherPoint = (Point2D) other;
            return this.x == otherPoint.getX() && this.y == otherPoint.getY();
        } else {
            return false;
        }
    }
    public Point2D clone() {
        return new Point2D(this.x, this.y);
    }
    
}
