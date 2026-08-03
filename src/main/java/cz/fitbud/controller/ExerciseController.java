package cz.fitbud.controller;

import cz.fitbud.entity.Exercise;
import cz.fitbud.repository.ExerciseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Objects;

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

    //for dropdown menu
    @GetMapping("/muscles")
    public List<String> getMuscles(){
        return exerciseRepo.findAllDistinctPrimaryMuscles();
    }

    @GetMapping("/search")
    public List<Exercise> searchExercises (@RequestParam(defaultValue = "") String name,@RequestParam(defaultValue = "") String muscle){

        if(Objects.equals(name, "") && Objects.equals(muscle, "")){
            return exerciseRepo.findAll();
        }else if(!Objects.equals(name, "") && Objects.equals(muscle, "")){
            return exerciseRepo.findByNameContainingIgnoreCase(name);
        }else if (Objects.equals(name, "")){
            return exerciseRepo.findByPrimaryMusclesContainingIgnoreCase(muscle);
        }else{
            return exerciseRepo.findByNameContainingIgnoreCaseAndPrimaryMusclesContainingIgnoreCase(name,muscle);
        }

    }

}
