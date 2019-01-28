package com.hwang.healthtrackerbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;


import java.util.Calendar;
import java.util.Date;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseRepository exerciseRepo;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/exercises")
    public Iterable<Exercise> getExercise(){
        return exerciseRepo.findAll();
    }

    @PostMapping("/exercises")
    public Exercise addExercise(@RequestParam String title,
                            @RequestParam String sets,
                            @RequestParam String reps,
                            @RequestParam String description,
                            @RequestParam String timestamp,
                            @RequestParam String longitude,
                            @RequestParam String latitude){
        if(timestamp == null){
            Date currentTime = Calendar.getInstance().getTime();
            timestamp = currentTime.toString();
        }
        Exercise newExerciseObject = new Exercise(title,  Integer.parseInt(sets), Integer.parseInt(reps), description, timestamp, Double.parseDouble(longitude), Double.parseDouble(latitude));
        return exerciseRepo.save(newExerciseObject);
    }

    @GetMapping(value = "/exercises/reset")
    public RedirectView resetParkingLot() {
        Date currentTime = Calendar.getInstance().getTime();
        exerciseRepo.save(new Exercise("Server-Burpees", 1, 10, "All Day!", currentTime.toString(), 0.0, 0.0));

        return new RedirectView("/exercises");
    }

}
