package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

public class Event {
    private int id;
    private static int nextId = 1;
    @Size(min=3, max=50, message = "Name must be between 3 and 50 characters.")
    @NotBlank (message="Name is required")
    private String name;
    @Size(max=500, message = "Description too long!")
    private String description;
    @NotBlank (message="email is required.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;
    @NotNull
    @NotBlank (message="Location cannot be left blank")
    private String location;
    @AssertTrue(message="Registration is required")
    private boolean registrationRequired;
    @Positive(message="Number of attendees must be one or more")
    private int numberOfAttendees;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future (message="Event must be in the future.")
    private Date dateOfEvent;

    private EventType type;

    public Event(String name, String description, String contactEmail, EventType event) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registrationRequired = registrationRequired;
        this.numberOfAttendees = numberOfAttendees;
        this.dateOfEvent = dateOfEvent;
        this.type = type;

    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public Date getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
