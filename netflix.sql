-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 31 May 2020, 13:49:44
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `netflix`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici`
--

CREATE TABLE `kullanici` (
  `isim` varchar(50) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `sifre` varchar(50) NOT NULL,
  `d_gunu` date NOT NULL,
  `sevdigi1` varchar(250) NOT NULL,
  `sevdigi2` varchar(250) NOT NULL,
  `sevdigi3` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `kullanici`
--

INSERT INTO `kullanici` (`isim`, `mail`, `sifre`, `d_gunu`, `sevdigi1`, `sevdigi2`, `sevdigi3`) VALUES
('ab', 'ab', '12', '1999-11-20', 'Aksiyon ve Macera', 'Komedi', 'Reality Program'),
('Evren', 'evrenustun@gmail.com', '12345', '1999-11-20', 'Aksiyon', 'Bilim Kurgu', 'Komedi');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici_program`
--

CREATE TABLE `kullanici_program` (
  `izlemetarihi` date NOT NULL,
  `kaldıgıdk` int(11) NOT NULL,
  `kaldıgısn` int(11) NOT NULL,
  `kaldıgıbolum` int(11) NOT NULL,
  `puan` int(11) NOT NULL,
  `programadi` varchar(250) NOT NULL,
  `mail` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `kullanici_program`
--

INSERT INTO `kullanici_program` (`izlemetarihi`, `kaldıgıdk`, `kaldıgısn`, `kaldıgıbolum`, `puan`, `programadi`, `mail`) VALUES
('2020-05-29', 0, 13, 2, 0, 'Stranger Tings', 'ab'),
('2020-05-30', 0, 3, 0, 4, 'Maske', 'ab'),
('2020-05-31', 0, 20, 2, 8, 'Atiye', 'evrenustun@gmail.com');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `programlar`
--

CREATE TABLE `programlar` (
  `program_id` int(11) NOT NULL,
  `ad` varchar(250) NOT NULL,
  `tur` varchar(250) NOT NULL,
  `tip` varchar(50) NOT NULL,
  `puan` float NOT NULL,
  `oylamasayisi` int(11) NOT NULL,
  `bolumsayisi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `programlar`
--

INSERT INTO `programlar` (`program_id`, `ad`, `tur`, `tip`, `puan`, `oylamasayisi`, `bolumsayisi`) VALUES
(36, '72 sevimli hayvan', 'Belgesel, Bilim ve Doğa', 'Film', 7, 20, 1),
(22, 'Alaca Karanlık', 'Aksiyon ve Macera, Romantik', 'Film', 5, 20, 1),
(46, 'Alvin ve Sincaplar', 'Çocuk ve Aile', 'Film', 6, 20, 1),
(54, 'Angry Birds', 'Çocuk ve Aile, Komedi', 'Dizi', 3, 20, 10),
(42, 'Arif V 216', 'Bilim Kurgu, Komedi', 'Film', 4.41667, 24, 1),
(12, 'Assassın\'s Creed', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 6, 20, 1),
(21, 'Atiye', 'Aksiyon ve Macera, Romantik', 'Dizi', 4.36364, 22, 15),
(30, 'Ay\'daki Son Adam', 'Belgesel', 'Film', 4, 20, 1),
(69, 'Basketball or Nothing', 'Reality Program', 'Tv Show', 8, 20, 12),
(2, 'Başlangıç', 'Aksiyon ve Macera', 'Film', 3, 20, 1),
(37, 'Ben Efsaneyim', 'Bilim Kurgu ve Fantastik Yapımlar', 'Film', 4, 20, 1),
(63, 'Beni Böyle Sev', 'Drama, Romantik', 'Dizi', 4, 20, 27),
(24, 'Beyblade', 'Anime, Çocuk ve Aile', 'Dizi', 7, 20, 23),
(59, 'Bizi Hatırla', 'Drama', 'Film', 7, 20, 1),
(68, 'Büyük Tasarımlar', 'Reality Program', 'Tv Show', 8, 20, 12),
(67, 'Car Masters', 'Reality Program', 'Tv Show', 7, 20, 17),
(56, 'Charlie\'nin Çikolata Fabrikası', 'Çocuk ve Aile, Komedi', 'Film', 8, 20, 1),
(65, 'Criminal', 'Gerilim', 'Dizi', 1, 20, 65),
(66, 'Da Vinci Şifresi', 'Gerilim', 'Film', 7, 20, 1),
(58, 'Dangal', 'Drama', 'Film', 8, 20, 1),
(62, 'Delibal', 'Drama, Romantik', 'Film', 9, 20, 1),
(7, 'Diriliş Ertuğrul', 'Aksiyon ve Macera', 'Dizi', 6, 20, 34),
(25, 'Dream Big', 'Belgesel', 'Film', 5, 20, 1),
(72, 'Dünyanın En Sıra Dışı Evleri', 'Reality Program', 'Tv Show', 5, 20, 26),
(48, 'Ejderhalar', 'Çocuk ve Aile, Aksiyon ve Macera', 'Dizi', 4, 20, 11),
(17, 'Fantastik Canavarlar', 'Aksiyon ve Macera, Çocuk ve Aile', 'Film', 1, 20, 1),
(39, 'Frankestein', 'Bilim Kurgu ve Fantastik Yapımlar, Aksiyon, Korku', 'Film', 4, 20, 1),
(34, 'Gezegenimiz', 'Belgesel, Bilim ve Doğa', 'Film', 8.82609, 23, 1),
(16, 'Harry Potter lüm Yadigarları', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar, Çocuk ve Aile', 'Film', 5, 20, 1),
(74, 'How I met your mother', 'Romantik', 'Dizi', 6, 20, 5),
(18, 'Interstellar', 'Aksiyon ve Macera, Drama', 'Film', 7, 20, 1),
(64, 'Jaws', 'Gerilim', 'Film', 10, 20, 1),
(38, 'Jurassıc Park', 'Bilim Kurgu ve Fantastik Yapımlar, Aksiyon', 'Film', 3, 20, 1),
(3, 'Jurassic World', 'Aksiyon ve Macera', 'Film', 4, 20, 1),
(10, 'Kara Şövalye', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 8.90476, 21, 1),
(60, 'Kardeşim Benim', 'Drama, Komedi', 'Film', 9.32, 25, 1),
(49, 'Kung Fu Panda', 'Çocuk ve Aile, Aksiyon ve Macera', 'Film', 5, 20, 1),
(1, 'Kung Fu Panda Muhteşem Sırlar', 'Aksiyon', 'Dizi', 7, 20, 54),
(33, 'Kuşçular', 'Belgesel, Bilim ve Doğa', 'Film', 3, 20, 1),
(27, 'Kuşlarla Dans', 'Belgesel', 'Film', 2, 20, 1),
(73, 'Leyla ile Mecnun', 'Romantik', 'Dizi', 7, 20, 53),
(35, 'Marsta Keşif', 'Belgesel, Bilim ve Doğa', 'Film', 8, 20, 1),
(6, 'Marwel\' Iron Fist', 'Aksiyon ve Macera', 'Dizi', 6, 20, 62),
(47, 'Maşa ve Koca Ayı', 'Çocuk ve Aile', 'Dizi', 7, 20, 23),
(9, 'Maske', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 6.85714, 21, 1),
(52, 'Mega Zeka', 'Çocuk ve Aile, Komedi', 'Film', 5, 20, 1),
(28, 'Mercan Peşinde', 'Belgesel', 'Film', 7, 20, 1),
(26, 'Mission Blue', 'Belgesel', 'Film', 4, 20, 1),
(45, 'Mr. Bean Tatilde', 'Çocuk ve Aile', 'Film', 9, 20, 1),
(13, 'Ninja Kaplumbağalar', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 7, 20, 1),
(11, 'Örümcek Adam', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 8, 20, 1),
(32, 'Pandemic', 'Belgesel, Bilim ve Doğa', 'Film', 6, 20, 1),
(57, 'Patron Bebek Yine İş başında', 'Çocuk ve Aile, Komedi', 'Dizi', 7, 20, 16),
(40, 'pk', 'Bilim Kurgu ve Fantastik Yapımlar, Romantik', 'Film', 4, 20, 1),
(29, 'Plastik Okyanus', 'Belgesel', 'Film', 5, 20, 1),
(43, 'Pokemon', 'Çocuk ve Aile', 'Film', 6, 20, 1),
(31, 'Rakamlarla Tahmin', 'Belgesel', 'Film', 7, 20, 1),
(4, 'Recep İvedik 6', 'Aksiyon ve Macera', 'Film', 8, 20, 1),
(44, 'Scooby-Doo', 'Çocuk ve Aile', 'Film', 10, 20, 1),
(5, 'Sherlock Holmes', 'Aksiyon ve Macera', 'Film', 2, 20, 1),
(51, 'Shrek', 'Çocuk ve Aile, Komedi', 'Film', 5, 20, 1),
(71, 'Sıradışı Kulübeler', 'Reality Program', 'Tv Show', 8, 20, 24),
(53, 'Şirinler', 'Çocuk ve Aile, Komedi', 'Film', 4, 20, 1),
(23, 'Sonic X', 'Anime, Aksiyon ve Macera', 'Dizi', 4, 20, 54),
(20, 'Stranger Tings', 'Aksiyon ve Macera, Korku', 'Dizi', 4.59374, 32, 28),
(55, 'Sünger Bob', 'Çocuk ve Aile, Komedi', 'Dizi', 7, 20, 56),
(70, 'The Big Family Cooking', 'Reality Program', 'Tv Show', 10, 20, 12),
(19, 'The Blacklist', 'Aksiyon ve Macera, Gerilim', 'Dizi', 8, 20, 16),
(61, 'The Originals', 'Drama, Korku', 'Dizi', 9, 20, 29),
(8, 'Transformers Kayıp Çağ', 'Aksiyon ve Macera', 'Film', 7, 20, 1),
(50, 'Trol Avcıları: Arcadia Hikayeleri', 'Çocuk ve Aile, Aksiyon ve Macera', 'Dizi', 6, 20, 48),
(41, 'Yerçekimi', 'Bilim Kurgu, Drama', 'Film', 8, 20, 1),
(14, 'Yüzüklerin Efendisi İki Kule', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 4, 20, 1),
(15, 'Yüzüklerin Efendisi kralın Dönüşü', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 10, 20, 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `program_tur`
--

CREATE TABLE `program_tur` (
  `program_id` int(11) NOT NULL,
  `tur_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tur`
--

CREATE TABLE `tur` (
  `tur_id` int(11) NOT NULL,
  `turadi` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `tur`
--

INSERT INTO `tur` (`tur_id`, `turadi`) VALUES
(1, 'Aksiyon'),
(2, 'Aksiyon ve Macera\r\n'),
(3, 'Anime'),
(4, 'Belgesel'),
(5, 'Bilim Kurgu'),
(6, 'Bilim Kurgu ve Fantastik Yapımlar'),
(7, 'Bilim ve Doğa'),
(8, 'Çocuk ve Aile'),
(9, 'Drama'),
(10, 'Gerilim'),
(11, 'Komedi'),
(12, 'Korku'),
(13, 'Reality Program'),
(14, 'Romantik');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kullanici`
--
ALTER TABLE `kullanici`
  ADD UNIQUE KEY `mail` (`mail`);

--
-- Tablo için indeksler `kullanici_program`
--
ALTER TABLE `kullanici_program`
  ADD KEY `mail` (`mail`),
  ADD KEY `programadi` (`programadi`);

--
-- Tablo için indeksler `programlar`
--
ALTER TABLE `programlar`
  ADD UNIQUE KEY `ad` (`ad`),
  ADD UNIQUE KEY `program_id` (`program_id`);

--
-- Tablo için indeksler `program_tur`
--
ALTER TABLE `program_tur`
  ADD UNIQUE KEY `program_id` (`program_id`),
  ADD UNIQUE KEY `tur_id` (`tur_id`);

--
-- Tablo için indeksler `tur`
--
ALTER TABLE `tur`
  ADD UNIQUE KEY `turadi` (`turadi`),
  ADD UNIQUE KEY `tur_id` (`tur_id`);

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `kullanici_program`
--
ALTER TABLE `kullanici_program`
  ADD CONSTRAINT `kullanici_program_ibfk_1` FOREIGN KEY (`mail`) REFERENCES `kullanici` (`mail`),
  ADD CONSTRAINT `kullanici_program_ibfk_2` FOREIGN KEY (`programadi`) REFERENCES `programlar` (`ad`);

--
-- Tablo kısıtlamaları `program_tur`
--
ALTER TABLE `program_tur`
  ADD CONSTRAINT `program_tur_ibfk_1` FOREIGN KEY (`program_id`) REFERENCES `programlar` (`program_id`),
  ADD CONSTRAINT `program_tur_ibfk_2` FOREIGN KEY (`tur_id`) REFERENCES `tur` (`tur_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
