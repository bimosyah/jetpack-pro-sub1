package syahputro.bimo.submission1.utils;

import java.util.ArrayList;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.data.TvshowEntity;

public class FakeDataDummy {
    public static ArrayList<MovieEntity> generateDummyMovie() {
        ArrayList<MovieEntity> movies = new ArrayList<>();
        movies.add(new MovieEntity("Avengers: Infinity War (2018)",
                R.drawable.movie_poster_infinity_war,
                "Petualangan | Aksi | Fantasi",
                "83",
                "Ketika Avengers dan sekutu mereka terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh satu pahlawan, bahaya baru telah muncul dari bayang-bayang kosmik: Thanos. Seorang lalim penghinaan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan tak terbayangkan, dan menggunakannya untuk menimbulkan keinginannya yang terpelintir pada semua kenyataan. Segala yang Avengers telah perjuangkan telah mengarah ke saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti"));
        movies.add(new MovieEntity("Aquaman (2018)",
                R.drawable.movie_poster_aquaman,
                "Petualangan | Aksi | Fantasi",
                "68",
                "Dulunya merupakan rumah bagi peradaban paling maju di Bumi, Atlantis sekarang merupakan kerajaan bawah laut yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan yang sangat besar, Orm berencana untuk menaklukkan orang-orang samudera yang tersisa dan kemudian ke permukaan dunia. Yang menghalangi jalannya adalah Arthur Curry, lelaki setengah manusia Orm, setengah saudara Atlantis dan pewaris sejati takhta."));
        movies.add(new MovieEntity("Bohemian Rhapsody (2018)",
                R.drawable.movie_poster_bohemian,
                "Drama | Musik",
                "81",
                "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor dan gitaris John Deacon mengambil dunia musik dengan badai ketika mereka membentuk band rock n roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercurys yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band bersama di tengah kesuksesan dan kelebihan."));
        movies.add(new MovieEntity("Bumblebee (2018)",
                R.drawable.movie_poster_bumblebee,
                "Aksi | Petualangan | Fiksi ilmiah",
                "81",
                "Dalam pelarian pada tahun 1987, Bumblebee menemukan tempat perlindungan di tempat barang rongsokan di kota pantai kecil California. Charlie, di puncak usia 18 dan berusaha menemukan tempatnya di dunia, menemukan Bumblebee, bekas luka pertempuran dan patah. Ketika Charlie menghidupkannya, dia dengan cepat mengetahui bahwa ini bukan bug VW kuning biasa."));
        movies.add(new MovieEntity("Creed (2018)",
                R.drawable.movie_poster_creed,
                "Aksi | Petualangan | Fiksi ilmiah",
                "81",
                "Dalam pelarian pada tahun 1987, Bumblebee menemukan tempat perlindungan di tempat barang rongsokan di kota pantai kecil California. Charlie, di puncak usia 18 dan berusaha menemukan tempatnya di dunia, menemukan Bumblebee, bekas luka pertempuran dan patah. Ketika Charlie menghidupkannya, dia dengan cepat mengetahui bahwa ini bukan bug VW kuning biasa."));
        movies.add(new MovieEntity("Once Upon a Deadpool (2018)",
                R.drawable.movie_poster_deadpool,
                "Aksi | Komedi",
                "69",
                "Fred Savage yang diculik dipaksa untuk menahan Deadpool PG-13 membawakan Deadpool 2 sebagai kisah Putri Pengantin yang penuh keajaiban, keajaiban, dan nol Fs."));
        movies.add(new MovieEntity("Glass (2019)",
                R.drawable.movie_poster_glass,
                "Thriller | Drama | Fiksi ilmiah",
                "65",
                "Dalam serangkaian pertemuan yang meningkat, mantan penjaga keamanan David Dunn menggunakan kemampuan supernaturalnya untuk melacak Kevin Wendell Crumb, seorang lelaki terganggu yang memiliki dua puluh empat kepribadian. Sementara itu, kehadiran bayangan Elia Price muncul sebagai seorang orkestra yang menyimpan rahasia penting bagi keduanya."));
        movies.add(new MovieEntity("Hunter Killer (2018)",
                R.drawable.movie_poster_hunterkiller,
                "Thiriller | Aksi",
                "63",
                "Kapten Glass dari USS Arkansas menemukan bahwa kudeta sedang terjadi di Rusia, jadi ia dan krunya bergabung dengan kelompok elit yang bekerja di lapangan untuk mencegah perang."));
        movies.add(new MovieEntity("The Mule (2018)",
                R.drawable.movie_poster_themule,
                "Thriller | Kejahatan | Drama",
                "65",
                "Earl Stone, seorang pria berusia 80-an, bangkrut, sendirian, dan menghadapi penyitaan bisnisnya ketika ia ditawari pekerjaan yang hanya mengharuskannya mengemudi. Cukup mudah, tetapi, tanpa diketahui Earl, dia baru saja mendaftar sebagai kurir narkoba untuk kartel Meksiko. Dia melakukannya dengan baik sehingga muatannya meningkat secara eksponensial, dan Earl menabrak radar agen DEA yang sibuk mengisi daya."));
        movies.add(new MovieEntity("Venom (2018)",
                R.drawable.movie_poster_venom,
                "Fiksi Ilmiah | Tindakan",
                "66",
                "Earl Stone, seorang pria berusia 80-an, bangkrut, sendirian, dan menghadapi penyitaan bisnisnya ketika ia ditawari pekerjaan yang hanya mengharuskannya mengemudi. Cukup mudah, tetapi, tanpa diketahui Earl, dia baru saja mendaftar sebagai kurir narkoba untuk kartel Meksiko. Dia melakukannya dengan baik sehingga muatannya meningkat secara eksponensial, dan Earl menabrak radar agen DEA yang sibuk mengisi daya"));
        return movies;
    }

