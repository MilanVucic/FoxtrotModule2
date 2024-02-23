package lesson_5;

public class Task implements HasPriority {
    private String name;
    private String description;
    private int priority;
    private int duration;

    public Task(String name, String description, int priority, int duration) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name;
    }
}
