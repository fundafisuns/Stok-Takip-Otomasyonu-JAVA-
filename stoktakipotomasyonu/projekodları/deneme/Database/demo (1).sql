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

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`admin_ad`, `admin_sifre`) VALUES
('burcu', 'funda'),
('funda', 'burcu');

--
-- Tablo döküm verisi `malzeme`
--

INSERT INTO `malzeme` (`malzeme_id`, `malzeme_ad`, `malzeme_kategori`, `malzeme_adet`) VALUES
(2, '\r\nKontratabla', 'Ahşap\r\n', 10000),
(3, 'Sunta\r\n', 'Ahşap', 1546),
(4, '\r\nMDFlam\r\n', 'Ahşap', 1411),
(5, 'Köşebentler\r\n', 'Demir', 100),
(6, 'Kutu Profil\r\n', 'Demir', 3000),
(7, 'Çivi\r\n', 'Demir', 10000),
(8, 'El Matkapı', 'El Aleti', 50);

--
-- Tablo döküm verisi `personel`
--

INSERT INTO `personel` (`personel_id`, `personel_ad`, `personel_soyad`, `personel_dept`) VALUES
(2, 'Merve\r\n', 'Ateş\r\n', 'Muhasebe'),
(3, 'Safiye\r ', 'SAĞIR', 'Ar-Ge'),
(6, 'Burcu', 'Sarıdede', 'IOT'),
(10, 'Funda Füsun', 'Sarıkaya', 'Data Science'),
(11, 'Özcan\r', 'Kara', 'Reklam'),
(12, 'Özcan\r', 'Kara', 'Reklam'),
(13, 'Ahmet', 'Kara', 'IOT');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
