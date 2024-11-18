package ua.edu.ucu.apps.decorator;

import java.time.Duration;
import java.time.LocalTime;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TimedDocument implements Document {
    private Document document;
    @Override
    public String parse(){
        LocalTime startTime = LocalTime.now();

        String pased = document.parse();

        LocalTime endTime = LocalTime.now();

        System.out.println("Time: "
        + Duration.between(startTime, endTime).getSeconds());

        return pased;

    }
    @Override
    public String getGcsPath() {
        return document.getGcsPath();
    }
}
