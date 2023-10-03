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

/**
 * Controlador que gestiona las solicitudes relacionadas con los cursos de formación.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@RestController
public class TrainingController 
{
    @Autowired
    private TrainingServiceInterface service;

    /**
     * Obtiene una lista de todos los cursos de formación.
     * 
     * @return Lista de cursos de formación en formato JSON.
     * @apiNote GET: localhost:8081/trainings
     */
    @GetMapping(value = "trainings")
    public List<Training> getAll()
    {
        return this.service.getAll();
    }

    /**
     * Crea un nuevo curso de formación y lo agrega utilizando los datos proporcionados en formato JSON.
     * 
     * @param training El curso de formación a crear y agregar en formato JSON.
     * @apiNote POST: localhost:8081/training
     */
    @PostMapping(value = "training", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Training training)
    {
        this.service.create(training);
    }
}