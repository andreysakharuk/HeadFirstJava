package headfirst.lesson3_arrays_references;


public class Triangle {

    private double area;
    private int height;
    private int length;

    public static void main(String[] args) {
        Triangle[] ta = new Triangle[4];
        int x = 0;

        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("треугольник " + x + " ,зона");
            System.out.print(" = " + ta[x].area);
            x++;
        }
        Triangle ta5 = ta[2];
        ta[2].area = 343;
        System.out.print(" y = " + x);
        System.out.print(", зона t5= " + ta5.area);

    }

    private void setArea() {
        area = (height * length) / 2;
    }
}
