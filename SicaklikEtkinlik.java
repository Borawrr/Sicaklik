import java.util.Scanner;

public class SicaklikEtkinlik {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int havaSicakligi;

        System.out.print("Hava sicakligini giriniz : ");
        havaSicakligi = scanner.nextInt();

        if (havaSicakligi <= 5){

            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }else if (5 < havaSicakligi && havaSicakligi <= 15 ){

            System.out.println("Sinemaya gidebilirsiniz.");
        }else if (15 < havaSicakligi && havaSicakligi <= 25){

            System.out.println("Piknige gidebilirsiniz.");
        }else if(havaSicakligi > 25){
            System.out.println("Yuzmeye gidebilirsiniz.");
        }



    }

}
