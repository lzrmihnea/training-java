package ro.training.java.c18.prototype;

import java.util.Date;
import java.util.List;

public class Ticket {
    Long id;
    String title;
    String description;
    Long creatingUser;
    Long assignedUser;
    Long relatedUser;
    Date createdDate;
    Date closedDate;
    Date lastUpdate;
    List<String> comments;

    @Override
    public Object clone() throws CloneNotSupportedException {
        if(this.getId() == null) {
            throw new CloneNotSupportedException("Cannot create a clone out of an unsaved object! Valea.");
        }
        Ticket clone = new Ticket();
        clone.setTitle(this.getTitle());
        clone.setDescription(this.getDescription());
        clone.setAssignedUser(this.getAssignedUser());
        clone.setComments(this.getComments());
        return clone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getCreatingUser() {
        return creatingUser;
    }

    public void setCreatingUser(Long creatingUser) {
        this.creatingUser = creatingUser;
    }

    public Long getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(Long assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Long getRelatedUser() {
        return relatedUser;
    }

    public void setRelatedUser(Long relatedUser) {
        this.relatedUser = relatedUser;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
