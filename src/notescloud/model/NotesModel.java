package notescloud.model;

import java.math.BigInteger;

public class NotesModel {
    private int id;
    private String title;
    private String text;
    private BigInteger timecreated;
    private BigInteger timemodified;
    private int length;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BigInteger getTimecreated() {
        return timecreated;
    }

    public void setTimecreated(BigInteger timecreated) {
        this.timecreated = timecreated;
    }

    public BigInteger getTimemodified() {
        return timemodified;
    }

    public void setTimemodified(BigInteger timemodified) {
        this.timemodified = timemodified;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
