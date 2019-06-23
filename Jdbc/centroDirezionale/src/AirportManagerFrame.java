import java.sql.*;
/**
 * @author Federica Ungherese,Donatella Cioffi,Alina Aprea
 */
public class AirportManagerFrame extends javax.swing.JFrame {
	public AirportManagerFrame() {
		initComponents();
		areaRis.setText("");
		setNotVisible();
	}
	//etichetta è una tringa in formato PrimaLabel2SecondaLabel3TerzaLabel....
	//value indica il numero di label e jtextfield da impostare
	private void setComponents(int value, String etichetta){
		button.setVisible(true);
		switch(value){
			case 1:{
				label1.setText(etichetta);
				field1.setVisible(true);
				label1.setVisible(true);
			}
			case 2:{
				label1.setText(etichetta.substring(0,etichetta.indexOf("2")));
				label2.setText(etichetta.substring(etichetta.indexOf("2")+1));
				label1.setVisible(true);
				label2.setVisible(true);
				field1.setVisible(true);
				field2.setVisible(true);
			}
			case 3:{
				label1.setText(etichetta.substring(0,etichetta.indexOf("2")));
				label2.setText(etichetta.substring(etichetta.indexOf("2")+1,etichetta.indexOf("3")));
				label3.setText(etichetta.substring(etichetta.indexOf("3")+1));
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				field1.setVisible(true);
				field2.setVisible(true);
				field3.setVisible(true);
			}
			case 4:{
				label1.setText(etichetta.substring(0,etichetta.indexOf("2")));
				label2.setText(etichetta.substring(etichetta.indexOf("2")+1,etichetta.indexOf("3")));
				label3.setText(etichetta.substring(etichetta.indexOf("3")+1,etichetta.indexOf("4")));
				label4.setText(etichetta.substring(etichetta.indexOf("4")+1));
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				field1.setVisible(true);
				field2.setVisible(true);
				field3.setVisible(true);
				field4.setVisible(true);
			}
			case 5:{
				label1.setText(etichetta.substring(0,etichetta.indexOf("2")));
				label2.setText(etichetta.substring(etichetta.indexOf("2")+1,etichetta.indexOf("3")));
				label3.setText(etichetta.substring(etichetta.indexOf("3")+1,etichetta.indexOf("4")));
				label4.setText(etichetta.substring(etichetta.indexOf("4")+1,etichetta.indexOf("5")));
				label5.setText(etichetta.substring(etichetta.indexOf("5")+1));
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				label5.setVisible(true);
				field1.setVisible(true);
				field2.setVisible(true);
				field3.setVisible(true);
				field4.setVisible(true);
				field5.setVisible(true);
			}
			case 6:{
				label1.setText(etichetta.substring(0,etichetta.indexOf("2")));
				label2.setText(etichetta.substring(etichetta.indexOf("2")+1,etichetta.indexOf("3")));
				label3.setText(etichetta.substring(etichetta.indexOf("3")+1,etichetta.indexOf("4")));
				label4.setText(etichetta.substring(etichetta.indexOf("4")+1,etichetta.indexOf("5")));
				label5.setText(etichetta.substring(etichetta.indexOf("5")+1,etichetta.indexOf("6")));
				label6.setText(etichetta.substring(etichetta.indexOf("6")+1));
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				label5.setVisible(true);
				label6.setVisible(true);
				field1.setVisible(true);
				field2.setVisible(true);
				field3.setVisible(true);
				field4.setVisible(true);
				field5.setVisible(true);
				dipendenteFisso.setVisible(true);
				dipendentePT.setVisible(true);
			}
		}
	}
	
