/*SOAL 2 test-be-kawahedukasi

Nama : Maria Qibtia 
Email : mariaqibtia065118230@gmail.com
Waktu Mulai : 12 Juli 2022 - 11.06
Waktu Selesai : 12 Juli 2022 - 12.39 */

public class test_soal2 {
    public static void main(String[] args) {

        String[] data = {"1", "ka", "67", "wah", "1772", "edukasi", "7", "98", "-1"};
        for (int i = 0; i < data.length; i++){
            if (i == 8) {
               System.out.println("Index ke " + i + " Tidak bisa di validasi sistem ");
            } else if (i==7) {
                System.out.println("Index ke " + i + " adalah integer " + "dengan data " + data[i]);
            } else if (i%2==1 && i < 7){
                System.out.println("Index ke " + i + " adalah " + data[i].getClass().getSimpleName() + " dengan data " + data[i]);
            } else if (i%2==0) {
                System.out.println("Index ke " + i + " adalah integer " + "dengan data " + data[i]);
            }
        }
    }
}

/* OUTPUT SOAL 2
    Index ke 0 adalah integer dengan data 1
    Index ke 1 adalah String dengan data ka
    Index ke 2 adalah integer dengan data 67
    Index ke 3 adalah String dengan data wah
    Index ke 4 adalah integer dengan data 1772
    Index ke 5 adalah String dengan data edukasi
    Index ke 6 adalah integer dengan data 7
    Index ke 7 adalah integer dengan data 98
    Index ke 8 Tidak bisa di validasi sistem 
 */