INSERT INTO tb_genre(name, description) VALUES ('Metal', ' Heavily distorted guitar riffs and chords, powerful drumming, extra low-range bass notes, and aggressive or throaty vocals.');
INSERT INTO tb_genre(name, description) VALUES ('Rock', 'Popular music usually played on electronically amplified instruments and characterized by a persistent heavily accented beat');

INSERT INTO tb_album(title,release_Date,format, album_Number) VALUES ('Fear Of The Dark', '1992-05-11T03:00:00Z', 'CD/Vinyl Disc',9);
INSERT INTO tb_album(title,release_Date,format, album_Number) VALUES ('Piece Of Mind', '1983-05-16T03:00:00Z', 'CD/Vinyl Disc',9);
INSERT INTO tb_album(title,release_Date,format, album_Number) VALUES ('Walls of Jericho', '1987-11-18T03:00:00Z', 'CD/Vinyl Disc',9);
INSERT INTO tb_album(title,release_Date,format, album_Number) VALUES ('Cabeça Dinossauro', '1986-06-25T03:00:00Z', 'CD/Vinyl Disc',3);

INSERT INTO tb_artist(name, address,album_id) VALUES ('Steve Harris', 'UK, 10th Street', 1);
INSERT INTO tb_artist(name, address,album_id) VALUES ('Bruce Dickson', 'UK, 10th Street', 1);
INSERT INTO tb_artist(name, address,album_id) VALUES ('Kai Hansen', 'GER, 10th Street', 2);
INSERT INTO tb_artist(name, address,album_id) VALUES ('Arnaldo Antunes', 'BR, 11th Street', 3);

INSERT INTO tb_band(name, place_Of_Origin, year_Of_Foundation, artist_id) VALUES ('Iron Maiden', 'UK', 1975, 1);
INSERT INTO tb_band(name, place_Of_Origin, year_Of_Foundation, artist_id) VALUES ('Helloween', 'GER', 1984, 3);
INSERT INTO tb_band(name, place_Of_Origin, year_Of_Foundation, artist_id) VALUES ('Titãs', 'BR', 1982, 4);


INSERT INTO tb_song(title,album_id) VALUES ('Fear Is The Key', 1);
INSERT INTO tb_song(title,album_id) VALUES ('Flight Of Icarus', 2);
INSERT INTO tb_song(title,album_id) VALUES ('Judas', 3);
INSERT INTO tb_song(title,album_id) VALUES ('Porrada', 4);

INSERT INTO tb_song_genre(song_id, genre_id) VALUES (1,1);
INSERT INTO tb_song_genre(song_id, genre_id) VALUES (2,1);
INSERT INTO tb_song_genre(song_id, genre_id) VALUES (3,1);
INSERT INTO tb_song_genre(song_id, genre_id) VALUES (4,2);








