package cz.fitbud.dto;

import cz.fitbud.entity.Exercise;
import java.util.List;

public class ExerciseDTO {

    private List<String> categories;
    private List<String> equipment;
    private List<Exercise> exercises;

    //============ Constructor====================

    public ExerciseDTO () {}

    // ===========Getters and setters=============


    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }
}
