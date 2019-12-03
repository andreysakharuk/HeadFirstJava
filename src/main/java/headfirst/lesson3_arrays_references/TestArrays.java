package headfirst.lesson3_arrays_references;

public class TestArrays {

    public static void main(String[] args) {

        double[] mass = new double[3];
        double[] mass2 = {4.4, 43,5};

        System.out.println("выводим второе число из массива = "+ mass2[1]);

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String[] islands = new String[4];
        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

        System.out.println("острова = ");

        int ref;
        int y = 0;
        while (y < 4) {
            ref = index[y];
            System.out.println(islands[ref]);
            y++;
        }
    }
}






