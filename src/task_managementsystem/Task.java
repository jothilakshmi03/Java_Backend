package task_managementsystem;

import java.util.Date;

public class Task {
    private final int taskid;
    private String taskname;
    private String taskDescription;
    private Date duedate;

    public Date getDuedate() {
        return duedate;
    }

    public String getTaskname() {
        return taskname;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Task(int taskid, String taskname, String taskDescription,Date duedate) {
        this.taskid = taskid;
        this.taskname = taskname;
        this.taskDescription=taskDescription;
        this.duedate=duedate;
    }
}
