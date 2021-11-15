import java.util.Scanner;
public class Ex_115{
	public static void main(String[] args){
		Scanner teclat = new Scanner(System.in);
		int num, esquerra, dreta, decima, suma;
		boolean kapkrekar;
        System.out.print ("Introdueix un numero: ");
        num = teclat.nextInt();
		while(num != 0) {
			decima = 1;
			esquerra = 0;
			dreta = 0;
			suma = 0;
			kapkrekar = false;
			esquerra = num * num;
			while(esquerra > 0 && !kapkrekar) {
				dreta = dreta + (esquerra % 10) * decima;
				esquerra /= 10;
				decima *= 10;
				suma = esquerra + dreta;

				if(dreta > 0 && suma == num) {
					kapkrekar = true;
				}
			}
			if(kapkrekar == true) {
				System.out.println("Si es Kaprekar");
			} else if (kapkrekar == false) {
				System.out.println("No es Kaprekar");
			}
            System.out.print ("Introdueix un numero: ");
			num = teclat.nextInt();
		}
	}
}