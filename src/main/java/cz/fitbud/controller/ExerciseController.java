package cz.fitbud.controller;

import cz.fitbud.entity.Exercise;
import cz.fitbud.repository.ExerciseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    private final ExerciseRepository exerciseRepo;

    public ExerciseController(ExerciseRepository exerciseRepo){
        this.exerciseRepo = exerciseRepo;
    }

    @GetMapping
    public List<Exercise> getExercises(){
        return exerciseRepo.findAll();
    }

}
