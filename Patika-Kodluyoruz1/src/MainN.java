import java.util.Scanner;
/*ava ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...*/
public class MainN {
    public static void main(String[] args){
        //DEĞİŞKEN OLUŞTURULUR
        int mat,fzk, kimya,turkce, tarih,Muzik;

        //SINIFI TANIMLA
        Scanner scn = new Scanner(System.in);

        //KULLANICIDAN DEĞER ALINIZ
        System.out.print("Matematik Notunuz giriniz:");
        mat= scn.nextInt();

        System.out.print("fizik notunuzu giriniz:");
        fzk=scn.nextInt();

        System.out.print("kimya nıtunuzu giriniz:");
        kimya= scn.nextInt();

        System.out.print("türkce notunuzu giriniz:");
        turkce= scn.nextInt();

        System.out.print("TARİH NOTUNUZU GİRİNİZ:");
        tarih= scn.nextInt();

        System.out.print("müzik notunuzu giriniz:");
        Muzik= scn.nextInt();


        int toplam=(mat+ fzk+kimya+turkce+tarih+Muzik);
        double sonuc= toplam/6.0 ;
        System.out.print("ortalamanız:"+ sonuc);

        //sınıfı geçtiğini koşulsuz ifade olmadan kullanırsak  nasıl olur

        String durum= (sonuc>=60) ?  "sınıfı geeçti" : "sınıfı kaldi:";
        System.out.print(durum);


    }
}
