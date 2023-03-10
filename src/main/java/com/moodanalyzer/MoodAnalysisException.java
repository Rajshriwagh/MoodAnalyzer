package com.moodanalyzer;

public class MoodAnalysisException extends Exception {
    public exceptionType type;

    public MoodAnalysisException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL
    } 

}