	private void setNotVisible(){
		label1.setVisible(false);
		label2.setVisible(false);
		label3.setVisible(false);
		label4.setVisible(false);
		label5.setVisible(false);
		label6.setVisible(false);
		button.setVisible(false);
		dipendenteFisso.setVisible(false);
		dipendentePT.setVisible(false);
		field1.setText("...");
		field2.setText("...");
		field3.setText("...");
		field4.setText("...");
		field5.setText("...");
		field1.setVisible(false);
		field2.setVisible(false);
		field3.setVisible(false);
		field4.setVisible(false);
		field5.setVisible(false);
	}
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        labelMessage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        operazioni = new javax.swing.JComboBox<>();
        risultati = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRis = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        dipendenteFisso = new javax.swing.JRadioButton();
        dipendentePT = new javax.swing.JRadioButton();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        field4 = new javax.swing.JTextField();
        field5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMessage.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        labelMessage.setText("AirportManager");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operazioni", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N

        operazioni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Inserimento di un nuovo aereo", "2.Stampa del personale gestito", "3.Conteggio dei biglietti venduti", "4.Stampa le città di partenza di un aereo con un dato codice", "5.Inserimento di una nuova linea di pullman", "6.Verifica il numero del pullman con linea diretta a Piazza di Spagna", "7.Licenziamento di un dipendente", "8.Inserimento di un biglietto venduto", "9.Lista degli aeroporti gestiti", "10.Lista dei posti occupati dai taxi nell’area di stallo di Roma", "11.Conteggio delle compagnie aeree gestite da un aeroporto", "12.Lista delle stanze singole fra gli alloggi di un aeroporto", "13.Stampa del numero di posti del parcheggio clienti", "14.Conteggio dei biglietti venduti di una compagnia", "15.Inserimento di un nuovo dipendente", "16.Aggiornamento del percorso di un aereo", "17.Aggiornamento della linea di un pullman", "18.Prenotazione di un alloggio", "19.Aggiornamento del costo di un taxi", "20.Stampa di cognome e stipendio dei dipendenti fissi" }));
        operazioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operazioniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(operazioni, 0, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(operazioni, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        risultati.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        risultati.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        areaRis.setColumns(20);
        areaRis.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        areaRis.setRows(5);
        jScrollPane1.setViewportView(areaRis);

        risultati.add(jScrollPane1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Inserimento Informazioni", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N

        label1.setText("jLabel1");

        label2.setText("jLabel1");

        label3.setText("jLabel2");

        label4.setText("jLabel3");

        label5.setText("jLabel1");

        label6.setText("Tipo");

        button.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        button.setText("Inserisci");
        button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        buttonGroup.add(dipendenteFisso);
        dipendenteFisso.setSelected(true);
        dipendenteFisso.setText("Dipendente fisso");

        buttonGroup.add(dipendentePT);
        dipendentePT.setText("Dipendente part-time");

        field1.setText("jTextField1");

        field2.setText("jTextField1");

        field3.setText("jTextField1");

        field4.setText("jTextField1");

        field5.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dipendenteFisso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dipendentePT)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dipendenteFisso)
                    .addComponent(dipendentePT))
                .addGap(31, 31, 31)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(risultati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(risultati, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Listener della JComboBox per le operazioni
    private void operazioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operazioniActionPerformed
		setNotVisible();
		scelta = operazioni.getSelectedIndex()+1;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url);
			for(SQLWarning warn = conn.getWarnings(); warn != null;warn= warn.getNextWarning()) {
				System.out.println("\t---SQL Warning---");
				System.out.println("State  : " + warn.getSQLState());
				System.out.println("Message: " + warn.getMessage());
				System.out.println("Error  : " + warn.getErrorCode());
			}
			ResultSet rs = null;
			int i;
			switch(scelta){
				case 1:{
					setComponents(4,"Codice2Città di partenza3Città di arrivo4Compagnia aerea");
					break;
				}
				case 2:{
					stmt = conn.createStatement();
					rs= stmt.executeQuery("Select Matricola,Cognome,Nome,Tipo, Centro_direzionale,Stipendio From Personale Order by Matricola");
					areaRis.setText(areaRis.getText()+"\nOp.2)\nMatricola\t\tCognome\tNome\tTipo\t\tCentro Direzionale\tStipendio\n");
					i=1;
					while (rs.next()){
						areaRis.setText(areaRis.getText()+i+"-"+rs.getString("Matricola")+"\t\t");
						areaRis.setText(areaRis.getText()+rs.getString("Cognome")+"\t");
						areaRis.setText(areaRis.getText()+rs.getString("Nome")+"\t");
						areaRis.setText(areaRis.getText()+rs.getString("Tipo")+"\t");
						areaRis.setText(areaRis.getText()+rs.getString("Centro_Direzionale")+"\t");
						areaRis.setText(areaRis.getText()+rs.getString("Stipendio")+"€\n");
						i++;
					}
					break;
				}
				case 3:{
					stmt = conn.createStatement();
					rs = stmt.executeQuery("Select count(*) From Acquisto");
					rs.next();
					areaRis.setText(areaRis.getText()+"Op.3) Biglietti venduti: " + rs.getString(1)+"\n");
					break;
				}
				case 4:{
					setComponents(1,"Codice aereo");
					break;
				}
				case 5:{
					setComponents(3,"Numero Bus2Linea3Costo");
					break;
				}
				case 6:{
					stmt = conn.createStatement();
					rs = stmt.executeQuery("select Numero from Pullman where Linea='Piazza di Spagna'");
					rs.next();
					areaRis.setText(areaRis.getText()+"Op.6) Numero Pullman: "+ rs.getString("Numero")+"\n");
					break;
				}
				case 7:{
					setComponents(1,"Matricola");
					break;
				}
				case 8:{
					setComponents(2,"Codice Biglietto2Codice Biglietteria");
					break;
				}
				case 9:{
					stmt= conn.createStatement();
					rs = stmt.executeQuery("Select Codice,Citta From Aeroporto");
					areaRis.setText(areaRis.getText()+"Op.9)\nCodice\tCittà\n");
					i=1;
					while(rs.next()){
						areaRis.setText(areaRis.getText()+i+"- "+rs.getString("Codice")+"\t"+rs.getString("Citta")+"\n");
						i++;
					}
					break;
				}
				case 10:{
					stmt = conn.createStatement();
					rs = stmt.executeQuery("Select * From Sosta S join Area_di_stallo A on S.Area_di_stallo=A.Numero Where A.Numero =any (select Area_di_stallo From Aeroporto Where Citta= 'Roma')");
					areaRis.setText(areaRis.getText()+"Op.10)\nArea di stallo\tTaxi\n");
					i=1;
					while(rs.next()){
						areaRis.setText(areaRis.getText()+i+"- "+rs.getString("Area_di_stallo")+"\t"+rs.getString("Taxi")+"\n");
						i++;
					}
					break;
				}
				case 11:{
					setComponents(1,"Città dell'aeroporto");
					break;
				}
				case 12:{
					setComponents(1,"Città dell'aeroporto");
					break;
				}
				case 13:{
					stmt= conn.createStatement();
					rs=stmt.executeQuery("Select * From Area_parcheggio_clienti");
					i=1;
					areaRis.setText(areaRis.getText()+"Op.13) Numero Area\tNumero Posti\n");
					while(rs.next()){
						areaRis.setText(areaRis.getText()+i+"- "+rs.getString("Numero_area")+"\t\t"+rs.getString("Numero_posti")+"\n");
						i++;
					}
					break;
				}
				case 14:{
					setComponents(1,"Compagnia aerea");
					break;
				}
				case 15:{
					setComponents(6,"Matricola2Cognome3Nome4Centro Direzionale5Stipendio6Tipo");
					break;
				}
				case 16:{
					setComponents(3,"Città di partenza2Città di arrivo3Codice aereo");
					break;
				}
				case 17:{
					setComponents(2,"Linea2Numero Bus");
					break;
				}
				case 18:{
					setComponents(2,"Codice stanza2Codice Biglietteria");
					break;
				}
				case 19:{
					setComponents(2,"Costo2Numero taxi");
					break;
				}
				case 20:{
					stmt = conn.createStatement();
					rs = stmt.executeQuery("Select Cognome,Stipendio From Personale Where Tipo='Dipendente Fisso' Order by Cognome");
					i=1;
					areaRis.setText(areaRis.getText()+"Op.20)\nCognome\tStipendio\n");
					while(rs.next()){
						areaRis.setText(areaRis.getText()+i+"- "+rs.getString("Cognome")+"\t"+rs.getString("Stipendio")+" €\n");
						i++;
					}
					break;
				}	
			}
			rs.close();
			stmt.close();
			pstmt.close();
			conn.close();
		}
		catch(SQLException se){
			System.out.println("\t---SQL Exception:---");
		// Verifica delle eventuali eccezioni SQL
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());
				se = se.getNextException();
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
    }//GEN-LAST:event_operazioniActionPerformed
