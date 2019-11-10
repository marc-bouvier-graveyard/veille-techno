package fr.baldir;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Category extends PanacheEntity implements Serializable {

    @Id
    public String name;
    public String label;
}
