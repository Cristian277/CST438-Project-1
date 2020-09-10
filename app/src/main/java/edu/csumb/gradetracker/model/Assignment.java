package edu.csumb.gradetracker.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Assignment {

    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "Due Date")
    private String dueDate;

    @ColumnInfo(name = "Earned Score")
    private long earnedScore;

    @ColumnInfo(name = "Max Score")
    private long maxScore;

<<<<<<< HEAD
//    @ColumnInfo(name = "Assignment name")
    private String assignmentName;

//    @ColumnInfo(name = "course title")
=======
    @ColumnInfo(name = "Assignment Name")
    private String assignmentName;

    @ColumnInfo(name = "Course Title")
>>>>>>> 25046b11cb5e1fd226cf4311dde1e197cfe774e9
    private String courseTitle;

    public Assignment() {}

    @Ignore
    public Assignment(String courseTitle, String assignmentName, String dueDate, long earnedScore, long maxScore){
        this.assignmentName = assignmentName;
        this.courseTitle = courseTitle;
        this.dueDate = dueDate;
        this.earnedScore = earnedScore;
        this.maxScore = maxScore;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getCourseTitle() { return courseTitle; }

    public void setCourseTitle(String courseTitle) { this.courseTitle = courseTitle; }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public long getEarnedScore() {
        return earnedScore;
    }

    public void setEarnedScore(long earnedScore) {
        this.earnedScore = earnedScore;
    }

    public long getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(long maxScore) {
        this.maxScore = maxScore;
    }
}
