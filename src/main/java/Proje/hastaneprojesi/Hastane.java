package Proje.hastaneprojesi;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hastane extends VeriBankasi {


    static Scanner input = new Scanner(System.in);
    static VeriBankasi veriBankasi = new VeriBankasi();
    private static Hasta yeniHasta;
    private static int doktorSecimi;


    public static void hastaneMenu() {
        System.out.println("\033[34m***************************************************\033[0m");
        slowPrint("<----- QA - TEAM - 03 HASTANESINE HOSGELDINIZ----->", 40);
        System.out.println("\033[34m \n***************************************************\033[0m");
        System.out.println();
        System.out.println("\33[36m ...Lutfen yapmak istediginiz islemi belirtiniz... " +
                "\n\n 1- Randevu alin" +
                "\n 2- Hastane iletisim bilgileri" +
                "\n 3- Cikis\33[0m");
        int anaMenuSecim = input.nextInt();

        switch (anaMenuSecim) {
            case 1:
                aciliyetDurumu();
                break;
            case 2:
                iletisimBilgileri();
                break;
            case 3:
                cikis();
                break;
            default:
                System.err.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz");
                hastaneMenu();

        }

    }

    private static void iletisimBilgileri() {
        System.out.println("\033[34m***************************************************\033[0m");
        System.out.println("\33[33m" +
                "\n **** ** * TEAM - 03 Hastanesi * ** *** " +
                "\n Tel    : +33021546879" +
                "\n Adres  : 19 Rue Leonard de Vinci 455000" +
                "\n e-mail : healthcare@team03.com\33[0m");
        System.out.println("\033[34m\n***************************************************\33[0m");

        System.out.println("\33[36m\nRandevu almak icin 1'e cikmak icin 2'ye basiniz\33[0m");
        int devamMi=input.nextInt();
        if( devamMi==1){
            randevuBolumu();
        }else {
            cikis();
        }
    }

    private static void cikis() {

        System.out.println(" *** ** * Saglikli gunler dileriz * ** ***");
        System.exit(0);
    }
    public static void randevuBolumu() {

        System.out.println("\033[33m\n**************************************************\033[0m");
        slowPrint(" ============ Randevu Servisindesiniz ===========\n " +
                "Lutfen randevu almak istediginiz bolumu giriniz\n", 50);

        System.out.println("" +
                "\n1- Noroloji           - Prof.Dr Gulsen OZKAN" +
                "\n2- Dahiliye           - Doc.Dr Kubra SIMSEK" +
                "\n3- Plastik Cerrahi    - Uzm.Dr Emre SOYDEMIR" +
                "\n4- Cocuk Hastaliklari - Uzm.Dr Zeynep DEMIR" +
                "\n5- Kardiyoloji        - Uzm.Dr Fatma OLMEZ" +
                "\n6- Genel Cerrahi      - Prof.Dr Mustafa KEPENEK" +
                "\n7- Beslenme ve Diyet  - Uzm.Dr Ceren CIFTCI" +
                "\n8- Pskiyatrist        - Doc.Dr Ozlem HASLAK" +
                "\n9- Ortopedist         - Prof.Dr Esra CAGAN");
        System.out.println("\033[33m\n**************************************************\033[0m");


        Doktor bir = new Doktor("Gulsen OZKAN", "NOROLOJI", "Prof.Dr");
        Doktor iki = new Doktor("Kubra SIMSEK", "DAHILIYE", "Doc.Dr");
        Doktor uc = new Doktor("Emre SOYDEMIR", "PLASTIK CERRAHI", "Uzm.Dr");
        Doktor dort = new Doktor("Zeynep DEMIR", "PEDIATR", "Uzm.Dr");
        Doktor bes = new Doktor("Fatma OLMEZ", "KARDIOLOG", "Uzm.Dr");
        Doktor alti = new Doktor("Mustafa KEPENEK", "GENEL CERRAHI", "Prof.Dr");
        Doktor yedi = new Doktor("Ceren CIFTCI", "BESLENME VE DIYET", "Prof.Dr");
        Doktor sekiz = new Doktor("Doc.Dr Ozlem HASLAK", "PSIKIYATRIST", "prof.dr");
        Doktor dokuz = new Doktor("Esra CAGAN", "ORTOPEDIST", "Prof.Dr");

        doktorSecimi = input.nextInt();


        switch (doktorSecimi) {

            case 1:
                slowPrint(bir + "'dan randevunuz olusturuluyor\n\n", 60);
                hastaBilgileri();
                randevuAlma();
                break;

            case 2:
                slowPrint(iki + "'den randevunuz olusturuluyor\n\n", 60);
                hastaBilgileri();
                randevuAlma();
                break;

            case 3:
                slowPrint(uc + "'den randevunuz olusturuluyor\n\n", 60);
                hastaBilgileri();
                randevuAlma();
                break;

            case 4:
                slowPrint(dort + "'den randevunuz olusturuluyor\n\n", 60);
                hastaBilgileri();
                randevuAlma();
                break;

                case 5:
                slowPrint(bes + "'den randevunuz olusturuluyor\n\n", 60);
                hastaBilgileri();
                randevuAlma();
                break;

            case 6:
                slowPrint(alti + "'den randevunuz olusturuluyor\n\n", 60);
                hastaBilgileri();
                randevuAlma();
                break;

            case 7:
                slowPrint(yedi + "'den randevunuz olusturuluyor\n\n", 60);
                hastaBilgileri();
                randevuAlma();
                break;

            case 8:
                slowPrint(sekiz + "'den randevunuz olusturuluyor\n\n", 60);
                hastaBilgileri();
                randevuAlma();
                break;

            case 9:
                slowPrint(dokuz + "'den randevunuz olusturuluyor\n\n", 60);
                hastaBilgileri();
                randevuAlma();
                break;

            default:
                System.err.println("Lutfen hastanemizde olan bir bolum seciniz");
                randevuBolumu();
        }
    }


    public static void randevuAlma() {

        System.out.println("\033[34m\n***************************************************\033[0m");
        slowPrint("      ======== Randevu Servisindesiniz =======", 50);
        System.out.println("\033[34m\n***************************************************\033[0m");

        System.out.print("\33[34m\nLutfen randevu tarihini girin (DD-MM-YYYY seklinde): \n\33[0m");
        String appointmentDate = input.next();

        System.out.print("\33[34m\nLutfen randevu saatini seciniz \n09:00 - 09:30 - 10:00 - 10:30 - 11:00 - 11:30" +
                "\n14:00 - 14:30 - 15:00 - 15:30 - 16:00 - 16:30\n\33[0m");
        String appointmentTime = input.next();

        String appointmentDateTime = appointmentDate + " " + appointmentTime;

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        if (randevuSaati(appointmentDateTime, sdf)) {
            System.out.println("\033[34m\n***************************************************\n\033[0m");
            System.out.println("\033[33m***************************************************\033[0m");


            slowPrint("***** **** ** *RANDEVU BILGILERINIZ* ** **** *****\n " +
//                    "\nDoktor bilgileri : "+doktorSecimi+
                    "\nHasta bilgileri  : " + yeniHasta +
                    "\nRandevu tarihiniz: " + appointmentDate +
                    "\nRandevu saatiniz : " + appointmentTime +
                    "\nRandevunuz basariyla kaydedilmistir" +
                    "\nLutfen randevu saatinde once poliklinikte olunuz" +
                    "\n         **** SAGLIKLI GUNLER DILERIZ****", 40);
            System.out.println("\033[33m\n***************************************************\033[0m");
        } else {
            System.out.println("Girdiginiz tarih ve saat araligi dogru degil. Lutfen tekrar deneyin.");
            randevuAlma();
        }
    }

    public static boolean randevuSaati(String appointmentDateTime, SimpleDateFormat sdf) {
        try {
            Date date = sdf.parse(appointmentDateTime);
            String time = sdf.format(date).split(" ")[1];

            return time.compareTo("09:00") >= 0 && time.compareTo("12:00") <= 0 ||
                    time.compareTo("14:00") >= 0 && time.compareTo("17:00") <= 0;

        } catch (Exception e) {
            return false;
        }
    }


    public static void hastaBilgileri() {

        System.out.println("Lutfen adinizi giriniz");
        String hastaAdi = input.next();

        System.out.println("Lutfen soyadinizi giriniz");
        String hastaSoyAdi = input.next();

        System.out.println("Lutfen Cinsiyetinizi giriniz ('Erkek' 'Kadin')");
        String hastaCinsiyet = input.next();
        if(!(hastaCinsiyet.equalsIgnoreCase("erkek")|| hastaCinsiyet.equalsIgnoreCase("kadin"))){
            System.err.println("Lutfen gecerli bilgi giriniz");
            hastaBilgileri();
        }


        System.out.println("Lutfen yasinizi giriniz");

        int hastaYas = input.nextInt();
        if(!(hastaYas>=0 && hastaYas<=120)){
            System.out.println("Lutfen gecerli bir yas araligi giriniz");
            hastaBilgileri();
        }


        System.out.println("Lutfen ID giriniz");
        String hastaID = input.next();


        yeniHasta = new Hasta(hastaAdi, hastaSoyAdi, hastaCinsiyet, hastaYas, hastaID);


        System.out.println("\033[33m\n***************************************************\033[0m");
        System.out.println("***** **** *** ** Hasta Bilgileri ** *** **** *****\n");
        slowPrint("" + yeniHasta + "\n", 50);
        System.out.println("\033[33m\n***************************************************\n\033[0m");


    }

    private static void acilDoktoru() {
        hastaBilgileri();
        System.out.println("\033[33m\n***************************************************\n\033[0m");
        System.out.println("" +

                "\33[35m Acil Doktorumuz Uzm.Dr Seren HANIM'a yonlendirildiniz, " +
                        "\n Sabriniz icin tesekkur ederiz" +
                        "\n Cok kisa bir sure icinde cagrilacaksiniz, " +
                        "\n Ekranlardan isminizi takip ediniz\33[0m");
        System.out.println("\033[33m\n***************************************************\n\033[0m");
        System.exit(0);
    }

    public static void aciliyetDurumu() {
        System.err.println("Lutfen hastalik durumunuzu giriniz \n 1.Acil \n 2.Genel Kontrol  ");

        int aciliyetDurumu = input.nextInt();

        switch (aciliyetDurumu) {
            case 1:
                acilDoktoru();
                break;
            case 2:
                randevuBolumu();
                break;

            default:
                System.out.println("Gecerli bir durum giriniz");
                aciliyetDurumu();
        }
    }

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
