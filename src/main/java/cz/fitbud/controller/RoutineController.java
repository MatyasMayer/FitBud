package cz.fitbud.controller;

import cz.fitbud.entity.routine.Routine;
import cz.fitbud.service.RoutineService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/routines")
@CrossOrigin(origins = "*")
public class RoutineController {

    private final RoutineService routineServ;

    public RoutineController(RoutineService routineServ) {
        this.routineServ = routineServ;
    }

    @GetMapping
    public List<Routine> getRoutines() {
        return routineServ.getAllRoutines();
    }

    @PostMapping
    public Routine saveRoutine(@RequestBody Routine routine) {
        return routineServ.saveRoutine(routine);
    }

    @PostMapping
    public void deleteRoutine(@RequestBody String routineName) {
        routineServ.deleteRoutine(routineName);

    }
}
