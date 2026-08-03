package cz.fitbud.entity.workout;

import cz.fitbud.entity.Exercise;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class WorkoutExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int exerciseOrder;

    @ManyToOne
    @JoinColumn(name = "workout_id")
    Workout workout;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    Time rest;
    int repRangeLow,repRangeHigh;

    public WorkoutExercise(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getExerciseOrder() {
        return exerciseOrder;
    }

    public void setExerciseOrder(int exerciseOrder) {
        this.exerciseOrder = exerciseOrder;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Time getRest() {
        return rest;
    }

    public void setRest(Time rest) {
        this.rest = rest;
    }

    public int getRepRangeLow() {
        return repRangeLow;
    }

    public void setRepRangeLow(int repRangeLow) {
        this.repRangeLow = repRangeLow;
    }

    public int getRepRangeHigh() {
        return repRangeHigh;
    }

    public void setRepRangeHigh(int repRangeHigh) {
        this.repRangeHigh = repRangeHigh;
    }
}
