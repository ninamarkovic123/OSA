insert into prodaja (prodaja_id, datum_od, datum_do, procenat, text, korisnik_id) values (1, '2021-08-01', '2020-06-12', 10, 'Akcija',1)

insert into articles(id,opis_artikla,oznaka_artikla,naziv_artikla,path,deleted,korisnik_id) values(1,'Jafa cokoladni keks', 6, 'Jafa proizvod', 'path',0,1)


insert into prodaja_artikla values (1,1)

insert into korisnici(dtype, korisnik_id, ime, prezime, lozinka, tip_korisnika, blocked,  korisnickoime, adresa, datum_od,email, naziv) values ('Prodavac',1, 'a', 'a', 'a', 1, 0, 'a', 'a', '2021-08-05', 'a','a')