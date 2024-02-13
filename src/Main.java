import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // kullanıcı girişi yapımı
        String userName,password;

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen KUllanıcı adınızı giriniz: ");
        userName=scan.nextLine();

        System.out.println("lüütfen parolanızı giriniz: ");
        password=scan.nextLine();

        // equels string de eşitliği kontrol eder ve büyük küçük harf duyarlılığı vardır
        if (userName.equals("patika") & password.equals("java123")){
            System.out.println("Giriş Başarılı");
        }
        else {
            System.out.println("tekrar deneyiniz");
        }


    }
}