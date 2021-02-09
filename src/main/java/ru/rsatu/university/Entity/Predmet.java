package ru.rsatu.university.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.*;

import javax.persistence.Entity;

@Entity
@NamedQueries({
        @NamedQuery(name = "UsersEntity.getAll",
                query = "SELECT f FROM Predmet f ")

})
public class Predmet extends PanacheEntity {
    private String name;
    private String cabinet;
    private String ocenka_type;
    private int weak;
    private String type_weak;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public Predmet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCabinet() {
        return cabinet;
    }

    public void setCabinet(String cabinet) {
        this.cabinet = cabinet;
    }

    public String getOcenka_type() {
        return ocenka_type;
    }

    public void setOcenka_type(String ocenka_type) {
        this.ocenka_type = ocenka_type;
    }

    public int getWeak() {
        return weak;
    }

    public void setWeak(int weak) {
        this.weak = weak;
    }

    public String getType_weak() {
        return type_weak;
    }

    public void setType_weak(String type_weak) {
        this.type_weak = type_weak;
    }
}
