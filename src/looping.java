public class looping {
    public static void main(String [] args ){
//        for (int i=1; i<=10; i++ ){
//            if (i%2==0){
//                System.out.println(i+" Adalah Bilangan Genap");
//            }else {
//                System.out.println(i+" Adalah Bilangan Ganjil");
//            }
//            System.out.println("Program menentukan bilangan gannjil genap");
//        }
//        int w =1;
//        int x =5;
//        while(w<=x){
//            System.out.println("Hallo "+w);
//            w++;
//        }
//        int y=1;
//        int z=5;
//        do{
//            System.out.println("Java "+y);
//            y+=1;
//        } while (y<=z);
//        int n = 5; // tinggi segitiga
//
//        for (int i = 1; i <= n; i++) {
//            // cetak spasi
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            // cetak bintang
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int n = 5; // tinggi segitiga

        for (int i = 1; i <= n; i++) {
            // cetak spasi
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
