package cz.fitbud.bootstrap;

import cz.fitbud.dto.ExerciseDTO;
import cz.fitbud.entity.Exercise;
import cz.fitbud.repository.ExerciseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataSeeder  implements CommandLineRunner {

    private final ExerciseRepository exerciseRepo;

    public DataSeeder(ExerciseRepository exerciseRepo) {
        this.exerciseRepo = exerciseRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        if(exerciseRepo.count() == 0) {

            ObjectMapper mapper = new ObjectMapper();

            try (InputStream is = getClass().getResourceAsStream("/exercises.json")) {

                ExerciseDTO dataTransferObject = mapper.readValue(is, ExerciseDTO.class);

                List<Exercise> exercises = dataTransferObject.getExercises();

                System.out.println("Exercises successfully read and loaded into DTO.");

                exerciseRepo.saveAll(exercises);

                System.out.println("Exercises successfully loaded into DB.");

            } catch (Exception e) {
                System.out.println("The system wasn't able to read exercises json: " + e.getMessage());
            }
        }else{
            System.out.println("DB already filled");
        }

    }
}
