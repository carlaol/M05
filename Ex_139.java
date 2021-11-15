import java.util.Scanner;
public class ex_139 {
    public static void main(String[] args) {
        int num, cubifinit = 0;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix un numero: ");
        num = teclat.nextInt();
        while(num>0) {
           cubifinit = cubifinit + ((num%10)*(num%10)*(num%10));
           num = num/10;
        }
        if (cubifinit == 1) {
            System.out.println("Es cubifinit");
        }else {
            num = cubifinit;
            cubifinit = 0;

            while(num>0) {
                cubifinit = cubifinit + ((num%10)*(num%10)*(num%10));
                num = num/10;
            }
            if (cubifinit == 1) {
                 System.out.println("Es cubifinit");
            }else{
                System.out.println("No es cubifinit");
            }
        }
        teclat.close();
    }

}