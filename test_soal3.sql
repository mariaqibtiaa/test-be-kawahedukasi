/*SOAL 3 test-be-kawahedukasi

Nama : Maria Qibtia 
Email : mariaqibtia065118230@gmail.com
Waktu Mulai : 12 Juli 2022 - 11.06
Waktu Selesai : 12 Juli 2022 - 12.39

Soal 3 Bagian 1*/
SELECT nama, gaji gaji_tertinggi 
FROM kawahedukasi 
ORDER BY gaji DESC LIMIT 1;

/* OUTPUT Bagian 1 

    nama : dani muharam
    gaji_tertinggi : 10000000

*/

--Soal 3 Bagian 2
SELECT nama, nilai nilai_tertinggi, gaji gaji_tertinggi 
FROM kawahedukasi 
WHERE kelas='BACKEND' 
ORDER BY gaji DESC, nilai DESC LIMIT 1;

/* OUTPUT Bagian 2 

    nama : Aldan
    nilai_tertinggi : 100
    gaji_tertinggi : 6500000

*/

--Soal 3 Bagian 3
SELECT COUNT(*) total_peserta_frontend 
FROM kawahedukasi 
WHERE kelas='FRONTEND';

/* OUTPUT BAGIAN 3

    total_peserta_frontend : 6

*/

--Soal 3 Bagian 4
SELECT MAX(jumlah_kehadiran) Kehadiran_tertinggi, MAX(nilai) Nilai_tertinggi 
FROM kawahedukasi
WHERE kelas = "FRONTEND";

/* OUTPUT BAGIAN 3

    Kehadiran_tertinggi : 150
    Nilai_tertinggi : 100

*/