package cz.fitbud.repository;

import cz.fitbud.entity.routine.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutineRepository extends JpaRepository<Routine,Long> {

    public Routine findRoutineByNameContainingIgnoreCase(String name);
}
