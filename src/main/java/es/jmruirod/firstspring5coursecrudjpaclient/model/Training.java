package es.jmruirod.firstspring5coursecrudjpaclient.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Esta clase representa una formación.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public class Training 
{
    private String course;
    private int subjectNumber;
    private int price;
    
    /**
     * Constructor por defecto de la clase Training.
     */
    public Training() 
    {

    }

    /**
     * Constructor de la clase Training.
     * 
     * @param course        El nombre del curso de formación.
     * @param subjectNumber El número de asignaturas del curso.
     * @param price         El precio del curso.
     */
    public Training(String course, int subjectNumber, int price) 
    {
        this.course = course;
        this.subjectNumber = subjectNumber;
        this.price = price;
    }

    /**
     * Obtiene el nombre del curso de formación.
     * 
     * @return El nombre del curso de formación.
     */
    public String getCourse() 
    {
        return course;
    }

    /**
     * Establece el nombre del curso de formación.
     * 
     * @param course El nombre del curso de formación.
     */
    public void setCourse(String course) 
    {
        this.course = course;
    }

    /**
     * Obtiene el número de asignaturas del curso de formación.
     * 
     * @return El número de asignaturas del curso de formación.
     */
    public int getSubjectNumber() 
    {
        return subjectNumber;
    }

    /**
     * Establece el número de asignaturas del curso de formación.
     * 
     * @param subjectNumber El número de asignaturas del curso de formación.
     */
    public void setSubjectNumber(int subjectNumber) 
    {
        this.subjectNumber = subjectNumber;
    }

    /**
     * Obtiene el precio del curso de formación.
     * 
     * @return El precio del curso de formación.
     */
    public int getPrice() 
    {
        return price;
    }

    /**
     * Establece el precio del curso de formación.
     * 
     * @param price El precio del curso de formación.
     */
    public void setPrice(int price) 
    {
        this.price = price;
    }

    /**
     * Sobrescribe el método toString para representar el objeto Training como una cadena.
     */
    @Override
    public String toString() 
    {
        return "Training [course=" + course + ", subjectNumber=" + subjectNumber + ", price=" + price + "]";
    }

    /**
     * Calcula el hash code del objeto Training basado en el nombre del curso.
     */
    @Override
    public int hashCode() 
    {
        return Objects.hashCode(course);
    }

    /**
     * Compara dos objetos Training para determinar si son iguales.
     * Dos cursos de formación son iguales si tienen el mismo nombre, número de asignaturas y precio.
     */
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Training other = (Training) obj;

        if (course == null) 
        {
            if (other.course != null)
                return false;
        }
        else if (!course.equals(other.course))
            return false;

        if (subjectNumber != other.subjectNumber)
            return false;

        if (price != other.price)
            return false;
            
        return true;
    }

    /**
     * Convierte una lista de objetos Course en una lista de objetos Training.
     * 
     * @param courseList La lista de objetos Course a convertir.
     * @return Lista de objetos Training generados a partir de la lista de Course.
     */
    public static List<Training> getTrainingFromCourseList(List<Course> courseList) 
    {
        List<Training> trainingList = new ArrayList<>();

        for (Course course : courseList) 
        {
            Training training = new Training();

            training.setCourse(course.getName());
            training.setSubjectNumber(course.getDuration() >= 50 ? 10 : 5);
            training.setPrice(course.getPrice());

            trainingList.add(training);            
        }

        return trainingList;
    }

    /**
     * Convierte un objeto Training en un objeto Course.
     * 
     * @return Un objeto Course generado a partir del objeto Training.
     */
    public Course toCourse() 
    {
        return new Course(this.getCourse(), this.getSubjectNumber() * 10, this.getPrice());
    }
}