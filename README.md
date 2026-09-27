
#  Sistem Rental Kendaraan

##  Deskripsi Project

**Sistem Rental Kendaraan** adalah program berbasis Java yang dibuat untuk memenuhi tugas **UTS Pemrograman Berorientasi Objek (PBO)**.

Program ini merupakan sistem sederhana untuk membantu proses rental kendaraan, seperti melihat daftar kendaraan, menghitung biaya sewa berdasarkan lama peminjaman, serta melihat ketentuan diskon yang tersedia.

Program dibuat menggunakan konsep dasar **Object-Oriented Programming (OOP)** pada Java, yaitu:

* Inheritance
* Polymorphism
* Method Overriding
* Method Overloading
* Abstract Class
* Encapsulation
* Conditional Statement (`if-else`)
* Looping (`for`, `enhanced for`, dan `do-while`)
* ArrayList
* Input menggunakan `Scanner`

Program dijalankan melalui **console/terminal NetBeans**.

---

##  Tujuan Project

Tujuan pembuatan program ini adalah:

1. Menerapkan konsep dasar Pemrograman Berorientasi Objek menggunakan Java.
2. Memahami penggunaan inheritance dalam program.
3. Menerapkan polymorphism melalui method overriding.
4. Menerapkan method overloading.
5. Menggunakan percabangan `if-else`.
6. Menggunakan looping untuk menjalankan menu dan menampilkan data.
7. Membuat program sederhana yang dapat menerima input dari pengguna.
8. Menghasilkan sistem rental kendaraan yang mudah digunakan melalui console.

---

#  Teknologi yang Digunakan

| Teknologi | Keterangan                                |
| --------- | ----------------------------------------- |
| Java      | Bahasa pemrograman yang digunakan         |
| NetBeans  | IDE untuk membuat dan menjalankan program |
| Java OOP  | Konsep pemrograman yang diterapkan        |
| ArrayList | Menyimpan daftar kendaraan                |
| Scanner   | Menerima input dari pengguna              |

---

#  Struktur Project

Struktur folder project adalah sebagai berikut:

```text
UTSPBORentalKendaraan/
│
├── src/
│   └── rentalkendaraan/
│       ├── Kendaraan.java
│       ├── Main.java
│       ├── Mobil.java
│       └── Motor.java
│
├── screenshots/
│   ├── menu-utama.png
│   ├── daftar-kendaraan.png
│   └── hasil-sewa.png
│
├── README.md
│
└── .gitignore
```

### Penjelasan File

#### `Kendaraan.java`

Merupakan **abstract class** yang menjadi parent class atau kelas induk untuk jenis kendaraan.

Class ini menyimpan atribut umum kendaraan:

* Merk
* Nomor plat
* Harga sewa per hari

Class ini juga memiliki method:

```java
hitungHargaSewa(int hari)
```

dan overloaded method:

```java
hitungHargaSewa(int hari, double diskon)
```

---

#### `Mobil.java`

Merupakan subclass dari `Kendaraan`.

Class ini digunakan untuk menyimpan informasi kendaraan jenis mobil, seperti:

* Merk mobil
* Nomor plat
* Harga sewa per hari
* Jumlah kursi

Class `Mobil` melakukan **method overriding** terhadap method:

```java
hitungHargaSewa(int hari)
```

Ketentuan diskon mobil:

> Jika lama sewa minimal 5 hari, maka mendapatkan diskon 10%.

---

#### `Motor.java`

Merupakan subclass dari `Kendaraan`.

Class ini digunakan untuk menyimpan informasi kendaraan jenis motor, seperti:

* Merk motor
* Nomor plat
* Harga sewa per hari
* Tipe motor

Class `Motor` juga melakukan **method overriding** terhadap:

```java
hitungHargaSewa(int hari)
```

Ketentuan diskon motor:

> Jika lama sewa minimal 3 hari, maka mendapatkan diskon 5%.

---

#### `Main.java`

Merupakan class utama yang digunakan untuk menjalankan program.

Class ini berisi:

* Menu utama
* Data kendaraan
* Input pengguna
* Perhitungan harga sewa
* Perhitungan diskon
* Validasi input
* Perulangan menu
* Tampilan hasil rental

---

#  Cara Menjalankan Program

## 1. Membuka Project di NetBeans

Buka aplikasi **NetBeans**, kemudian pilih:

```text
File → Open Project
```

Pilih folder:

```text
UTSPBORentalKendaraan
```

Setelah project terbuka, pastikan struktur package terlihat seperti:

```text
Source Packages
└── rentalkendaraan
    ├── Kendaraan.java
    ├── Main.java
    ├── Mobil.java
    └── Motor.java
```

