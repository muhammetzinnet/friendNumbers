import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int number_1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int number_2 = scanner.nextInt();

        int total_1 = 0;
        int total_2 = 0;

        for (int i = 1; i < number_1; i++){
            if (number_1 % i == 0){
                total_1 = total_1 + i;
            }
        }

        for (int j = 1; j < number_2; j++){
            if (number_2 % j == 0){
                total_2 = total_2 + j;
            }
        }

        if (number_1 == total_2 && number_2 == total_1){
            System.out.println("Girilen sayılar arkadaş sayılardır");
        }else {
            System.out.println("Girilen sayılar arkadaş sayı değildir");
        }
    }
}