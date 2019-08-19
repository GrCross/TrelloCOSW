package lab1.model;

import java.util.List;
import java.util.Objects;

public class Board{

    String name;
    List<Task> tasks;

    public Board(String name) {
        this.name = name;
    }
  
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Board)) {
            return false;
        }
        Board board = (Board) o;
        return Objects.equals(name, board.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}