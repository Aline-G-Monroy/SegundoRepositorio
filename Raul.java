public class Raul{
	public void correRaul(){
		System.out.println("Hola Raúl");
		int filas = 5;

        	for (int i = 0; i < filas; i++) {
            		System.out.printf("%" + (filas - i) + "s", "");
            		System.out.printf("%" + (i * 2 + 1) + "s", "*".repeat(i * 2 + 1));
            		System.out.println();
        	}
	}
}
