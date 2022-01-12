package co.pragra.learninf.springbootaop.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    public String name;
    public String course;

    public Student( @Value("${student.name:Dummy Student}") String name,  @Value("${class.name}") String course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
