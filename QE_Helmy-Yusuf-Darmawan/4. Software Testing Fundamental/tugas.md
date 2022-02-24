### Task 

1. line coverage adalah mengevaluasi pada seberapa banyak baris kode yang ditulis telah dilakukan testing
Mutation Coverage adalah teknik pengujian yang digunakan untuk meningkatkan kecukupan pengujian dan mengidentifikasi cacat dalam kode.

 untuk name dengan jenis .entity memiliki line coverage adalah 67% dan mutation Coverage nya sebesar 67%. Jika mutation Coverage dibawah 100% maka test case belum cukup, test case perlu ditambah lagi hingga mutant yang not killable menjadi killable dan mutation score menjadi 100% maka langkah yang perlu dilakukan adalah menambahkan test case untuk program tersebut. Jika test case tersebut terhitung mendapatkan nilai yang berbeda dari expected outcome, maka mutant tersebut dinyatakan terbunuh. Setelah semua mutant terbunuh, maka akan didapatkan mutation score senilai 100%. Jika mutation score sudah 100%, maka test case sudah cukup, sebanyak 6 baris baru dievaluasi dan di testing dari 9 baris maka perlu dilakukan testing kembali untuk mencapai 100%.

untuk name dengan jenis .service memiliki nilai line Coverage 100% dan Mutation Coverage 75%. maka perlu diadakannya lagi test case hingga mencapai 100%. Jika mutation score sudah 100% maka test case sudah sempurna.untuk line Coverage sudah 100% artinya semua baris kode yang ditulis sudah dilakukan testing

2. Kesimpulan dari Task ini yaitu ketika execute maka muncul error Metode dalam kelas CalculatorServiceImpl secara syntax terdapat fungsi add yang didalamnya ada a dan b. didalamnya terdapat fungsi c = data a ditambah data b lalu ketika selesai maka kembali ke c
lalu untuk fungsi subtract didalamnya ada a dan b. didalamnya terdapat fungsi c = data a dikurang data b lalu ketika selesai maka kembali ke c.
