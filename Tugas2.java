import java.util.Scanner;
public class Tugas2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Pilih bangun datar :");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi panjang");
            System.out.println("3. Lingkaran");
            System.out.print("Masukkan pilihan anda : ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisi = input.nextDouble();
                    tampilkanHasil("Persegi", hitungLuasPersegi(sisi), hitungKelilingPersegi(sisi));
                    break;
                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebar = input.nextDouble();
                    tampilkanHasil("Persegi panjang", hitungLuasPersegiPanjang(panjang, lebar), hitungKelilingPersegiPanjang(panjang, lebar));
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = input.nextDouble();
                    tampilkanHasil("Lingkaran", hitungLuasLingkaran(jariJari), hitungKelilingLingkaran(jariJari));
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
                    break;
            }

            input.close();
        }

        public static double hitungLuasPersegi(double sisi) {
            return sisi * sisi;
        }

        public static double hitungKelilingPersegi(double sisi) {
            return 4 * sisi;
        }

        public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
            return panjang * lebar;
        }

        public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
            return 2 * (panjang + lebar);
        }

        public static double hitungLuasLingkaran(double jariJari) {
            return Math.PI * jariJari * jariJari;
        }

        public static double hitungKelilingLingkaran(double jariJari) {
            return 2 * Math.PI * jariJari;
        }

        public static void tampilkanHasil(String namaBangun, double luas, double keliling) {
            System.out.println("Luas " + namaBangun + ": " + luas);
            System.out.println("Keliling " + namaBangun + ": " + keliling);
        }
    }
