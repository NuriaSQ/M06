# MÒDUL: Accés a dades - Activitat RA2 - jdbctemplate + h2
Activitat que gestiona l'accés a les dades d'una base de dades sql i la mostra per pantalla mitjançant h2-console o localhost amb .json.


**1. Per fer l'endpoint GET creem la funció a CustomerRepository i després es cridarà per CustomerController:**

CustomerRepository:

![image alt](imatges/cap1_funcioFindAll.jpg)

CustomerController:

![image alt](imatges/cap5_endpointget.jpg)

**El resultat, un cop executem l'aplicació, serà poder veure les dades de la base de dades que hem creat amb format JSON o també visualitzar-lo amb H2 console**

Base de dades, arxiu dades.sql per crear la taula:

![image alt](imatges/cap3_tablaSQL.jpg)

Dades amb format JSON:

![image alt](imatges/cap4_endopintGetJSON.jpg)

Dades utilitzant H2 console:

![image alt](imatges/cap7_exempleh2console.jpg)

**2. Per fer l'endpoint POST creem la funció a CustomerRepository i després cridem la funció mitjançant la comanda CURL per terminal:**

CustomerRepository:

![image alt](imatges/cap2_funcioInsert.jpg)

CustomerController:

![image alt](imatges/cap6_endpointpost.jpg)

Quan utilitzem curl -X POST http://localhost:8080/jdbctemplate/addUsers, si tot va bé, ens sortirà el missatge d'èxit i ho podrem visualitzar un altre cop però amb els canvis
aplicats i els nous customers afegits.

Resultat CURL per terminal:

![image alt](imatges/cap8_exempleCurlX.jpg)

Dades actualitzades amb format JSON:

![image alt](imatges/cap9_customersNousInsertats.jpg)



