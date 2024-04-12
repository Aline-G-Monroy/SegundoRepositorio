public class Piramide {
    public static void main(String[] args) {
        int filas = 9;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
