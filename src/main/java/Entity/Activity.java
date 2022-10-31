package Entity;

import java.util.Date;

public class Activity {
    private String title;
    private String dess;
    private Type type;
    private Date startDate;
    private Date endDate;
    private Status status;
    private Responsable responsable;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDess() {
        return dess;
    }

    public void setDess(String dess) {
        this.dess = dess;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Activity(String title, String dess, Type type, Date startDate, Date endDate, Status status, Responsable responsable) {
        this.title = title;
        this.dess = dess;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.responsable = responsable;
    }
}
