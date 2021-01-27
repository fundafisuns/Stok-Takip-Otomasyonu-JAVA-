-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 19 Ara 2020, 23:14:16
-- Sunucu sürümü: 10.4.16-MariaDB
-- PHP Sürümü: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `demo`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `admin_ad` text NOT NULL,
  `admin_sifre` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`admin_ad`, `admin_sifre`) VALUES
('burcu', 'funda'),
('funda', 'burcu');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `malzeme`
--

CREATE TABLE `malzeme` (
  `malzeme_id` int(11) NOT NULL,
  `malzeme_ad` text NOT NULL,
  `malzeme_kategori` text NOT NULL,
  `malzeme_adet` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `malzeme`
--

INSERT INTO `malzeme` (`malzeme_id`, `malzeme_ad`, `malzeme_kategori`, `malzeme_adet`) VALUES
(1, 'Kontrplak\r ', 'Ahşap', '2001'),
(2, '\r\nKontratabla', 'Ahşap\r\n', '10000'),
(3, 'Sunta\r\n', 'Ahşap', '1546'),
(4, '	\r\nMDFlam\r\n', 'Ahşap', '1411'),
(5, 'Köşebentler\r\n', 'Demir', '100'),
(6, 'Kutu Profil\r\n', 'Demir', '3000'),
(8, 'El Matkapı', 'El Aleti', '50'),
(9, 'Hilti', 'Elektrikli Alet', '200020'),
(10, 'Çivi\r ', 'Demir', '10000');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel`
--

CREATE TABLE `personel` (
  `personel_id` int(11) NOT NULL,
  `personel_ad` text NOT NULL,
  `personel_soyad` text NOT NULL,
  `personel_dept` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `personel`
--

INSERT INTO `personel` (`personel_id`, `personel_ad`, `personel_soyad`, `personel_dept`) VALUES
(2, 'Merve\r ', 'AKTAŞ', 'Muhasebe'),
(3, 'Safiye\r ', 'SAĞIR', 'Ar-Ge'),
(5, 'Özcan\r\n', 'Pak\r\n', 'Reklam'),
(7, 'Merve\r ', 'AKTAŞ', 'Muhasebe'),
(11, 'Safiye\r ', 'SAĞIR', 'IT'),
(18, 'Akın', 'Günyel', 'Muhasebe\r\n'),
(19, 'Berkecan', 'Varol', 'Muhasebe\r\n'),
(20, 'Gülnaz ', 'Atılgan', 'İnsan Kaynakları'),
(21, 'Tolga', 'Menge', 'İnsan Kaynakları'),
(22, 'Bartu', 'Işlak', 'İnsan Kaynakları'),
(23, 'Tümay ', 'Tatar', 'İnsan Kaynakları'),
(24, 'Alp', 'Kaçar', 'Satıs-Pazarlama'),
(26, 'emre', 'kumlar', 'IT');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `malzeme`
--
ALTER TABLE `malzeme`
  ADD PRIMARY KEY (`malzeme_id`);

--
-- Tablo için indeksler `personel`
--
ALTER TABLE `personel`
  ADD PRIMARY KEY (`personel_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `malzeme`
--
ALTER TABLE `malzeme`
  MODIFY `malzeme_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Tablo için AUTO_INCREMENT değeri `personel`
--
ALTER TABLE `personel`
  MODIFY `personel_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
