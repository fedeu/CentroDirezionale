create schema Airport_Manager;
use Airport_Manager;

create table Aereo(
	Codice char(10) primary key,
    Citta_di_partenza varchar(20) not null,
    Citta_Arrivo varchar(20) not null,
    Compagnia_aerea varchar(30) not null
);

create table Biglietto(
	Codice char(10) primary key,
    Prezzo float not null,
    Aereo char(10),
		foreign key(Aereo) references Aereo(Codice) on delete set null on update cascade
);

create table Area_di_stallo(
	Numero integer primary key
);

create table Area_parcheggio_dipendenti(
	Numero_Area char(4) primary key,
    Numero_posti integer not null
);

create table Area_parcheggio_clienti(
	Numero_Area char(4) primary key,
    Numero_posti integer not null
);

create table Aeroporto(
	Codice char(10) primary key,
    Citta varchar(20)not null,
    Area_parcheggio_dipendenti char(4),
		foreign key(Area_parcheggio_dipendenti) references Area_parcheggio_dipendenti(Numero_Area) on delete set null on update cascade,
	Area_parcheggio_clienti char(4),
		foreign key(Area_parcheggio_clienti) references Area_parcheggio_clienti(Numero_Area) on delete set null on update cascade,
    Area_di_stallo integer,
		foreign key(Area_di_stallo) references Area_di_stallo(Numero) on delete set null on update cascade
);

create table Centro_Direzionale(
	Nome varchar(20) primary key,
    Aeroporto char(10),
		foreign key(Aeroporto) references Aeroporto(Codice) on delete set null on update cascade
);

create table Biglietteria(
	Codice char(10) primary key,
    Numero_biglietti_venduti integer not null,
    Centro_Direzionale varchar(20),
		 foreign key(Centro_Direzionale) references Centro_Direzionale(Nome) on delete set null on update cascade
);


create table Acquisto(
	Biglietto char(10),
		foreign key(Biglietto) references Biglietto(codice) on delete set null on update cascade,
	Biglietteria char(10),
		foreign key(Biglietteria) references Biglietteria(Codice) on delete set null on update cascade
);

create table Gate(
	Aereo char(10),
		foreign key(Aereo) references Aereo(Codice) on delete set null on update cascade,
	Aeroporto char(10),
		foreign key(Aeroporto) references Aeroporto(Codice) on delete set null on update cascade
);

create table Personale(
	Matricola char(15) primary key,
    Nome varchar(20) not null,
    Cognome varchar(20) not null,
    Tipo varchar(20),
    Stipendio integer not null,
    Centro_Direzionale varchar(20),
		foreign key(Centro_Direzionale) references Centro_Direzionale(Nome) on delete set null on update cascade
);

create table Alloggio(
	Codice_Stanza varchar(5) primary key,
    Costo integer not null,
    Numero_posti integer not null,
    Aeroporto char(10),
		foreign key(Aeroporto) references Aeroporto(Codice) on delete set null on update cascade
);

create table Vendita(
	Alloggio varchar(5),
    Biglietteria char(10),
		foreign key(Alloggio) references Alloggio(Codice_Stanza) on delete set null on update cascade,
		foreign key(Biglietteria) references Biglietteria(Codice) on delete set null on update cascade
);

create table Pullman(
	Numero integer primary key,
    Costo integer not null, 
    Linea varchar(20) not null
);

create table Taxi(
	Numero integer primary key,
    Costo float not null
);

create table Fermata(
	Area_di_Stallo integer,
		foreign key(Area_di_stallo) references Area_di_stallo(Numero) on delete set null on update cascade
);

create table Sosta(
	Area_di_stallo integer,
		foreign key(Area_di_stallo) references Area_di_stallo(Numero) on delete set null on update cascade,
	Taxi integer,
		foreign key(Taxi) references Taxi(Numero) on delete set null on update cascade
);