    public static ArrayList<TvshowEntity> generateDummyTvshow() {
        ArrayList<TvshowEntity> tvshows = new ArrayList<>();
        tvshows.add(new TvshowEntity("Arrow",
                R.drawable.tv_poster_arrow,
                "Petualangan | Aksi | Fantasi",
                "58",
                "Playboy miliarder manja, Oliver Queen, hilang dan diduga tewas ketika kapal pesiarnya hilang di laut. Dia kembali lima tahun kemudian seorang pria yang berubah, bertekad untuk membersihkan kota sebagai main hakim sendiri bersenjatakan busur"));
        tvshows.add(new TvshowEntity("Doom Patrol",
                R.drawable.tv_poster_doom_patrol,
                "Petualangan | Aksi | Fantasi",
                "63",
                "Anggota Patroli Doom masing-masing mengalami kecelakaan mengerikan yang memberi mereka kemampuan manusia super - tetapi juga membuat mereka terluka dan cacat. Trauma dan tertindas, tim menemukan tujuan melalui Ketua, yang menyatukan mereka untuk menyelidiki fenomena aneh yang ada - dan untuk melindungi Bumi dari apa yang mereka temukan"));
        tvshows.add(new TvshowEntity("Dragon Ball",
                R.drawable.tv_poster_dragon_ball,
                "Drama",
                "70",
                "Dahulu kala di pegunungan, seorang master pertempuran yang dikenal sebagai Gohan menemukan seorang bocah aneh yang ia beri nama Goku. Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia mati. Bocah muda dan sangat kuat itu sendirian, tetapi mudah dikelola. Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya untuk bola naga membawanya ke rumah Goku. Bersama-sama, mereka berangkat untuk menemukan ketujuh bola naga dalam sebuah petualangan"));
        tvshows.add(new TvshowEntity("Family Guy",
                R.drawable.tv_poster_family_guy,
                "Aksi | Petualangan | Fiksi ilmiah",
                "65",
                "Seri animasi animasi Freakin Sweet yang sakit, terpelintir, tidak benar, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri."));
        tvshows.add(new TvshowEntity("The Flash",
                R.drawable.tv_poster_flash,
                "Aksi | Petualangan | Fiksi ilmiah",
                "66",
                "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat.Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat yang hidup, tetapi itu tidak akan lama sebelum dunia mengetahui apa Barry Allen telah menjadi The Flash"));
        tvshows.add(new TvshowEntity("Gotham",
                R.drawable.tv_poster_gotham,
                "Aksi | Komedi",
                "69",
                "Sebelum ada Batman, ada GOTHAM. Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordons dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker"));
        tvshows.add(new TvshowEntity("Hanna",
                R.drawable.tv_poster_hanna,
                "Thriller | Drama | Fiksi ilmiah",
                "66",
                "Drama yang menegangkan dan menjadi dewasa ini mengikuti perjalanan seorang gadis muda yang luar biasa ketika ia menghindari pengejaran tanpa henti dari seorang agen CIA yang tidak ada buku dan mencoba untuk menggali kebenaran di balik siapa dirinya. Berdasarkan film Joe Wright 2011."));
        tvshows.add(new TvshowEntity("Naruto Shippuden",
                R.drawable.tv_poster_naruto_shipudden,
                "Thiriller | Aksi",
                "76",
                "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki."));
        tvshows.add(new TvshowEntity("NCIS",
                R.drawable.tv_poster_ncis,
                "Thriller | Kejahatan | Drama",
                "67",
                "Dari pembunuhan dan spionase hingga terorisme dan kapal selam curian, tim agen khusus menyelidiki kejahatan apa pun yang memiliki sedikit bukti yang terhubung dengan personel Angkatan Laut dan Korps Marinir, terlepas dari pangkat atau posisi."));
        tvshows.add(new TvshowEntity("Riverdale",
                R.drawable.tv_poster_riverdale,
                "Fiksi Ilmiah | Tindakan",
                "70",
                "Berada di masa kini, seri ini menawarkan pandangan yang berani dan subversif pada Archie, Betty, Veronica dan teman-teman mereka, menjelajahi surreality kehidupan kota kecil, kegelapan dan keanehan yang menggelegak di bawah fasad sehat Riverdale"));
        return tvshows;
    }
}
