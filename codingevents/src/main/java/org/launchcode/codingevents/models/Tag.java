package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Tag extends AbstractEntity{
    @Size(min= 1, max = 25)
    private String name;

    @ManyToMany(mappedBy = "tags")
    private final List<Event> events = new ArrayList<>();

    public Tag(String name) {
        this.name = name;
    }

    public Tag() {}

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return "#" + name + " ";
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setName(String name) {
        this.name = name;
    }
}