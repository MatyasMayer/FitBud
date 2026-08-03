package cz.fitbud.repository;

import cz.fitbud.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ExerciseRepository extends JpaRepository<Exercise,Long> {

    List<Exercise> findByNameContainingIgnoreCase(String name);

    List<Exercise> findByPrimaryMusclesContainingIgnoreCase(String muscle);

    List<Exercise> findByNameContainingIgnoreCaseAndPrimaryMusclesContainingIgnoreCase (String name, String primaryMuscles);

    // For dropdown menu
    @Query("SELECT DISTINCT m FROM Exercise e JOIN e.primaryMuscles m")
    List<String> findAllDistinctPrimaryMuscles();
}
