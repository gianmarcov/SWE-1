# Glossar

Kunde und Adressen sind Klassen (Modellklasse) die Serialisiert werden können in einem File via JAXB oder via Jackson (JSON). 
Die Klassen können auch mit einem ORM Framework wie Hibernate mit einer Datenbank verbunden werden und automatisch upserted (insert / update) , gelöscht werden.

## Klasse Kunde
Verantwortlich und enthält die Kundendaten, Adressen, Email Adressen, Telefonnummer, KundentypVerantwortlich und enthält etc.

## Enum Kundentyp
Ist eine Enumeration die beliebig lang sein kann, jeder Wert ist zu einem Typ angeordnet.
Z.B 1 für Premium, 2 Firmenkunde, 3 Partner etc.

## Klasse Adresse
Verantwortlich und enthält Strasse, Ort, PLZ
