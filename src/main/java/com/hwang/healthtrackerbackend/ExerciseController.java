package com.hwang.healthtrackerbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public void addExercise(Exercise e){
        if(e.getTimestamp() == null){
            Date currentTime = Calendar.getInstance().getTime();
            e.setTimestamp(currentTime.toString());
        }
        exerciseRepo.save(e);
    }

}
