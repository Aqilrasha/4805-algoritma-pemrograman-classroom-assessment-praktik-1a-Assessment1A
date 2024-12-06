import java.util.ArrayList;
import java.util.Scanner

public class Nomor2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Inisialisasi data
        ArrayList<String> namaDriver = new ArrayList<>();
        namaDriver.add("Beliau");
        namaDriver.add("Mereka");
        namaDriver.add("Kita");
        
        ArrayList<Integer> omset = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            omset.add(0); 
        }
        
        int totalTrip = 0;
        final int BIAYA_PER_KM = 13000;
        
        while (true) {
            // Input nama driver
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String driverName = scanner.nextLine();
            
            if (!namaDriver.contains(driverName)) {
                System.out.println("Nama driver tidak valid. Silakan coba lagi.");
                continue;
            }
            
            // Input lama trip
            System.out.print("Lama trip (km): ");
            int km = scanner.nextInt();
            totalTrip += km;
            
            // Hitung omset
            int index = namaDriver.indexOf(namaDriver);
            omset.set(index, omset.get(index) + (km * BIAYA_PER_KM));
            
            // Tanyakan apakah ingin input lagi
            System.out.print("Input lagi (Y/N)?: ");
            scanner.nextLine(); // Clear the buffer
            String inputLagi = scanner.nextLine().trim().toUpperCase();
            if (!inputLagi.equals("Y")) {
                break;
            }
        }
        
        // Menentukan driver dengan omset tertinggi
        int maxOmset = 0;
        String driverTertinggi = "";
        for (int i = 0; i < omset.size(); i++) {
            if (omset.get(i) > maxOmset) {
                maxOmset = omset.get(i);
                driverTertinggi = namaDriver.get(i);
            }
        }
        
        // Output hasil
        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        System.out.println("Omset tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omset = " + maxOmset);
        
        scanner.close();
    }
}
