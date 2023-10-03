package es.jmruirod.firstspring5coursecrudjpaclient.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.jmruirod.firstspring5coursecrudjpaclient.model.Course;
import es.jmruirod.firstspring5coursecrudjpaclient.model.Training;

@Service
public class TrainingServiceInterfaceImplemented implements TrainingServiceInterface
{
    @Autowired
    private RestTemplate template;

    private String url = "http://localhost:8080/";

    @Override
    public List<Training> getAll() 
    {
        List<Course> courseList = Arrays.asList(template.getForObject(url + "courses", Course[].class));
        return Training.getTrainingFromCourseList(courseList);
    }

    @Override
    public void create(Training trainingToCreate) 
    {
        List<Training> trainingList = this.getAll();

        if (!trainingList.stream().anyMatch(training -> training.getCourse().equals(trainingToCreate.getCourse())))
        {
            template.postForLocation(url + "course", trainingToCreate.toCourse());
        }
    }
}