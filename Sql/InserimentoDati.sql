	insert into aereo(Codice, Citta_di_partenza, Citta_Arrivo, Compagnia_aerea)
		values('BR00001456', 'Berlino', 'Roma', 'Alitalia');
		
	insert into aereo(Codice, Citta_di_partenza, Citta_Arrivo, Compagnia_aerea)
		values('VN00003679', 'Vienna', 'Parigi', 'Lufthansa');

	insert into aereo(Codice, Citta_di_partenza, Citta_Arrivo, Compagnia_aerea)
		values('GB00001786', 'Londra', 'Barcellona', 'RyanAir');

	insert into aereo(Codice, Citta_di_partenza, Citta_Arrivo, Compagnia_aerea)
		values('LB00008966', 'Lisbona', 'Amsterdam', 'EasyJet');
        
	insert into aereo(Codice,Citta_di_partenza,Citta_Arrivo,Compagnia_aerea)
		values('GB00001788','Londra','Roma','RyanAir');
        
	insert into aereo(Codice,Citta_di_partenza,Citta_Arrivo,Compagnia_aerea)
		values('GB00001780','Londra','Lisbona','Easyjet');
        
	insert into aereo(Codice,Citta_di_partenza,Citta_Arrivo,Compagnia_aerea)
		values('RM00001630','Roma','Barcellona','Alitalia');
        
	insert into aereo(Codice,Citta_di_partenza,Citta_Arrivo,Compagnia_aerea)
		values('BL00001746','Barcellona','Vienna','Wings Air');
        
 
	insert into area_di_stallo(Numero)
		 values(1);
		
	insert into area_di_stallo(Numero)
		values(2);
		
	insert into area_di_stallo(Numero)
		values(3);
		
	insert into area_di_stallo(Numero)
		values(4);
		
	insert into area_di_stallo(Numero)
		values(5);
		
	insert into area_di_stallo(Numero)
		values(6);
		
	insert into area_di_stallo(Numero)
		values(7);

	insert into area_di_stallo(Numero)
		values(8);

	 
	insert into area_parcheggio_dipendenti(numero_Area, numero_posti)
		values('AM01', 150);
		
	insert into area_parcheggio_clienti(numero_Area, numero_posti)
		values('AM02', 150);
		
	insert into area_parcheggio_dipendenti(numero_Area, numero_posti)
		values('PR01', 150);
		
	insert into area_parcheggio_clienti(numero_Area, numero_posti)
		values('PR02', 150);
		
	insert into area_parcheggio_dipendenti(numero_Area, numero_posti)
		values('BR01', 150);
		
	insert into area_parcheggio_clienti(numero_Area, numero_posti)
		values('BR02', 150);
		
	insert into area_parcheggio_dipendenti(numero_Area, numero_posti)
		values('LB01', 150);
		
	insert into area_parcheggio_clienti(numero_Area, numero_posti)
		values('LB02', 150);
		
	insert into area_parcheggio_dipendenti(numero_Area, numero_posti)
		values('RM01', 150);
		
	insert into area_parcheggio_clienti(numero_Area, numero_posti)
		values('RM02', 150);
		
	insert into area_parcheggio_dipendenti(numero_Area, numero_posti)
		values('BL01', 150);
		
	insert into area_parcheggio_clienti(numero_Area, numero_posti)
		values('BL02', 150);
		
	insert into area_parcheggio_dipendenti(numero_Area, numero_posti)
		values('VI01', 150);
		
	insert into area_parcheggio_clienti(numero_Area, numero_posti)
		values('VN02', 150);
		
	insert into area_parcheggio_dipendenti(numero_Area, numero_posti)
		values('LN01', 150);
		
	insert into area_parcheggio_clienti(numero_Area, numero_posti)
		values('LN02', 150);
		
        
        
	insert into aeroporto 
		set codice='RM001',citta='Roma', 
			area_parcheggio_dipendenti=(select numero_area from area_parcheggio_dipendenti where numero_area='RM01'),
			area_parcheggio_clienti=(select numero_area from area_parcheggio_dipendenti where numero_area='RM02'),
			area_di_stallo=(select numero from Area_di_stallo where numero=1) ;
					 
	insert into aeroporto 
		set codice='LN00',citta='Londra',
			area_parcheggio_dipendenti=(select numero_area from area_parcheggio_dipendenti where numero_area='LN01'),
			area_parcheggio_clienti=(select numero_area from area_parcheggio_clienti where numero_area='LN02'),
			area_di_stallo=(select numero from Area_di_stallo where numero=2) ;
					 
	insert into aeroporto 
		set codice='BN00',citta='Berlino', 
			area_parcheggio_dipendenti=(select numero_area from area_parcheggio_dipendenti where numero_area='BN01'),
			area_parcheggio_clienti=(select numero_area from area_parcheggio_clienti where numero_area='BN02'),
			area_di_stallo=(select numero from Area_di_stallo where numero=3) ;
					 
	insert into aeroporto 
		set codice='VN00',citta='Vienna', 
			area_parcheggio_dipendenti=(select numero_area from area_parcheggio_dipendenti where numero_area='VN01'),
			area_parcheggio_clienti=(select numero_area from area_parcheggio_clienti where numero_area='VN02'),
			area_di_stallo=(select numero from Area_di_stallo where numero=4);
					 
	insert into aeroporto 
		set codice='BL00',citta='Barcellona', 
			area_parcheggio_dipendenti=(select numero_area from area_parcheggio_dipendenti where numero_area='BL01'),
			area_parcheggio_clienti=(select numero_area from area_parcheggio_clienti where numero_area='BL02'),
			area_di_stallo=(select numero from Area_di_stallo where numero=5) ;
					 
	insert into aeroporto 
		set codice='LB00',citta='Lisbona', 
			area_parcheggio_dipendenti=(select numero_area from area_parcheggio_dipendenti where numero_area='LB01'),
			area_parcheggio_clienti=(select numero_area from area_parcheggio_clienti where numero_area='LB02'),
			area_di_stallo=(select numero from Area_di_stallo where numero=6) ;
					 
	insert into aeroporto 
		set codice='AM00',citta='Amsterdam', 
			area_parcheggio_dipendenti=(select numero_area from area_parcheggio_dipendenti where numero_area='AM01'),
			area_parcheggio_clienti=(select numero_area from area_parcheggio_clienti where numero_area='AM02'),
			area_di_stallo=(select numero from Area_di_stallo where numero=7) ;
					 
	insert into aeroporto 
		set codice='PR00',citta='Parigi', 
			area_parcheggio_dipendenti=(select numero_area from area_parcheggio_dipendenti where numero_area='PR01'),
			area_parcheggio_clienti=(select numero_area from area_parcheggio_clienti where numero_area='PR02'),
			area_di_stallo=(select numero from Area_di_stallo where numero=8) ;
				
			  
			  
	insert into centro_direzionale
			set nome= 'Direzione Roma',
				aeroporto=(select codice from aeroporto where citta= 'Roma');
						
	insert into centro_direzionale
		set nome= 'Direzione Berlino',
			aeroporto=(select codice from aeroporto where citta= 'Berlino');
						
	insert into centro_direzionale
		set nome= 'Direzione Lisbona',
			aeroporto=(select codice from aeroporto where citta= 'Lisbona');
					   
	insert into centro_direzionale
		set nome= 'Direzione Barcellona',
			aeroporto=(select codice from aeroporto where citta= 'Barcellona');
					   
	insert into centro_direzionale
		set nome= 'Direzione Vienna',
			aeroporto=(select codice from aeroporto where citta= 'Vienna');
						
	insert into centro_direzionale
		set nome= 'Direzione Amsterdam',
			aeroporto=(select codice from aeroporto where citta= 'Amsterdam');
					 
	insert into centro_direzionale
		set nome= 'Direzione Parigi',
			aeroporto=(select codice from aeroporto where citta= 'Parigi');
				   
	insert into centro_direzionale
		set nome= 'Direzione Londra',
			aeroporto=(select codice from aeroporto where citta= 'Londra');
					   
				
	insert into biglietteria
		set codice= 'BRM00',
			Numero_biglietti_venduti= 3200,
			centro_direzionale=(select nome from centro_direzionale where nome= 'Direzione Roma');

	insert into biglietteria
		set codice= 'BBN00',
			Numero_biglietti_venduti= 2200,
			centro_direzionale=(select nome from centro_direzionale where nome= 'Direzione Berlino');
				
	insert into biglietteria
		set codice= 'BLB00',
			Numero_biglietti_venduti= 1700,
			centro_direzionale=(select nome from centro_direzionale where nome= 'Direzione Lisbona');
				
	insert into biglietteria
		set codice= 'BPR00',
			Numero_biglietti_venduti= 5000,
			centro_direzionale=(select nome from centro_direzionale where nome= 'Direzione Parigi');
						
	insert into biglietteria
		set codice= 'BLD00',
			Numero_biglietti_venduti= 3200,
			centro_direzionale=(select nome from centro_direzionale where nome= 'Direzione Londra');
				
				
	insert into biglietteria
		set codice= 'BVN00',
			Numero_biglietti_venduti= 3200,
			centro_direzionale=(select nome from centro_direzionale where nome= 'Direzione Vienna');
				
				
	insert into biglietteria
		set codice= 'BBL00',
			Numero_biglietti_venduti= 4200,
			centro_direzionale=(select nome from centro_direzionale where nome= 'Direzione Berlino');
				
	insert into biglietteria
		set codice= 'BAM00',
			Numero_biglietti_venduti= 6200,
			centro_direzionale=(select nome from centro_direzionale where nome= 'Direzione Amsterdam');
					

	insert into biglietto 
		set codice= 'BR0004786',
			prezzo=87.56,
			aereo=(select codice from aereo where citta_di_partenza='Berlino');


	insert into biglietto 
		set codice= 'VN0005736',
			prezzo=50.00,
			aereo=(select codice from aereo where citta_di_partenza='Vienna');

					
	insert into biglietto 
		set codice= 'GB0004786',
			prezzo=175.50,
			aereo=(select codice from aereo where citta_di_partenza='Londra');
						
	insert into biglietto 
		set codice= 'LB0027459',
			prezzo=44.30,
			aereo=(select codice from aereo where citta_di_partenza='Lisbona');
            
   insert into biglietto 
		set codice= 'RM0032128',
			prezzo=50.60,
			aereo=(select codice from aereo where citta_di_partenza='Roma');         
   
      insert into biglietto 
		set codice= 'RM0033428',
			prezzo=60.99,
			aereo=(select codice from aereo where citta_di_partenza='Roma');  
   
      insert into biglietto 
		set codice= 'BL003158',
			prezzo=74.60,
			aereo=(select codice from aereo where citta_di_partenza='Barcellona');  
   
   
	-- select * from biglietto;
					
					
	insert into taxi(Numero, costo)
		values (131, 10.50);
	insert into taxi(Numero, costo)
		values (101, 10.50);
    insert into taxi(Numero, costo)
		values (147, 10);
    insert into taxi(Numero, costo)
		values (61, 9);
    insert into taxi(Numero, costo)
		values (50, 9.50);
    insert into taxi(Numero, costo)
		values (47, 9.50);
			

	Insert into pullman(numero, costo, linea)
		values(13, 1, 'Piazza di Spagna');
						
	Insert into pullman(numero, costo, linea)
		values(22, 1, 'Buckingham palace');
					

	insert into alloggio
		set Codice_Stanza= 'RM23',
			costo= 50,
			Numero_posti= 4,
			aeroporto= (select codice from aeroporto where citta= 'Roma');
				   
	insert into alloggio
		set Codice_Stanza= 'RM32',
			costo= 25,
			Numero_posti= 2,
			aeroporto= (select codice from aeroporto where citta= 'Roma');
				   
	insert into alloggio
		set Codice_Stanza= 'BN03',
			costo= 50,
			Numero_posti= 4,
			aeroporto= (select codice from aeroporto where citta= 'Berlino');
	
    insert into Alloggio
		set Codice_Stanza = 'LB10',
			costo = 30,
            Numero_posti=1,
            aeroporto = (select codice from Aeroporto where citta='Lisbona');
            
    insert into Alloggio
		set Codice_Stanza = 'VN14',
			costo = 33,
            Numero_posti=1,
            aeroporto = (select codice from Aeroporto where citta='Vienna');
      insert into Alloggio
		set Codice_Stanza = 'BN14',
			costo = 58,
            Numero_posti=2,
            aeroporto = (select codice from Aeroporto where citta='Berlino');      
		insert into Alloggio
		set Codice_Stanza = 'BL24',
			costo = 55,
            Numero_posti=2,
            aeroporto = (select codice from Aeroporto where citta='Barcellona');      
   
    
	insert into personale 
		set matricola='DF83930223',
			nome= 'Gianfranco',
			cognome= 'Rossi',
			tipo='Dipendente Fisso',
			Stipendio= 1500,
			centro_direzionale=(select nome from centro_direzionale where nome = 'Direzione Roma');
		
					   
	insert into personale 
		set matricola='DPT9233023',
			nome= 'Danielle',
			cognome= 'Jaques',
			tipo='Dipendente Part-time',
			Stipendio= 1000,
			centro_direzionale=(select nome from centro_direzionale where nome = 'Direzione Parigi');
					
    insert into personale 
		set matricola='DPT4460213',
			nome= 'Otto',
			cognome= 'Franz',
			tipo='Dipendente Fisso',
			Stipendio= 1400,
			centro_direzionale=(select nome from centro_direzionale where nome = 'Direzione Vienna');                
     insert into personale 
		set matricola='DBN2706310',
			nome= 'Thomas',
			cognome= 'Johnson',
			tipo='Dipendente Fisso',
			Stipendio= 1600,
			centro_direzionale=(select nome from centro_direzionale where nome = 'Direzione Berlino');
     insert into personale 
		set matricola='DBL0312854',
			nome= 'Franco',
			cognome= 'Rossi',
			tipo='Dipendente Part-time',
			Stipendio= 950,
			centro_direzionale=(select nome from centro_direzionale where nome = 'Direzione Barcellona');

     
     
     
	insert into sosta
		set area_di_stallo=(select numero from area_di_stallo where numero= 1),
			taxi=(select numero from taxi where numero = 131);
					
	insert into sosta
		set area_di_stallo=(select numero from area_di_stallo where numero= 5),
			taxi=(select numero from taxi where numero = 101);
	insert into sosta
		set area_di_stallo=(select numero from area_di_stallo where numero= 4),
			taxi=(select numero from taxi where numero = 47);
	insert into sosta
		set area_di_stallo=(select numero from area_di_stallo where numero= 3),
			taxi=(select numero from taxi where numero = 61);
					

    Insert into acquisto
		set biglietto= (select codice from biglietto where codice = 'RM0032128'),
			biglietteria= (select codice from biglietteria where codice ='BBN00' );
    
    
	Insert into acquisto
		set biglietto= (select codice from biglietto where codice = 'BR0004786'),
			biglietteria= (select codice from biglietteria where codice ='BBN00' );
				  
	Insert into acquisto
		set biglietto= (select codice from biglietto where codice = 'VN0005736'),
			biglietteria= (select codice from biglietteria where codice = 'BVN00');
				   
			
	Insert into acquisto
		set biglietto= (select codice from biglietto where codice = 'GB0004786'),
			biglietteria= (select codice from biglietteria where codice = 'BLD00');
	   
		
	Insert into acquisto
		set biglietto= (select codice from biglietto where codice ='LB0027459' ),
			biglietteria= (select codice from biglietteria where codice = 'BLB00');

	insert into fermata 
		set area_di_stallo=(select Numero from area_di_stallo where numero=1);
				
				
	insert into fermata 
		set area_di_stallo=(select Numero from area_di_stallo where numero=2);
				
	insert into fermata 
		set area_di_stallo=(select Numero from area_di_stallo where numero=3);
				
	insert into fermata 
		set area_di_stallo=(select Numero from area_di_stallo where numero=4);
				
	insert into fermata 
		set area_di_stallo=(select Numero from area_di_stallo where numero=5);
				
	insert into fermata 
		set area_di_stallo=(select Numero from area_di_stallo where numero=6);
				
	insert into fermata 
		set area_di_stallo=(select Numero from area_di_stallo where numero=7);
				
	insert into fermata 
		set area_di_stallo=(select Numero from area_di_stallo where numero=8);
				
		
		
	insert into gate
		set aereo=(select codice from aereo where Citta_di_partenza= 'Berlino'),
			aeroporto=(select codice from aeroporto where citta='Berlino');
					
	insert into gate
		set aereo=(select codice from aereo where Citta_di_partenza= 'Vienna'),
			aeroporto=(select codice from aeroporto where citta='Vienna');
					
	insert into gate
		set aereo=(select codice from aereo where Citta_di_partenza= 'Londra'),
			aeroporto=(select codice from aeroporto where citta='Londra');

	insert into gate
		set aereo=(select codice from aereo where Citta_di_partenza= 'Lisbona'),
			aeroporto=(select codice from aeroporto where citta='Lisbona');   

			
	insert into vendita
		set alloggio=(select codice_stanza from alloggio where codice_stanza='RM23'),
			biglietteria=(select codice from biglietteria where codice='BRM00');
