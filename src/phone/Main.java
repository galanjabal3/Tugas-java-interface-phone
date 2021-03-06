package phone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // membuat objek HP
        Phone Samsung = new Samsung();

        // membuat objek user
        PhoneUser jabal = new PhoneUser(Samsung);

        // kita coba nyalakan HP-nya
        jabal.turnOnThePhone();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[5] Screenshot");
            System.out.println("[6] Mobile Legends");
            System.out.println("[7] Foto/Kamera");
            System.out.println("[8] Galeri");
            System.out.println("[9] Youtube");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                jabal.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                jabal.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                jabal.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                jabal.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("5")){
                jabal.makePhoneScreenshoot();
            } else if (aksi.equalsIgnoreCase("6")){
                jabal.makePhoneMobileLegends();
            } else if (aksi.equalsIgnoreCase("7")){
                jabal.makePhoneFoto();
            } else if (aksi.equalsIgnoreCase("8")){
                jabal.makePhoneGaleri();
            } else if (aksi.equalsIgnoreCase("9")){
                jabal.makePhoneYouTube();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }
}