---

## 2. Menjalankan Program

Buka:

```text
Main.java
```

Kemudian jalankan program dengan:

```text
Shift + F6
```

atau klik kanan pada `Main.java`, kemudian pilih:

```text
Run File
```

Program akan berjalan pada bagian **Output** NetBeans.

---

#  Alur Program

Secara umum, alur program adalah:

```text
Mulai
  ↓
Program membuat data kendaraan
  ↓
Menampilkan Menu Utama
  ↓
Pengguna memilih menu
  ↓
 ┌──────────────────────────────┐
 │ 1. Lihat Daftar Kendaraan    │
 │ 2. Hitung Harga Sewa         │
 │ 3. Lihat Ketentuan Diskon    │
 │ 4. Keluar                    │
 └──────────────────────────────┘
  ↓
Program menjalankan menu
  ↓
Kembali ke Menu Utama
  ↓
Pengguna memilih Keluar
  ↓
Selesai
```

Menu utama menggunakan **perulangan `do-while`**, sehingga setelah menyelesaikan suatu menu, pengguna dapat kembali menggunakan menu utama sampai memilih menu **4. Keluar**.

---

#  Penjelasan Menu Program

## 1 Lihat Daftar Kendaraan

Menu pertama digunakan untuk melihat seluruh kendaraan yang tersedia pada sistem rental.

Program akan menampilkan informasi setiap kendaraan, yaitu:

* Jenis kendaraan
* Merk
* Nomor plat
* Harga sewa per hari
* Jumlah kursi untuk mobil
* Tipe motor untuk motor

Contoh data kendaraan yang tersedia:

| No | Jenis | Merk            | Nomor Plat |
| -- | ----- | --------------- | ---------- |
| 1  | Mobil | Toyota Avanza   | KT 1234 AB |
| 2  | Mobil | Honda Brio      | KT 2468 CD |
| 3  | Motor | Honda Vario 160 | KT 5678 EF |
| 4  | Motor | Yamaha NMAX     | KT 9012 GH |

Program menggunakan **looping** untuk menampilkan seluruh data kendaraan.

###  Screenshot Menu 1

Screenshot hasil menu ini diletakkan pada:

(<img width="344" height="274" alt="Screenshot 2026-09-27 235044" src="https://github.com/user-attachments/assets/e1114425-eefe-4f55-bf58-2a59cc06a1f1" />)

Screenshot tersebut menunjukkan tampilan daftar kendaraan yang tersedia pada sistem.

---

# 2️ Hitung Harga Sewa

Menu kedua digunakan untuk menghitung total biaya rental kendaraan berdasarkan:

* Kendaraan yang dipilih
* Lama sewa dalam hari
* Harga sewa per hari
* Diskon berdasarkan jenis kendaraan dan lama sewa

Pertama, pengguna memilih nomor kendaraan.

Contoh:

```text
Pilih nomor kendaraan: 1
```

Kemudian pengguna memasukkan lama sewa:

```text
Masukkan lama sewa (hari): 5
```

Program kemudian menghitung harga normal dan potongan diskon.

### Contoh Perhitungan Mobil

Misalnya pengguna menyewa:

```text
Toyota Avanza
Harga per hari = Rp350.000
Lama sewa = 5 hari
```

Harga normal:

```text
Rp350.000 × 5 = Rp1.750.000
```

Karena mobil disewa minimal 5 hari, maka mendapatkan diskon 10%.

Diskon:

```text
10% × Rp1.750.000
= Rp175.000
```

Total pembayaran:

```text
Rp1.750.000 - Rp175.000
= Rp1.575.000
```

Hasil tersebut kemudian ditampilkan pada console.

###  Screenshot Menu 2

Screenshot hasil perhitungan harga sewa diletakkan pada:

(<img width="331" height="245" alt="Screenshot 2026-09-27 235135" src="https://github.com/user-attachments/assets/0f7044bc-2424-4e9f-b534-832b1bc2845c" />)

Screenshot tersebut menunjukkan hasil perhitungan harga sewa kendaraan, termasuk harga normal, potongan, dan total pembayaran.

---

# 3️ Lihat Ketentuan Diskon

Menu ketiga digunakan untuk melihat aturan diskon yang diterapkan oleh sistem.

Ketentuan diskon:

| Jenis Kendaraan    |      Lama Sewa |           Diskon |
| ------------------ | -------------: | ---------------: |
| Mobil              | Minimal 5 hari |              10% |
| Motor              | Minimal 3 hari |               5% |
| Di bawah ketentuan |              - | Tidak ada diskon |

Contohnya:

