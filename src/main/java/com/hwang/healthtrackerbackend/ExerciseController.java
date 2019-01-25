package com.hwang.healthtrackerbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Calendar;
import java.util.Date;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseRepository exerciseRepo;

    @GetMapping("/exercises")
    public Iterable<Exercise> getExercise(){
        return exerciseRepo.findAll();
    }

    @PostMapping("/exercises")
    public Exercise addExercise(@RequestParam String title,
                            @RequestParam String sets,
                            @RequestParam String reps,
                            @RequestParam String descrption,
                            @RequestParam String timestamp){
        if(timestamp == null){
            Date currentTime = Calendar.getInstance().getTime();
            timestamp = currentTime.toString();
        }
        Exercise newExerciseObject = new Exercise(title,  Integer.parseInt(sets), Integer.parseInt(reps), descrption, timestamp);
        return exerciseRepo.save(newExerciseObject);
    }

}
