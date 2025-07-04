public class array {
    public static void main(String[] args) {
        // buat kontrakan
        int kontrakan[] = new int[8];
        int hargaPerOrang = 300000;

        // isi kontrakan
        kontrakan[0] = 4;
        kontrakan[1] = 2;
        kontrakan[2] = 2;
        kontrakan[3] = 7;
        kontrakan[6] = 1;
        kontrakan[7] = 3;

        int pendapatanTotal = 0;

        for (int index = 0; index < kontrakan.length; index++) {
            if (kontrakan[index] == 0) {
                continue;
                // coba ubah ke break! hasil pendapatan akan selisih banyak!
            }

            pendapatanTotal += kontrakan[index] * hargaPerOrang;
        }

        System.out.println("Pendapatan per bulan " + pendapatanTotal);

    }
}
