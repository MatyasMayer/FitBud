package cz.fitbud.service;

import cz.fitbud.entity.routine.Routine;
import cz.fitbud.repository.RoutineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutineService {

    private final RoutineRepository routineRepository;

    public RoutineService(RoutineRepository routineRepository){
        this.routineRepository = routineRepository;
    }

    public Routine saveRoutine(Routine routine){
        return routineRepository.save(routine);
    }

    public void deleteRoutine(String routineName){ routineRepository.delete(routineRepository.findRoutineByNameContainingIgnoreCase(routineName)); }

    public List<Routine> getAllRoutines(){
        return routineRepository.findAll();
    }
}
