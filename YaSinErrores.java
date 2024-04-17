public class YaSinErrores {
    public static void main(String[] args) {
        System.out.println("Hola Raúl");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
