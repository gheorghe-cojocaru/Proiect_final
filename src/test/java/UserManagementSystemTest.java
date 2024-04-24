import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import userManagement.DatabaseManager;
import userManagement.User;
import userManagement.UserManagementSystem;

import java.util.List;

import static org.junit.Assert.*;

public class UserManagementSystemTest {
    private UserManagementSystem userManagementSystem;
    private DatabaseManager databaseManager;

    @Before
    public void setUp() {
        userManagementSystem = new UserManagementSystem();
        databaseManager = new DatabaseManager();
    }


    @Test
    public void testAdaugareUtilizator() {

        // Testează adăugarea unui utilizator și verifică dacă acesta poate fi obținut corect din sistem

        User utilizator = new User(1, "Ion", "Popescu", "ion.popescu@email.ro", 30);
        userManagementSystem.addUser(utilizator);
        User utilizatorObținut = userManagementSystem.getUserById(1);
        assertNotNull(utilizatorObținut);
        assertEquals(utilizator.getId(), utilizatorObținut.getId());
    }

    @Test
    public void testȘtergereUtilizator() {

        // Testează ștergerea unui utilizator și verifică dacă acesta nu mai poate fi obținut din sistem

        User utilizator = new User(2, "Maria", "Ionescu", "maria.ionescu@email.ro", 25);
        userManagementSystem.addUser(utilizator);
        userManagementSystem.deleteUser(2);
        User utilizatorObținut = userManagementSystem.getUserById(2);
        assertNull(utilizatorObținut);
    }

    @Test
    public void testModificareEmail() {

        // Testează modificarea adresei de email a unui utilizator și verifică dacă modificarea a fost realizată corect

        User utilizator = new User(3, "Andrei", "Pop", "andrei.pop@email.ro", 35);
        userManagementSystem.addUser(utilizator);
        userManagementSystem.modifyEmail(3, "andrei.nou@email.ro");
        User utilizatorObținut = userManagementSystem.getUserById(3);
        assertEquals("andrei.nou@email.ro", utilizatorObținut.getEmail());
    }

    @Test
    public void testObținereToțiUtilizatorii() {

        // Testează obținerea tuturor utilizatorilor și verifică dacă numărul de utilizatori este corect

        userManagementSystem.addUser(new User(4, "Elena", "Dumitrescu", "elena.dumitrescu@email.ro", 40));
        userManagementSystem.addUser(new User(5, "Radu", "Constantinescu", "radu.constantinescu@email.ro", 45));
        List<User> utilizatori = userManagementSystem.getAllUsers();
        assertEquals(2, utilizatori.size());

    }
}
