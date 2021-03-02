CREATE TABLE cities (
  `IRSZ` varchar(10) NOT NULL,
  `Település` varchar(100) NOT NULL,
  `Településrész` varchar(100) DEFAULT NULL);

INSERT INTO `cities` (`IRSZ`, `Település`, `Településrész`) VALUES
	('2000', 'Szentendre', ''),
	('2009', 'Pilisszentlászló', ''),
	('2011', 'Budakalász', ''),
	('2013', 'Pomáz', ''),
	('2014', 'Csobánka', ''),
	('2015', 'Szigetmonostor', ''),
	('2016', 'Leányfalu', ''),
	('2017', 'Pócsmegyer', '');