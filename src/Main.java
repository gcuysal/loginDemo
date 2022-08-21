import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String userName, passWord, sifremiUnuttum, newPassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        passWord = input.nextLine();

        if (userName.equals("patika") && passWord.equals("java")) {
            System.out.println("Hoşgeldiniz " + userName);

        } else {
            System.out.println("Hatali sifre girdiniz yeni sifre belirtmek isterseniz \"Evet\"  istemezseniz \"Hayır\"  secin  ");
            sifremiUnuttum = input.nextLine();

            if (sifremiUnuttum.equals("Hayır")) {
                System.out.println("HATA! Lütfen sayfayı yenileyiniz.");
            } else if (sifremiUnuttum.equals("Evet")) {
                System.out.println("Yeni sifrenizi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java") || newPassword.equals(passWord)) {
                    System.out.println("Yeni şifreniz bir öncekiyle aynı olamaz! Lütfen başka bir şifre giriniz: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("java") || newPassword.equals(passWord)){
                        System.out.println("Yeni şifreniz bir öncekiyle aynı olamaz! Sayfayı yenileyip tekrar deneyiniz.");
                    }else {
                        System.out.println("Yeni şifreniz başarıyla oluşturuldu. Giriş Yapmak için lütfen sayfayı yenileyiniz.");
                    }

                } else {
                    System.out.println("Yeni şifreniz başarıyla oluşturuldu. Giriş yapmak için sayfayı yenileyiniz.");
                }

            } else {
                System.out.println("HATA! Lütfen sayfayı yenileyip tekrar deneyiniz.");

            }

        }
    }
}

