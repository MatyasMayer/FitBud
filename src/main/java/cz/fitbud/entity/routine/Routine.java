package cz.fitbud.entity.routine;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.fitbud.entity.workout.WorkoutExercise;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Routine {

    @JsonProperty("name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Routine() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
