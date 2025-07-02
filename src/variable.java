public class variable {
    public static void main(String []args){
/*    VARIABLE */
     int price =10000;
     float diskon=2.5f;
     float total=(diskon/100)*price;
     double bayar=price-total;
        System.out.printf("Diskon = "+"%.2f\n",total);
        System.out.printf("Harga "+"%.2f\n",bayar);
    }
}
