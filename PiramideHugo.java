public class PiramideHugo {
	public void correr() {
		for(int x = 1; x <= 10; x++) {
			for(int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PiramideHugo p1 = new PiramideHugo(); 
		p1.correr();
	}
}
