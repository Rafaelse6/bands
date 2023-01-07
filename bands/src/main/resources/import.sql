INSERT INTO tb_genre(name, description) VALUES ('Metal', ' Heavily distorted guitar riffs and chords, powerful drumming, extra low-range bass notes, and aggressive or throaty vocals.');
INSERT INTO tb_genre(name, description) VALUES ('Rock', 'Popular music usually played on electronically amplified instruments and characterized by a persistent heavily accented beat');

INSERT INTO tb_band(name, year_Of_Foundation, place_Of_Origin) VALUES ('Iron Maiden', 1975, 'UK');
INSERT INTO tb_band(name, year_Of_Foundation, place_Of_Origin) VALUES ('Helloween', 1984, 'GER');
INSERT INTO tb_band(name, year_Of_Foundation, place_Of_Origin) VALUES ('Titãs', 1982, 'BR');

INSERT INTO tb_album(title,release_Date,format, album_Number, band_id) VALUES ('Fear Of The Dark', '1992-05-11T03:00:00Z', 'CD/Vinyl Disc',9,1);
INSERT INTO tb_album(title,release_Date,format, album_Number, band_id) VALUES ('Piece Of Mind', '1983-05-16T03:00:00Z', 'CD/Vinyl Disc',9,1);
INSERT INTO tb_album(title,release_Date,format, album_Number, band_id) VALUES ('Walls of Jericho', '1987-11-18T03:00:00Z', 'CD/Vinyl Disc',3,1);
INSERT INTO tb_album(title,release_Date,format, album_Number, band_id) VALUES ('Cabeça Dinossauro', '1986-06-25T03:00:00Z', 'CD/Vinyl Disc',2,1);

INSERT INTO tb_song(title, album_id) VALUES ('Fear Of The Dark', 1);
INSERT INTO tb_song(title, album_id) VALUES ('Piece Of Mind', 2);
INSERT INTO tb_song(title, album_id) VALUES ('Judas', 3);
INSERT INTO tb_song(title, album_id) VALUES ('Porrada', 4);

INSERT INTO tb_song_genre(song_id, genre_id) VALUES (1,1);
INSERT INTO tb_song_genre(song_id, genre_id) VALUES (2,1);
INSERT INTO tb_song_genre(song_id, genre_id) VALUES (3,1);
INSERT INTO tb_song_genre(song_id, genre_id) VALUES (4,2);





