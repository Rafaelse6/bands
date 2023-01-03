INSERT INTO tb_genre(name, description) VALUES ('Metal', ' Heavily distorted guitar riffs and chords, powerful drumming, extra low-range bass notes, and aggressive or throaty vocals.');
INSERT INTO tb_genre(name, description) VALUES ('Classical', 'Music written in a Western musical tradition, usually using an established form');

INSERT INTO tb_song(title) VALUES ('Fear Is The Key');
INSERT INTO tb_song(title) VALUES ('Judas');
INSERT INTO tb_song(title) VALUES ('Piano Sonata n16');

INSERT INTO tb_song_genre(song_id, genre_id) VALUES (1,1);
INSERT INTO tb_song_genre(song_id, genre_id) VALUES (2,1);
INSERT INTO tb_song_genre(song_id, genre_id) VALUES (3,2);

INSERT INTO tb_album(title,release_Date,format,album_Number) VALUES ('Fear Of The Dark', '1992-05-11T03:00:00Z', 'CD/Vinyl Disc', 9);
INSERT INTO tb_album(title,release_Date,format,album_Number) VALUES ('Walls of Jericho', '1987-11-18T03:00:00Z', 'CD/Vinyl Disc', 9);
INSERT INTO tb_album(title,release_Date,format,album_Number) VALUES ('Mozart Piano Sonatas Vol.3 - Wigmore Halls Live', '2015-01-01T03:00:00Z', 'Digital Platforms', 3);