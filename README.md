# User Management System

A simple Java application for managing user information, with basic functionalities such as adding, deleting, modifying, and displaying users. The application interacts with a MySQL database to store user data.

## Getting Started

To run this application, you will need to have Java and MySQL installed on your system.

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/user-management-system.git
   cd user-management-system
   ```

2. **Set up the database:**
    - Create a MySQL database named `user_management`.
    - Update the database connection details (`URL`, `USERNAME`, `PASSWORD`) in the `DatabaseManager` class if necessary.

3. **Compile and run:**
   ```sh
   javac Main.java
   java Main
   ```

## Functionality

The application offers the following functionalities:

1. **Display All Users:** View a list of all users.
2. **Display User by ID:** View details of a user by providing their ID.
3. **Add User:** Add a new user to the system.
4. **Delete User:** Remove a user from the system based on their ID.
5. **Update User Email:** Update a user's email address.
6. **Exit Application:** Terminate the application.

## Code Structure

The project structure is organized as follows:

- `Main.java`: Contains the main class with the interactive menu and user input/output logic.
- `User.java`: Defines the `User` class with attributes and methods related to user management.
- `UserManagementSystem.java`: Implements user management functionalities such as adding, deleting, and modifying users.
- `DatabaseManager.java`: Handles database operations such as adding, deleting, and updating user data.
- `UserManagementSystemTest.java`: Contains JUnit tests to validate the functionality of the `UserManagementSystem` class.

## Testing

The application includes JUnit tests to ensure the correctness of user management operations. These tests cover adding users, deleting users, updating user email addresses, and retrieving all users.

## Author

Gheorghe Cojocaru
```

This `README.md` provides a comprehensive yet concise overview of the User Management System project, including setup instructions, functionality, code structure, and testing information.

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

