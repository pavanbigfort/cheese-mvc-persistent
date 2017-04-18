package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pppedd1 on 4/17/17.
 */

@Entity
public class Menu {

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    private List<Cheese> cheeses;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }



    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public Menu() {}

    public Menu(String name) {
        this.name = name;
    }

    public void addItem(Cheese item)
    {

     cheeses.add(item);

    }

}
