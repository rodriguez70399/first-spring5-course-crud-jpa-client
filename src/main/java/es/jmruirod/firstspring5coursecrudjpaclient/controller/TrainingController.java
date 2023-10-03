package es.jmruirod.firstspring5coursecrudjpaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.firstspring5coursecrudjpaclient.model.Training;
import es.jmruirod.firstspring5coursecrudjpaclient.service.TrainingServiceInterface;

@RestController
public class TrainingController 
{
    @Autowired
    private TrainingServiceInterface service;

    @GetMapping(value = "trainings")
    public List<Training> getAll()
    {
        return this.service.getAll();
    }

    @PostMapping(value = "training", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Training training)
    {
        this.service.create(training);
    }
}