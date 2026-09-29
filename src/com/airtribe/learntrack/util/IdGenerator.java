package com.airtribe.learntrack.util;

public class IdGenerator {
	private static int studentCounter = 100;
    private static int courseCounter = 500;

    public static String getNextStudentId() {
        return "STU" + (++studentCounter);
    }

    public static String getNextCourseId() {
        return "CRS" + (++courseCounter);
    }
} 

