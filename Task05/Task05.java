public class Task05 {
    public static void main (String[] args) {
        System.out.println(areaTriangle(4,7,5));
    }

    public static double areaTriangle(int side1, int side2, int side3) {
        int halfPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        return area;
    }
}
