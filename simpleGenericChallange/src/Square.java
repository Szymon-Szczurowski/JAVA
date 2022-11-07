public class Square<T extends Number> {
    private T wall;

    public Square(T wall) {
        this.wall = wall;
    }

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }

    public double getSurfaceArea() {
        double d1 = this.wall.doubleValue();
        return d1 * d1;
    }
}
