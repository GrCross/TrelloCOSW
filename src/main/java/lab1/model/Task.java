package lab1.model;

import java.util.List;
import java.util.Objects;

public class Task {

    String description;
    List<String> subJobsl;
    List<Tag> tags;

    public Task() {
    }

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }

    @Override
    public String toString() {
        return "{" +
            " description='" + getDescription() + "'" +
            "}";
    }
    

}