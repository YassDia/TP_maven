package fr.esir.omd.ci;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskManagerTest {

    @Test
    public void testAjouterTacheSimple() {
        TaskManager tm = new TaskManager();
        tm.ajouterTache("Tâche 1");
        assertEquals(1, tm.nombreTaches());
    }

    @Test
    public void testSupprimerTacheSimple() {
        TaskManager tm = new TaskManager();
        tm.ajouterTache("Tâche 1");
        tm.supprimerTache("Tâche 1");
        assertEquals(0, tm.nombreTaches());
    }
}
