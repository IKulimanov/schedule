package ru.rsatu.university.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Teacher extends PanacheEntity {
    private String first_name;
    private String three_name;
    private String last_name;

    public Teacher() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getThree_name() {
        return three_name;
    }

    public void setThree_name(String three_name) {
        this.three_name = three_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

}
