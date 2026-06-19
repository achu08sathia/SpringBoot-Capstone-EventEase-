package com.eventease.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class EventDTO {

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    private LocalDate date;

    @NotBlank
    private String location;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
