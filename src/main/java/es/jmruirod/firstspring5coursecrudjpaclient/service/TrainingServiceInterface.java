package es.jmruirod.firstspring5coursecrudjpaclient.service;

import java.util.List;

import es.jmruirod.firstspring5coursecrudjpaclient.model.Training;

/**
 * Interfaz que define los métodos de servicio para la gestión de cursos de formación.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface TrainingServiceInterface 
{
    /**
     * Obtiene una lista de todos los cursos de formación.
     * 
     * @return Lista de cursos de formación.
     */
    public List<Training> getAll();

    /**
     * Crea un nuevo curso de formación y lo agrega.
     * 
     * @param training El curso de formación a crear y agregar.
     */
    public void create(Training training);    
}