```text
Mobil : sewa minimal 5 hari → diskon 10%
Motor : sewa minimal 3 hari → diskon 5%
Selain ketentuan tersebut → tidak ada diskon
```

Menu ini membantu pengguna mengetahui aturan diskon sebelum melakukan perhitungan harga rental.

---

# 4️ Keluar

Menu keempat digunakan untuk mengakhiri program.

Jika pengguna memilih:

```text
4
```

maka program akan menampilkan:

```text
Terima kasih telah menggunakan Sistem Rental Kendaraan.
```

Kemudian program berhenti.

---

#  Penerapan Konsep PBO

Project ini dibuat dengan menerapkan beberapa konsep utama Pemrograman Berorientasi Objek.

## 1. Inheritance

Inheritance digunakan untuk membuat class turunan dari class induk.

Struktur inheritance pada program:

```text
             Kendaraan
              /      \
             /        \
         Mobil        Motor
```

Class `Mobil` dan `Motor` mewarisi atribut dan method dari class `Kendaraan`.

Contohnya:

```java
public class Mobil extends Kendaraan
```

dan:

```java
public class Motor extends Kendaraan
```

Dengan inheritance, kode yang bersifat umum untuk kendaraan dapat diletakkan pada class `Kendaraan` dan digunakan kembali oleh class turunannya.

---

## 2. Polymorphism

Polymorphism diterapkan melalui **method overriding**.

Method:

```java
hitungHargaSewa(int hari)
```

terdapat pada class `Kendaraan` dan kemudian diimplementasikan kembali pada class `Mobil` dan `Motor`.

Contohnya:

```java
@Override
public double hitungHargaSewa(int hari)
```

Pada `Mobil`, terdapat aturan diskon 10% untuk minimal 5 hari.

Sedangkan pada `Motor`, terdapat aturan diskon 5% untuk minimal 3 hari.

Hal ini menunjukkan bahwa method yang sama dapat menghasilkan perilaku yang berbeda sesuai dengan objek yang digunakan.

---

## 3. Method Overloading

Method overloading diterapkan pada class `Kendaraan`.

Terdapat dua method dengan nama yang sama tetapi parameter berbeda:

```java
hitungHargaSewa(int hari)
```

dan:

```java
hitungHargaSewa(int hari, double diskon)
```

Perbedaan jumlah parameter membuat Java dapat membedakan kedua method tersebut.

---

## 4. Abstract Class

Class `Kendaraan` dibuat sebagai:

```java
public abstract class Kendaraan
```

Class ini digunakan sebagai class umum untuk berbagai jenis kendaraan.

Method:

```java
public abstract double hitungHargaSewa(int hari);
```

wajib diimplementasikan oleh class turunannya.

Dengan demikian, setiap jenis kendaraan dapat memiliki cara perhitungan harga sewa yang berbeda.

---

## 5. Encapsulation

Encapsulation diterapkan dengan menggunakan atribut:

```java
protected String merk;
protected String nomorPlat;
protected double hargaPerHari;
```

dan beberapa atribut pada subclass menggunakan:

```java
private
```

Data kemudian diakses menggunakan method seperti:

```java
getMerk()
getNomorPlat()
getHargaPerHari()
```

Hal ini membantu mengatur akses terhadap data yang terdapat di dalam object.

---

# 🔀 Penerapan If-Else

Percabangan `if-else` digunakan untuk menentukan diskon berdasarkan lama sewa.

Pada class `Mobil`:

```java
if (hari >= 5) {
    total = total - (total * 0.10);
} else {
    total = total;
}
```

Artinya:

* Jika sewa minimal 5 hari → diskon 10%.
* Jika kurang dari 5 hari → tidak mendapatkan diskon.

Pada class `Motor`:

```java
if (hari >= 3) {
    total = total - (total * 0.05);
} else {
    total = total;
}
```

Artinya:

* Jika sewa minimal 3 hari → diskon 5%.
* Jika kurang dari 3 hari → tidak mendapatkan diskon.

`if-else` juga digunakan untuk menentukan menu yang dipilih pengguna.

---

#  Penerapan Looping

Program menggunakan beberapa jenis looping.

## 1. Do-While

Digunakan untuk menjalankan menu utama berulang kali.

```java
do {
    tampilkanMenu();

    // pilihan menu

} while (pilihan != 4);
```

Program akan terus menampilkan menu sampai pengguna memilih menu **4. Keluar**.

---

## 2. For Loop

Digunakan untuk menampilkan daftar kendaraan.

```java
for (int i = 0; i < daftarKendaraan.size(); i++) {
    Kendaraan kendaraan = daftarKendaraan.get(i);
}
```

---

## 3. Enhanced For

