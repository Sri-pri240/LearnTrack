package com.airtribe.learntrack.entity;

public class Course {
	private String id;
    private String courseName;
    private int durationInWeeks;
    private boolean active;

    public Course(String id, String courseName, int durationInWeeks) {
        this.id = id;
        this.courseName = courseName;
        this.durationInWeeks = durationInWeeks;
        this.active = true;
    }

    public String getId() { return id; }
    public String getCourseName() { return courseName; }
    public int getDurationInWeeks() { return durationInWeeks; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}

