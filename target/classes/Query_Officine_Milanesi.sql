-- Sequence
CREATE SEQUENCE  "OFFMILANESI"."ID_FILIALE"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
CREATE SEQUENCE  "OFFMILANESI"."ID_CLIENTE"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
CREATE SEQUENCE  "OFFMILANESI"."ID_MECCANICO"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
CREATE SEQUENCE  "OFFMILANESI"."ID_VEICOLO"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
CREATE SEQUENCE  "OFFMILANESI"."ID_ARTICOLO"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
CREATE SEQUENCE  "OFFMILANESI"."ID_FATTURA"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
CREATE SEQUENCE  "OFFMILANESI"."ID_LOG"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;

-- Tabelle
CREATE TABLE FILIALI (
    id NUMBER(8) DEFAULT ID_FILIALE.NEXTVAL PRIMARY KEY,
    rag_sociale VARCHAR2(100),
    p_iva VARCHAR2(12),
    cod_fiscale VARCHAR2(16) UNIQUE NOT NULL,
    pec VARCHAR2(100),
    telefono VARCHAR2(20) UNIQUE,
    indirizzo VARCHAR2(150),
    cap VARCHAR2(10),
    provincia VARCHAR2(2),
    citta VARCHAR2(50),
    nazione VARCHAR2(50),
    nome_officina VARCHAR2(100),
    data_ins DATE,
    data_agg DATE
);

CREATE TABLE CLIENTI (
    id NUMBER(8) DEFAULT ID_CLIENTE.NEXTVAL PRIMARY KEY,
    rag_sociale VARCHAR2(100),
    p_iva VARCHAR2(12),
    cod_fiscale VARCHAR2(16) UNIQUE NOT NULL,
    pec VARCHAR2(100),
    telefono VARCHAR2(20),
    indirizzo VARCHAR2(150),
    cap VARCHAR2(10),
    provincia VARCHAR2(2),
    citta VARCHAR2(50),
    nazione VARCHAR2(50),
    data_ins DATE,
    data_agg DATE
);

CREATE TABLE MECCANICI (
    id NUMBER(8) DEFAULT ID_MECCANICO.NEXTVAL PRIMARY KEY,
    nome VARCHAR2(50),
    cognome VARCHAR2(50),
    cod_fiscale VARCHAR2(16) UNIQUE NOT NULL,
    telefono VARCHAR2(20),
    data_ins DATE,
    data_agg DATE
);

CREATE TABLE VEICOLI (
    id NUMBER(8) DEFAULT ID_VEICOLO.NEXTVAL PRIMARY KEY,
    modello_vett VARCHAR2(100),
    telaio VARCHAR2(50),
    targa VARCHAR2(20) NOT NULL,
    motore VARCHAR2(50),
    cilindrata NUMBER(5),
    data_immatr DATE,
    data_vendita DATE,
    stato VARCHAR2(20),
    km_percorsi NUMBER(8),
    id_cliente NUMBER(8) NOT NULL,
    data_ins DATE,
    data_agg DATE,
    CONSTRAINT fk_cliente_veicoli FOREIGN KEY (id_cliente) REFERENCES CLIENTI(id)
);

CREATE TABLE ARTICOLI (
    id NUMBER(8) DEFAULT ID_ARTICOLO.NEXTVAL PRIMARY KEY,
    pos_magazzino VARCHAR2(20),
    sf CHAR(2),
    cod_articolo VARCHAR2(50) UNIQUE NOT NULL,
    descrizione VARCHAR2(200),
    prezzo_unit NUMBER(8,2) NOT NULL,
    data_ins DATE,
    data_agg DATE
);

CREATE TABLE FATTURE (
    id NUMBER(8) DEFAULT ID_FATTURA.NEXTVAL PRIMARY KEY,
    id_filiale NUMBER(8) NOT NULL,
    protocollo VARCHAR2(50),
    id_cliente NUMBER(8) NOT NULL,
    tipo_doc VARCHAR2(20),
    numero_fatt VARCHAR2(20),
    data_fatt DATE,
    n_pagine NUMBER(8),
    codice_pagina NUMBER(8),
    mod_pagamento VARCHAR2(50),
    causale VARCHAR2(200),
    nota_doc VARCHAR2(200),
    data_prev_consegna DATE,
    banca_appoggio VARCHAR2(100),
    totale NUMBER(8,2),
    id_meccanico NUMBER(8) NOT NULL,
    id_veicolo NUMBER(8) NOT NULL,
    CONSTRAINT fk_filiale FOREIGN KEY (id_filiale) REFERENCES FILIALI(id),
    CONSTRAINT fk_cliente_fatture FOREIGN KEY (id_cliente) REFERENCES CLIENTI(id),
    CONSTRAINT fk_meccanico FOREIGN KEY (id_meccanico) REFERENCES MECCANICI(id),
    CONSTRAINT fk_veicolo FOREIGN KEY (id_veicolo) REFERENCES VEICOLI(id)
);

