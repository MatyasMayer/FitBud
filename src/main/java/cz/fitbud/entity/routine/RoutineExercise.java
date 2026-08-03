package cz.fitbud.entity.routine;

import cz.fitbud.entity.Exercise;
import cz.fitbud.entity.workout.Workout;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.Duration;

@Entity
public class RoutineExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int exerciseOrder;

    @ManyToOne
    @JoinColumn(name = "routine_id")
    Routine routine;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    Duration rest;
    int repsMin,repsMax,setCnt;

    public RoutineExercise(){}

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

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Duration getRest() {
        return rest;
    }

    public void setRest(Duration rest) {
        this.rest = rest;
    }

    public int getRepsMin() {
        return repsMin;
    }

    public void setRepsMin(int repsMin) {
        this.repsMin = repsMin;
    }

    public int getRepsMax() {
        return repsMax;
    }

    public void setRepsMax(int repsMax) {
        this.repsMax = repsMax;
    }

    public int getSetCnt() {
        return setCnt;
    }

    public void setSetCnt(int setCnt) {
        this.setCnt = setCnt;
    }
}
