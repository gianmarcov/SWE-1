# Glossar

ViewFactory:
Erstellt eine Console View Applikation.

BoCustomerFactory:
Erstellt den BoCustomer.

DaoCustomerFactory:
Erstellt den DaoCustomer.

BoCustomer:
Gibt ein Interface zur View um manipulationen am Kundenstamm oder Kunde vorzunehmen (Implementiert die Businessregeln, Validierungen)

DaoCustomer:
Speichert den Kunden ab, jenachdem welche Implementierung geliefert wird von der DaoCustomerFactory wird es In-Memory, SQL/NoSQL Datenbank , Filesystem oder ein anderes I/O System gespeichert und gelesen.

Customer:
Model Objekt um den Kunden zu represesentieren.
