
import java.util.Scanner;

public class MooreMakinesi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int durum_uzunlugu; //Durum Uzunluğunu alacak
        int alfabeUzunluk; // Alfabe uzunluğunu tutacak
        int durumCikisUzunluk; // output alfabesini tutacak
        String alfabeDizisi;              // kullanıcı tarafından girilen parçalanmamış alfabe
        String durumCikisAlfabesi;
        String durumDeger;
        String inputDizisi;
        String state;

        System.out.print("Durum Uzunluğunu Giriniz: ");
        durum_uzunlugu= scan.nextInt();
        String[] durumDegerDizisi = new String[durum_uzunlugu];

        System.out.print("Giriş Alfabesini Giriniz(örn: a,b): ");
        alfabeDizisi = scan.next();
        alfabeUzunluk= (alfabeDizisi.length()+1)/2;
        String[] alfabe_deger = new String[alfabeUzunluk];
        alfabe_deger = alfabeDizisi.split(",");
        int[][] durumgecis = new int[durum_uzunlugu][alfabeUzunluk];

        System.out.print("Çıkış Alfabesini Giriniz(örn: 0,1):  ");
        durumCikisAlfabesi = scan.next();
        durumCikisUzunluk= (durumCikisAlfabesi.length()+1)/2;
        String[] durumCikisDizisi = new String[durumCikisUzunluk];
        durumCikisDizisi = durumCikisAlfabesi.split(",");


        System.out.print("Durum Degerlerini Sırasıyla Giriniz(örn 1,0,1,0,1):");
        durumDeger= scan.next();
        durumDegerDizisi = durumDeger.split(",");
        System.out.println("---------Geçiş Diyagramını Oluşturma----------");
        for(int i=0;i<durum_uzunlugu;i++){
            for(int k=0;k<alfabeUzunluk;k++){
                System.out.print("Başlangıç Durumu q"+i+" ve Giriş Değeri ("+alfabe_deger[k]+ ") için Yeni Durum: ");
                state=scan.next();
                durumgecis[i][k]=Integer.valueOf(state.charAt(1))-48;

            }
        }

        System.out.println("---------Geçiş Diyagramını Oluşturma----------");



        int iter=0,temp;
        System.out.print("İnput Dizisini Giriniz: ");
        inputDizisi = scan.next();
        int inputUzunluk=inputDizisi.length();
        String[] InputSplit = new String[inputUzunluk];
        InputSplit = inputDizisi.split("");
        System.out.println("-----------SONUÇ-----------");
        System.out.print("Output: "+durumDegerDizisi[0]+" ");
        for( int i=0;i<inputDizisi.length();i++){
            for(int k=0;k<alfabeUzunluk;k++){
                if(InputSplit[i].equals(alfabe_deger[k])){

                    temp=durumgecis[iter][k];
                    System.out.print(durumDegerDizisi[temp]+" ");
                    iter=durumgecis[iter][k];
                }
            }
        }





    }
}
