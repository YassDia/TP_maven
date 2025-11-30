package fr.esir.omd.ci;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {tasks.add(task);
        logger.info("Nouvelle tâche ajoutée {}");}

    public List<Task> getTasks() {

        logger.debug("Récupération de la liste des {} tâches");
        return tasks;
    }

    private static final Logger logger = LoggerFactory.getLogger(TaskManager.class);

    private List<String> listeTaches = new ArrayList<>();

    public void ajouterTache(String tache) {
        if (tache != null && !tache.isEmpty()) {
            listeTaches.add(tache);
        }
    }

    public void supprimerTache(String tache) {
        listeTaches.remove(tache);
    }

    public int nombreTaches() {
        return listeTaches.size();
    }


}
