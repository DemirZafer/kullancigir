import java.util.Scanner;
public class Pass2 {
    public static void main(String[] args) {
        Scanner vr = new Scanner(System.in);
        String password = "Mafo" , cev1 , olustur , nwpass   ;
        System.out.println("Lütfen şifrenizi girin : ");
        cev1 = vr.nextLine();
        if((cev1.equals(password))){
            System.out.println("Giriş Başarılı");
        }else{
            System.out.println("Başarısız Giriş. Şifrenizi yeniden oluşturmak için Evet, oluşturmamak için Hayır yazınız");
            olustur = vr.nextLine();
            switch (olustur){
                case "Evet" :
                    System.out.println("Lütfen yeni şifrenizi girin : ");
                    nwpass =vr.nextLine();
                    if (nwpass.equals(cev1)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        break;}
                    if(nwpass.equals(password)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        break;
                    } else {
                        System.out.println("Yeni Şifreniz Başarıyla Oluşturuldu.");
                        System.out.println("Lütfen Anasayfaya Tıklayın.");
                        break;}
                case "Hayır"  :
                    System.out.println("Lütfen Anasayfaya Tıklayın."); break;
            }
            }
    }
}
