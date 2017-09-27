
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Function {

    public static void main(String[] args) throws IOException {
        int x;
        Random random = new Random();
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a massive length:");
        int[] mas = new int[Integer.parseInt(d.readLine())];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
        }
        
        System.out.println("Your massive:");
         for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < mas.length; i++) {
            int max = mas[i];
            int imax = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] > max) {
                    max = mas[j];
                    imax = j;
                }
            }
            if (i != imax) {
                int temp = mas[i];
                mas[i] = mas[imax];
                mas[imax] = temp;
            }
        }
        System.out.println("Your sorted massive:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        System.out.print("Enter a number X: ");
        x = Integer.parseInt(d.readLine());

        Function f = new Function();
        System.out.println("The index of element less than X(="+x+"): " + f.bsearch(mas, x));
    }

    int bsearch(int[] l, int x) {

        int number = 0;
        for (int i = 0; i < l.length; i++) {
            if ((l[i] < x)) {
                number = i;
                break;
            }
        }
        return number;
    }
}
