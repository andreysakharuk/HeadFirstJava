package headfirst.lesson4_methods_incapsulation;

/**
 * Created by Andrei_Sakharuk on 8/14/2018.
 */
public class Mix {

    private int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix[] m4a = new Mix[20];
        int x = 0;
        while (x < 9) {
            m4a[x] = new Mix();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }

    private int maybeNew(int index) {
        if (index < 5)
        {
            Mix m4 = new Mix();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
