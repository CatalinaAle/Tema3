package first.java;

public class Main {

    public static void main(String[] args) {
        int[] array = {89, 21, 12, 1989, 41};
        int minim = array[0];
        int maxim = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minim) {
                minim = array[i];
            }
        }

        System.out.println("Minimul este : " + minim);

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxim) {
                maxim = array[i];
            }
        }

        System.out.println("Maximul este : " + maxim);

    }
}
