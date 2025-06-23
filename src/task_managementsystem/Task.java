package task_managementsystem;

public class Task {
    private final int taskid;
    private String taskname;
    private String taskDescription;

    public String getTaskname() {
        return taskname;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Task(int taskid, String taskname, String taskDescription) {
        this.taskid = taskid;
        this.taskname = taskname;
        this.taskDescription=taskDescription;
    }
}
