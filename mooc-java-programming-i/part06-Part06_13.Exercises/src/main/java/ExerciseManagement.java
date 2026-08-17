import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        exercises = new ArrayList<>();
    }

    public ArrayList<Exercise> exerciseList() {
        return exercises;
    }

    public void add(String name) {
        exercises.add(new Exercise(name));
    }

    public void markAsCompleted(String name) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name)) {
                exercise.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String name) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name)) {
                return exercise.isCompleted();
            }
        }
        return false;
    }
}