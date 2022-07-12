/*SOAL 1 test-be-kawahedukasi

Nama : Maria Qibtia 
Email : mariaqibtia065118230@gmail.com
Waktu Mulai : 12 Juli 2022 - 11.06
Waktu Selesai : 12 Juli 2022 - 12.39 */

public class test_soal1{
    public static void main(String[] args){
        int[] data = new int[]{1, 2, 4, 3, 10, 11, 20, 5, 100, 200};
        for (int soal1 = 0; soal1 < data.length; soal1++) {
            if(data[soal1] == 5 && data[soal1] == 11) {
            System.out.println("FizzBuzz");
            } else if (data[soal1] == 5) {
                System.out.println("Fizz");
            } else if (data[soal1] == 11) {
                System.out.println("Buzz");
            } else {
                System.out.println(data[soal1]);
            }
        }  
    }
}

/* OUTPUT SOAL 1
    1
    2
    4
    3
    10
    Buzz
    20
    Fizz
    100
    200
*/