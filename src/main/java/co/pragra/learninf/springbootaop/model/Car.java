package co.pragra.learninf.springbootaop.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    // Setter Based Injection
    private Student owner;

    public Student getOwner() {
        return owner;
    }

    @Autowired
    public void setOwner(Student owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner=" + owner +
                '}';
    }


}

