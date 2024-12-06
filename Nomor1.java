public class Nomor1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan total jam lembur: ");
        int jamLembur = scanner.nextInt();
        
        double honorLembur;
        
        if (jamLembur <= 16) {
            honorLembur = jamLembur * 10000;
        } else {
            double honor16Jam = 16 * 10000; // Honor untuk 16 jam pertama
            int sisaJam = jamLembur - 16; // Sisa jam lembur
            double honorSisaJam = sisaJam * 15000; // Honor untuk sisa jam
            honorLembur = honor16Jam + honorSisaJam; // Total honor lembur
        }
        
        System.out.println("Total jam lembur: " + jamLembur);
        System.out.println("Honor lembur: " + honorLembur);
        
        scanner.close();
    }
}
