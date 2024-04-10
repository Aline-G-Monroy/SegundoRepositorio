public class Hola{
	public static void main(String []args){
		System.out.println("Help");
		piramide(11);
	}

	public static void piramide(int tamano){
		for(int i = 0; i < tamano; i++){
			for(int m = tamano; m > i; m--){
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++){
				System.out.print("*");
			}
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
