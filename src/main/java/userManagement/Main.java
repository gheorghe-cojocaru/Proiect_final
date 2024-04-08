package userManagement;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static UserManagementSystem userManagementSystem = new UserManagementSystem();

    /*Vom avea nevoie de metodele care:
       1. Afiseaza meniul principal
       2. Cere si returneaza optiunea utilizatorului
       3. Afiseaza toti utilizatorii
       4. Afiseaza utilizatorii dupa ID
       5. Adauga un utilizator nou
       6. Sterge un utilizator
       7. Modifica numele unui utilizator
       8. Modifica emailul unui utilizator
      */

    private static void displayMenu() {
        System.out.println("Meniu");
        System.out.println("1. Afisare toti utilizatorii ");
        System.out.println("2. Afisare utilizator dupa ID");
        System.out.println("3. Adaugare utilizator nou");
        System.out.println("4. Stergere utilizator");
        System.out.println("5. Modificare email utilizator");
        System.out.println("6. Iesire din aplicatie");
        System.out.print("Alege optiunea dorita: ");
    }


    private static int getUserChoice() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void displayAllUsers() {
        userManagementSystem.displayAllUsers();
    }

    private static void displayUserById() {
        System.out.print("Introdu ID-ul utilizatorului: ");
        int userId = scanner.nextInt();
        userManagementSystem.displayUserById(userId);
    }

    private static void addUser() {
        System.out.println("Introdu ID-ul utilizatorului: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Introdu numele utilizatorului: ");
        String name = scanner.nextLine();
        System.out.println("Introdu prenumele utilizatorului: ");
        String surname = scanner.nextLine();
        System.out.println("Introdu emailul utilizatorului: ");
        String email = scanner.nextLine();
        System.out.println("Introdu varsta utilizatorului: ");
        int age = Integer.parseInt(scanner.nextLine());
        userManagementSystem.addUser(new User(id, name, surname, email, age));
        System.out.println("Utilizatorul a fost adaugat cu succes.");
    }


    private static void deleteUser() {
        System.out.println("Introdu ID-ul utilizatorului de sters: ");
        int userId = Integer.parseInt(scanner.nextLine());
        userManagementSystem.deleteUser(userId);
        System.out.println("Utilizatorul a fost sters cu succes.");
    }


    private static void modifyUserEmail() {
        System.out.println("Introdu ID-ul utilizatorului pentru modificare email: ");
        int userId = Integer.parseInt(scanner.nextLine());
        System.out.println("Introdu noul Email pentru utilizator: ");
        String newEmail = scanner.nextLine();
        userManagementSystem.modifyEmail(userId, newEmail);
        System.out.println("Emailul a fost modificat cu succes.");
    }

    public static void main(String[] args) {

        //Meniul interactiv

        boolean run = true;
        while (run) {
            displayMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    displayAllUsers();
                    break;
                case 2:
                    displayUserById();
                    break;
                case 3:
                    addUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    modifyUserEmail();
                    break;
                case 6:
                    System.out.print("Aplicatia se inchide. La revedere!");
                    run = false;
                    break;
                default:
                    System.out.print("Optiune invalida. Te rog sa alegi din nou.");
            }
        }
        scanner.close();
    }
}