//Listener del pulsante per gli inserimenti
    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        try{
			ResultSet rs=null;
			int i;
			switch(scelta){
				case 1:{
					pstmt = conn.prepareStatement("Insert into Aereo (Codice, Citta_di_partenza, Citta_Arrivo, Compagnia_aerea) Values (?,?,?,?)");
					pstmt.setString(1,label1.getText());
					pstmt.setString(2,label2.getText());
					pstmt.setString(3,label3.getText());
					pstmt.setString(4,label4.getText());
					pstmt.executeUpdate();
					break;
				}
				case 4:{
					pstmt = conn.prepareStatement("Select Citta_di_partenza From Aereo Where codice = ?");
					pstmt.setString(1,field1.getText());
					rs=pstmt.executeQuery();
					areaRis.setText(areaRis.getText()+"Op.4) Città di partenza dell'aereo inserito: ");
					i=1;
					while(rs.next()){
						areaRis.setText(areaRis.getText()+i+"- "+ rs.getString("Citta_di_partenza")+"\n");
						i++;
					}
					break;
				}
				case 5:{
					pstmt = conn.prepareStatement("Insert into Pullman (Numero,Linea,Costo) Values (?,?,?)");
					pstmt.setString(1,field1.getText());
					pstmt.setString(2,field2.getText());
					pstmt.setString(3,field3.getText());
					pstmt.executeUpdate();
					break;
				}
				case 7:{
					pstmt = conn.prepareStatement("Delete from Personale Where Matricola = ?");
					pstmt.setString(1, field1.getText());
					pstmt.executeUpdate();	
					break;
				}
				case 8:{
					pstmt = conn.prepareStatement("Insert into Acquisto (Biglietto,Biglietteria) Values (?,?)");
					pstmt.setString(1, field1.getText());
					pstmt.setString(2, field2.getText());
					pstmt.executeUpdate();
					pstmt = conn.prepareStatement("Update Biglietteria Set Numero_biglietti_venduti=Numero_biglietti_venduti+1 where codice= ?");
					pstmt.setString(1, field2.getText());
					pstmt.executeUpdate();
					break;
				}
				case 11:{
					pstmt = conn.prepareStatement("Select count(distinct Compagnia_aerea) From Aereo Where Citta_di_partenza=? or Citta_Arrivo=?");
					pstmt.setString(1, field1.getText());
					pstmt.setString(2, field1.getText());
					rs = pstmt.executeQuery();
					rs.next();
					areaRis.setText(areaRis.getText()+"Op.11) Numero compagnie gestite: "+rs.getString(1)+"\n");
					break;
				}
				case 12:{
					pstmt = conn.prepareStatement("Select Codice_Stanza,Costo From Alloggio join Aeroporto on Alloggio.Aeroporto=Aeroporto.Codice Where Aeroporto.Citta= ? and numero_posti=1");
					pstmt.setString(1,field1.getText());
					rs = pstmt.executeQuery();
					i=1;
					areaRis.setText(areaRis.getText()+"Op.12) Codice Stanza\tCosto\n");
					while(rs.next()){
						areaRis.setText(areaRis.getText()+i+"- "+rs.getString("Codice_Stanza")+"\t\t"+rs.getString("Costo")+" €\n");
						i++;
					}
					break;
				}
				case 14:{
					pstmt = conn.prepareStatement("Select count(*) From Acquisto join Biglietto on Acquisto.Biglietto = Biglietto.Codice where Biglietto.Aereo =any (select Codice From Aereo Where Compagnia_aerea = ?)");
					pstmt.setString(1,field1.getText());
					rs = pstmt.executeQuery();
					rs.next();
					areaRis.setText(areaRis.getText()+"Op.14) Biglietti venduti dalla compagnia: "+ rs.getString(1)+"\n");
					break;
				}
				case 15:{
					pstmt = conn.prepareStatement("Insert into Personale(Matricola,Cognome,Nome,Tipo,Stipendio,Centro_direzionale)"
							+ "Values (?,?,?,?,?,?)");
					pstmt.setString(1,field1.getText());
					pstmt.setString(2,field2.getText());
					pstmt.setString(3,field3.getText());
					if(dipendenteFisso.isSelected())
						pstmt.setString(4,"Dipendente Fisso");
					else if(dipendentePT.isSelected())
						pstmt.setString(4, "Dipendente Part-time");
					pstmt.setString(6,field4.getText());
					pstmt.setString(5,field5.getText());
					pstmt.executeUpdate();					
					break;
				}
				case 16:{
					pstmt = conn.prepareStatement("Update Aereo Set Citta_di_partenza=?,Citta_Arrivo=? Where codice=?");
					pstmt.setString(3,field3.getText());
					pstmt.setString(1,field1.getText());
					pstmt.setString(2,field2.getText());
					pstmt.executeUpdate();
					break;
				}
				case 17:{
					pstmt = conn.prepareStatement("Update Pullman Set Linea = ? Where Numero=?");
					pstmt.setString(2,field2.getText());
					pstmt.setString(1,field1.getText());
					pstmt.executeUpdate();
					break;
				}
				case 18:{
					pstmt = conn.prepareStatement("Insert into vendita Set Alloggio=(select codice_stanza from alloggio where codice_stanza=?), biglietteria=(select codice from biglietteria where codice=?)");
					pstmt.setString(1,field1.getText());
					pstmt.setString(2,field2.getText());
					pstmt.executeUpdate();			
					break;
				}
				case 19:{
					pstmt = conn.prepareStatement("Update Taxi Set Costo = ? Where Numero = ?");
					pstmt.setString(1,field1.getText());
					pstmt.setString(2,field2.getText());
					pstmt.executeUpdate();
					break;
				}
			}
			setNotVisible();
			rs.close();
			stmt.close();
			pstmt.close();
			conn.close();
		}
		catch(SQLException se){
			System.out.println("\t---SQL Exception:---");
			// Verifica delle eventuali eccezioni SQL
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());
				se = se.getNextException();
			}
		}
		catch (Exception e){
			System.out.println(e);
		}	
    }//GEN-LAST:event_buttonActionPerformed

	public static void main(String args[]) {
		/* Create and display the form */	
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AirportManagerFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRis;
    private javax.swing.JButton button;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton dipendenteFisso;
    private javax.swing.JRadioButton dipendentePT;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField field4;
    private javax.swing.JTextField field5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JComboBox<String> operazioni;
    private java.awt.ScrollPane risultati;
    // End of variables declaration//GEN-END:variables
	private static Statement stmt;
	private static PreparedStatement pstmt;
	private Connection conn;
	private static final String driver = "com.mysql.jdbc.Driver";	
	private static final String url = "jdbc:mysql://localhost/airport_manager?user=root&password=root";
	private int scelta;
}