package es.jmruirod.firstspring5coursecrudjpaclient.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Training 
{
    private String course;
    private int subjectNumber;
    private int price;
    
    public Training() 
    {

    }

    public Training(String course, int subjectNumber, int price) 
    {
        this.course = course;
        this.subjectNumber = subjectNumber;
        this.price = price;
    }

    public String getCourse() 
    {
        return course;
    }

    public void setCourse(String course) 
    {
        this.course = course;
    }

    public int getSubjectNumber() 
    {
        return subjectNumber;
    }

    public void setSubjectNumber(int subjectNumber) 
    {
        this.subjectNumber = subjectNumber;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    @Override
    public String toString() 
    {
        return "Training [course=" + course + ", subjectNumber=" + subjectNumber + ", price=" + price + "]";
    }

    @Override
    public int hashCode() 
    {
        return Objects.hashCode(course);
    }

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

    public Course toCourse() 
    {
        return new Course(this.getCourse(), this.getSubjectNumber()*10, this.getPrice());
    }
}