Digunakan untuk melakukan perulangan terhadap object kendaraan.

```java
for (Kendaraan kendaraan : daftarKendaraan) {
    // menampilkan data kendaraan
}
```

---

## 4. While

Digunakan pada validasi input angka.

```java
while (true) {
    // meminta input sampai pengguna memasukkan angka valid
}
```

Jika pengguna memasukkan input yang bukan angka, program akan meminta input kembali.

---

#  Dokumentasi Screenshot

Screenshot program disimpan pada folder:

```text
screenshots/
```

Strukturnya:

```text
screenshots/
├── menu-utama.png
├── daftar-kendaraan.png
└── hasil-sewa.png
```

## Screenshot 1 — Menu Utama

File:

```text
screenshots/menu-utama.png
```

![Menu Utama](screenshots/menu-utama.png)

Screenshot ini menunjukkan tampilan awal program ketika dijalankan.

Menu yang tersedia:

1. Lihat Daftar Kendaraan
2. Hitung Harga Sewa
3. Lihat Ketentuan Diskon
4. Keluar

---

## Screenshot 2 — Daftar Kendaraan

File:

```text
screenshots/daftar-kendaraan.png
```

![Daftar Kendaraan](screenshots/daftar-kendaraan.png)

Screenshot ini menunjukkan data kendaraan yang tersedia pada sistem, termasuk jenis, merk, nomor plat, harga sewa, dan informasi tambahan kendaraan.

---

## Screenshot 3 — Hasil Perhitungan Sewa

File:

```text
screenshots/hasil-sewa.png
```

![Hasil Sewa](screenshots/hasil-sewa.png)

Screenshot ini menunjukkan hasil perhitungan rental kendaraan berdasarkan lama sewa dan diskon yang diperoleh.

---

# 🧪 Contoh Penggunaan Program

### Contoh 1 — Melihat Daftar Kendaraan

```text
Pilih menu: 1

--------------- DAFTAR KENDARAAN ---------------

Kendaraan ke-1
----------------------------------------------
Jenis        : Mobil
Merk         : Toyota Avanza
Nomor Plat   : KT 1234 AB
Harga/Hari   : Rp350.000
Jumlah Kursi : 7
```

---

### Contoh 2 — Menghitung Harga Rental

```text
Pilih menu: 2

---------------- PILIH KENDARAAN ----------------
1. Mobil - Toyota Avanza (KT 1234 AB)
2. Mobil - Honda Brio (KT 2468 CD)
3. Motor - Honda Vario 160 (KT 5678 EF)
4. Motor - Yamaha NMAX (KT 9012 GH)

Pilih nomor kendaraan: 1
Masukkan lama sewa (hari): 5
```

Hasil:

```text
================ HASIL SEWA ================
Jenis Kendaraan : Mobil
Merk            : Toyota Avanza
Nomor Plat      : KT 1234 AB
Lama Sewa       : 5 hari
Harga Normal    : Rp1.750.000
Potongan        : Rp175.000
TOTAL BAYAR     : Rp1.575.000
============================================
```

---

#  Validasi Input

Program juga memiliki validasi input agar program tidak langsung berhenti ketika pengguna memasukkan data yang tidak sesuai.

Contohnya jika pengguna memasukkan pilihan menu yang tidak tersedia:

```text
Pilih menu: 9

[!] Pilihan tidak tersedia.
```

Jika pengguna memasukkan huruf ketika program meminta angka:

```text
Pilih menu: abc

[!] Masukkan angka yang valid.
```

Jika pengguna memasukkan lama sewa kurang dari atau sama dengan 0:

```text
Masukkan lama sewa (hari): 0

[!] Lama sewa harus lebih dari 0 hari.
```

Validasi ini membuat program lebih aman dan mudah digunakan.

---

#  Kesimpulan

Sistem Rental Kendaraan merupakan program sederhana berbasis Java yang menerapkan konsep dasar **Pemrograman Berorientasi Objek**.

Program memiliki beberapa fitur utama, yaitu:

* Melihat daftar kendaraan.
* Menghitung harga sewa kendaraan.
* Menghitung diskon berdasarkan jenis dan lama sewa.
* Melihat ketentuan diskon.
* Validasi input pengguna.
* Menampilkan hasil transaksi rental.

Konsep PBO yang diterapkan meliputi **inheritance, polymorphism, method overriding, method overloading, abstract class, dan encapsulation**. Selain itu, program juga menerapkan **if-else dan looping** sesuai dengan kebutuhan tugas UTS PBO.

Project ini dibuat sebagai penerapan dasar Java OOP dalam sebuah studi kasus sederhana, yaitu **Sistem Rental Kendaraan**.
