package es.jmruirod.firstspring5coursecrudjpaclient.service;

import java.util.List;

import es.jmruirod.firstspring5coursecrudjpaclient.model.Training;

public interface TrainingServiceInterface 
{
    public List<Training> getAll();
    public void create(Training training);    
}
