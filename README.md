# Sistem de Management al Utilizatorilor

O aplicație simplă în Java pentru gestionarea informațiilor despre utilizatori, cu funcționalități de bază precum adăugarea, ștergerea, modificarea și afișarea utilizatorilor. Aplicația interacționează cu o bază de date MySQL pentru stocarea datelor despre utilizatori.

## Începutul Utilizării

Pentru a rula această aplicație, va trebui să aveți Java și MySQL instalate pe sistemul dumneavoastră.

1. **Clonați repository-ul:**

2. **Configurați baza de date:**
    - Creați o bază de date MySQL numită `user_management`.
    - Actualizați detaliile de conexiune la bază de date (`URL`, `USERNAME`, `PASSWORD`) în clasa `DatabaseManager`, dacă este necesar.

3. **Compilați și rulați:**


## Funcționalitate

Aplicația oferă următoarele funcționalități:

1. **Afișare Toți Utilizatorii:** Vizualizați o listă cu toți utilizatorii.
2. **Afișare Utilizator după ID:** Vizualizați detaliile unui utilizator furnizându-i ID-ul.
3. **Adăugare Utilizator:** Adăugați un utilizator nou în sistem.
4. **Ștergere Utilizator:** Eliminați un utilizator din sistem în funcție de ID-ul său.
5. **Modificare Email Utilizator:** Actualizați adresa de email a unui utilizator.
6. **Ieșire din Aplicație:** Terminați aplicația.

## Structura Codului

Structura proiectului este organizată astfel:

- `Main.java`: Conține clasa principală cu meniul interactiv și logica de intrare/ieșire a utilizatorului.
- `User.java`: Definește clasa `User` cu atribute și metode legate de gestionarea utilizatorilor.
- `UserManagementSystem.java`: Implementează funcționalitățile de gestionare a utilizatorilor precum adăugarea, ștergerea și modificarea utilizatorilor.
- `DatabaseManager.java`: Se ocupă de operațiile de bază de date precum adăugarea, ștergerea și actualizarea datelor utilizatorilor.
- `UserManagementSystemTest.java`: Conține teste JUnit pentru a valida funcționalitatea clasei `UserManagementSystem`.

## Testare

Aplicația include teste JUnit pentru a asigura corectitudinea operațiilor de gestionare a utilizatorilor. Aceste teste acoperă adăugarea utilizatorilor, ștergerea utilizatorilor, modificarea adreselor de email ale utilizatorilor și obținerea tuturor utilizatorilor.


## Autor

Gheorghe Cojocaru