CREATE TABLE FATTURE_ARTICOLI (
    id_fattura NUMBER(8) NOT NULL,
    id_articolo NUMBER(8) NOT NULL,
    quantita NUMBER(8),
    sconto NUMBER(8,2),
    PRIMARY KEY (id_fattura, id_articolo),
    CONSTRAINT fk_fattura FOREIGN KEY (id_fattura) REFERENCES FATTURE(id),
    CONSTRAINT fk_articolo FOREIGN KEY (id_articolo) REFERENCES ARTICOLI(id)
);

CREATE TABLE LOG (
    id NUMBER(8) DEFAULT ID_LOG.NEXTVAL PRIMARY KEY,
    livello VARCHAR2(5) NOT NULL,
    messaggio VARCHAR2(300),
    data_log TIMESTAMP
);

-- Insert
INSERT INTO FILIALI (rag_sociale, p_iva, cod_fiscale, pec, telefono, indirizzo, cap, provincia, citta, nazione, nome_officina, data_ins, data_agg) VALUES ('OFFICINA MECCANICA ALFA SRL', '12345678901', '12345678901', 'alfa@pec.it', '0123 456789', 'Via Roma 100', '00100', 'RM', 'Roma', 'Italia', 'Officina Alfa', SYSDATE, SYSDATE);

INSERT INTO CLIENTI (rag_sociale, p_iva, cod_fiscale, pec, telefono, indirizzo, cap, provincia, citta, nazione, data_ins, data_agg) VALUES ('Mario Rossi', '12345670158', 'RSSMRA80A01H501Z', 'mario.rossi@pec.it', '3331234567', 'Via Milano 10', '20100', 'MI', 'Milano', 'Italia', SYSDATE, SYSDATE);
INSERT INTO CLIENTI (rag_sociale, p_iva, cod_fiscale, pec, telefono, indirizzo, cap, provincia, citta, nazione, data_ins, data_agg) VALUES ('Giulia Bianchi', NULL, 'BNCGLI85C41F205Z', 'giulia.bianchi@pec.it', '3399876543', 'Via Torino 20', '10100', 'TO', 'Torino', 'Italia', SYSDATE, SYSDATE);
INSERT INTO CLIENTI (rag_sociale, p_iva, cod_fiscale, pec, telefono, indirizzo, cap, provincia, citta, nazione, data_ins, data_agg) VALUES ('Andrea Verdi', '23456780269', 'VRDNDR90A01H501A', 'andrea.verdi@pec.it', '3401111222', 'Via Firenze 5', '50100', 'FI', 'Firenze', 'Italia', SYSDATE, SYSDATE);
INSERT INTO CLIENTI (rag_sociale, p_iva, cod_fiscale, pec, telefono, indirizzo, cap, provincia, citta, nazione, data_ins, data_agg) VALUES ('Lucia Neri', '34567890370', 'NRILCU75H60H501W', 'lucia.neri@pec.it', '3488888888', 'Via Napoli 55', '80100', 'NA', 'Napoli', 'Italia', SYSDATE, SYSDATE);
INSERT INTO CLIENTI (rag_sociale, p_iva, cod_fiscale, pec, telefono, indirizzo, cap, provincia, citta, nazione, data_ins, data_agg) VALUES ('Marco Gialli', NULL, 'GLLMRC70D10H703Y', 'marco.gialli@pec.it', '3457776666', 'Via Bari 22', '70100', 'BA', 'Bari', 'Italia', SYSDATE, SYSDATE);

INSERT INTO MECCANICI (nome, cognome, cod_fiscale, telefono, data_ins, data_agg) VALUES ('Luca', 'Ferrari', 'FRRLCC85A01H501R', '3291112222', SYSDATE, SYSDATE);
INSERT INTO MECCANICI (nome, cognome, cod_fiscale, telefono, data_ins, data_agg) VALUES ('Davide', 'Russo', 'RSSDVD82B03H501Y', '3283334444', SYSDATE, SYSDATE);
INSERT INTO MECCANICI (nome, cognome, cod_fiscale, telefono, data_ins, data_agg) VALUES ('Chiara', 'Conti', 'CNTCHR90C45F205E', '3275556666', SYSDATE, SYSDATE);
INSERT INTO MECCANICI (nome, cognome, cod_fiscale, telefono, data_ins, data_agg) VALUES ('Simone', 'Greco', 'GRCSMN78D16H501P', '3267778888', SYSDATE, SYSDATE);

INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Fiat Panda', 'ZFA12345678901234', 'AB123CD', '169A4000', 1242, TO_DATE('2018-06-12','YYYY-MM-DD'), NULL, 'Accettazione', 85000, 1, SYSDATE, SYSDATE);
INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Opel Corsa', 'W0L0XCF0821234567', 'CD456EF', 'Z13DT', 1248, TO_DATE('2016-04-10','YYYY-MM-DD'), TO_DATE('2023-09-18','YYYY-MM-DD'), 'Diagnosi', 95000, 2, SYSDATE, SYSDATE);
INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Renault Clio', 'VF1BB054632345678', 'EF789GH', 'K9K', 1461, TO_DATE('2020-03-25','YYYY-MM-DD'), NULL, 'Riparazione', 72000, 3, SYSDATE, SYSDATE);
INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Ford Fiesta', 'WF0DXXGAJD7L12345', 'GH012IJ', 'F6JD', 998, TO_DATE('2017-11-09','YYYY-MM-DD'), TO_DATE('2022-02-15','YYYY-MM-DD'), 'Collaudo', 40000, 4, SYSDATE, SYSDATE);
INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Volkswagen Polo', 'WVWZZZ6RZHY123456', 'IJ345KL', 'CHZ', 1197, TO_DATE('2015-07-01','YYYY-MM-DD'), NULL, 'Diagnosi', 20000, 5, SYSDATE, SYSDATE);
INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Toyota Yaris', 'VNKKC3D320A123456', 'KL678MN', '1KR-FE', 998, TO_DATE('2013-02-11','YYYY-MM-DD'), TO_DATE('2021-06-20','YYYY-MM-DD'), 'Consegna', 102000, 1, SYSDATE, SYSDATE);
INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Peugeot 208', 'VF3CC8HR0GT123456', 'MN901OP', 'DV6FC', 1560, TO_DATE('2019-10-30','YYYY-MM-DD'), NULL, 'Consegna', 130000, 2, SYSDATE, SYSDATE);
INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Hyundai i20', 'NLHBB51BADZ123456', 'OP234QR', 'G4LA', 1248, TO_DATE('2012-05-17','YYYY-MM-DD'), TO_DATE('2020-08-03','YYYY-MM-DD'), 'Collaudo', 140000, 3, SYSDATE, SYSDATE);
INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Citroen C3', 'VF7FCKFVC12345678', 'QR567ST', 'TU3JP', 1360, TO_DATE('2014-09-19','YYYY-MM-DD'), NULL, 'Diagnosi', 160000, 4, SYSDATE, SYSDATE);
INSERT INTO VEICOLI (modello_vett, telaio, targa, motore, cilindrata, data_immatr, data_vendita, stato, km_percorsi, id_cliente, data_ins, data_agg) VALUES ('Seat Ibiza', 'VSSZZZ6JZAR123456', 'ST890UV', 'BXW', 1198, TO_DATE('2023-01-15','YYYY-MM-DD'), NULL, 'Consegna', 10000, 5, SYSDATE, SYSDATE);

INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('A1', '$$', 'R001', 'Cambio olio motore', 50.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('A2', 'SG', 'R002', 'Filtro olio', 15.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('A3', 'MQ', 'R003', 'Filtro aria', 18.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('A4', 'YA', 'R004', 'Filtro abitacolo', 20.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('B1', '$$', 'S001', 'Manodopera generale', 40.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('B2', '$$', 'S002', 'Diagnosi centralina', 35.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('C1', 'YA', 'R005', 'Pastiglie freni anteriori', 45.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('C2', 'SG', 'R006', 'Dischi freno anteriori', 90.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('C3', 'MQ', 'R007', 'Batteria 60Ah', 85.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('C4', 'SG', 'R008', 'Candele accensione (4pz)', 30.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('D1', 'YA', 'R009', 'Lampadina H7', 8.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('D2', 'SG', 'R010', 'Tergicristallo anteriore', 25.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('D3', 'MQ', 'R011', 'Tergicristallo posteriore', 15.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('E1', 'YA', 'R012', 'Liquido freni DOT4', 10.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('E2', 'YA', 'R013', 'Antigelo radiatore', 12.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('F1', '$$', 'R014', 'Pulizia iniettori', 60.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('F2', 'MQ', 'R015', 'Additivo diesel', 14.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('G1', '$$', 'S003', 'Montaggio pneumatici', 25.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('G2', '$$', 'S004', 'Equilibratura ruote', 20.00, SYSDATE, SYSDATE);
INSERT INTO ARTICOLI (pos_magazzino, sf, cod_articolo, descrizione, prezzo_unit, data_ins, data_agg) VALUES ('G3', '$$', 'S005', 'Controllo livelli', 10.00, SYSDATE, SYSDATE);

-- Procedura per i log
CREATE OR REPLACE PROCEDURE inserisci_log(p_livello IN VARCHAR2, p_messaggio IN VARCHAR2)
IS
    PRAGMA AUTONOMOUS_TRANSACTION;
BEGIN
    INSERT INTO log (livello, messaggio, data_log)
    VALUES (p_livello, p_messaggio, SYSTIMESTAMP);
    COMMIT;
END;

-- Procedura per la creazione randomica delle fatture
CREATE OR REPLACE PROCEDURE genera_fatture_random
AS
    v_n_fatture       NUMBER(8) := TRUNC(DBMS_RANDOM.VALUE(1, 11));
    
    v_id_fattura      NUMBER(8);
    v_id_filiale      NUMBER(8);
    v_id_cliente      NUMBER(8);
    v_data_fattura    DATE := SYSDATE;
    v_prot_fatt       NUMBER(8);
    v_anno            VARCHAR2(4);
    v_numero_fatt     VARCHAR2(20);
    v_tipo_doc        VARCHAR2(50) := 'Scheda officina';
    v_n_pagine        NUMBER(8) := 1;
    v_codice_pagina   NUMBER(8);
    v_mod_pagamento   VARCHAR2(50) := 'Bonifico';
    v_causale         VARCHAR2(200) := 'RIPARAZIONE';
    v_nota_doc        VARCHAR2(200) := 'Fattura generata automaticamente';
    v_data_prev_cons  DATE;
    v_banca_appoggio  VARCHAR2(100) := 'Banca Intesa';
    v_meccanico       NUMBER(8);
    v_veicolo         NUMBER(8);
    v_totale          NUMBER(8,2) := 0;
    
    v_id_articolo     NUMBER;
    v_prezzo_unit     NUMBER(8,2);
    v_quantita        NUMBER(8);
    v_sconto          NUMBER(8,2);
    v_subtot          NUMBER(8,2);
    v_num_articoli    NUMBER;
    
    v_fatt_succ       NUMBER := 0;
    v_fatt_err        NUMBER := 0;
BEGIN
     inserisci_log('INFO', 'Inizio esecuzione procedura: genera_fatture_random');
     inserisci_log('DEBUG', 'Generato numero di fatture da creare: ' || v_n_fatture);

    WHILE v_n_fatture > 0 LOOP
        SAVEPOINT inizio_fattura;
        BEGIN
            inserisci_log('DEBUG', 'Inizio generazione nuova fattura');
            
            -- Filiale random
            SELECT id INTO v_id_filiale
            FROM (
                SELECT id
                FROM filiali
                ORDER BY DBMS_RANDOM.VALUE
            ) WHERE ROWNUM = 1;

            -- Cliente random
            SELECT id INTO v_id_cliente
            FROM (
                SELECT id
                FROM clienti
                ORDER BY DBMS_RANDOM.VALUE
            ) WHERE ROWNUM = 1;
            
            -- Meccanico random
            SELECT id INTO v_meccanico
            FROM (
                SELECT id
                FROM meccanici
                ORDER BY DBMS_RANDOM.VALUE
            ) WHERE ROWNUM = 1;
            
            -- Veicolo random
            SELECT id INTO v_veicolo
            FROM (
                SELECT id
                FROM veicoli ve
                WHERE v_id_cliente = ve.id_cliente
                ORDER BY DBMS_RANDOM.VALUE
            ) WHERE ROWNUM = 1;
            
            -- Numero protocollo
            v_prot_fatt := TRUNC(DBMS_RANDOM.VALUE(1, 10000));
            
            -- Numero fattura
            v_anno := TO_CHAR(SYSDATE, 'YYYY');
            v_numero_fatt := v_anno || '   ' || TO_CHAR(TRUNC(DBMS_RANDOM.VALUE(1, 10000)));
            
            -- Codice pagina formattato con zeri a sinistra
            v_codice_pagina := LPAD(TRUNC(DBMS_RANDOM.VALUE(1, 1000)), 3, '0');
            
            -- Data di prevista consegna
            v_data_prev_cons := SYSDATE + TRUNC(DBMS_RANDOM.VALUE(1, 11));

            -- Inserisci fattura
            INSERT INTO fatture (id_filiale, protocollo, id_cliente, tipo_doc, numero_fatt, data_fatt, n_pagine, codice_pagina, mod_pagamento, causale, nota_doc, data_prev_consegna, banca_appoggio, totale, id_meccanico, id_veicolo)
            VALUES (v_id_filiale, v_prot_fatt, v_id_cliente, v_tipo_doc, v_numero_fatt, v_data_fattura, v_n_pagine, v_codice_pagina, v_mod_pagamento, v_causale, v_nota_doc, v_data_prev_cons, v_banca_appoggio, 0, v_meccanico, v_veicolo)
            RETURNING id INTO v_id_fattura;
            inserisci_log('INFO', 'Inserita fattura ' || v_numero_fatt || ' (ID: ' || v_id_fattura || ')');

            -- Numero casuale di articoli
            v_num_articoli := TRUNC(DBMS_RANDOM.VALUE(1, 6));
            inserisci_log('DEBUG', 'Generato numero di articoli da inserire: ' || v_num_articoli || ' | per la fattura: ' || v_numero_fatt);

            WHILE v_num_articoli > 0 LOOP
                BEGIN
                    SELECT id INTO v_id_articolo
                    FROM (
                        SELECT a.id
                        FROM articoli a
                        LEFT OUTER JOIN fatture_articoli fa
                            ON a.id = fa.id_articolo AND fa.id_fattura = v_id_fattura
                        WHERE fa.id_articolo IS NULL
                        ORDER BY DBMS_RANDOM.VALUE
                    )
                    WHERE ROWNUM = 1;
            
                    -- Prezzo unitario
                    SELECT prezzo_unit INTO v_prezzo_unit
                    FROM articoli
                    WHERE id = v_id_articolo;
            
                    -- Quantità e sconto random
                    v_quantita := TRUNC(DBMS_RANDOM.VALUE(1, 5));
                    inserisci_log('DEBUG', 'Generata quantità: ' || v_quantita || ' | dell' || CHR(39) || 'articolo: ' || v_id_articolo || ' | per la fattura: ' || v_numero_fatt);
                    v_sconto := ROUND(DBMS_RANDOM.VALUE(0, v_prezzo_unit * v_quantita * 0.5), 2);
                    inserisci_log('DEBUG', 'Generato sconto: ' || v_sconto || ' | dell' || CHR(39) || 'articolo: ' || v_id_articolo || ' | per la fattura: ' || v_numero_fatt);
            
                    -- Calcolo subtotale e somma al totale
                    v_subtot := (v_prezzo_unit * v_quantita) - v_sconto;
                    v_totale := v_totale + v_subtot;
            
                    -- Inserimento dettaglio
                    INSERT INTO fatture_articoli (id_fattura, id_articolo, quantita, sconto)
                    VALUES (v_id_fattura, v_id_articolo, v_quantita, v_sconto);
                    inserisci_log('INFO', 'Aggiunto articolo ' || v_id_articolo || ' alla fattura ' || v_id_fattura);
            
                    v_num_articoli := v_num_articoli - 1;
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
                        inserisci_log('WARN', 'Nessun articolo disponibile per la fattura ' || v_id_fattura);
                        EXIT;
                END;
            END LOOP;

            -- Aggiorna totale fattura
            UPDATE fatture
            SET totale = ROUND(v_totale, 2)
            WHERE id = v_id_fattura;
            inserisci_log('DEBUG', 'Aggiornato totale fattura ' || v_id_fattura || ': ' || ROUND(v_totale, 2));
            
            v_n_fatture := v_n_fatture - 1;
            inserisci_log('INFO', 'Fattura ' || v_numero_fatt || ' generata con totale ' || ROUND(v_totale, 2));
            v_fatt_succ := v_fatt_succ + 1;
        EXCEPTION
            WHEN OTHERS THEN
                ROLLBACK TO inizio_fattura;
                v_fatt_err := v_fatt_err + 1;
                v_n_fatture := v_n_fatture - 1;
                v_totale := 0;
                inserisci_log('ERR', 'Errore generazione fattura: ' || SQLERRM);
        END;
        v_totale := 0;
    END LOOP;
    inserisci_log('INFO', 'Procedura genera_fatture_random completata. Successi: ' || v_fatt_succ || ', Errori: ' || v_fatt_err);
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        inserisci_log('ERR', 'Errore fatale: ' || SQLERRM);
        ROLLBACK;
END;

-- Chiamata procedura
BEGIN
    genera_fatture_random;
END;