package io.akashstack.todoapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class TaskModel {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long serialVersionUID;

    @Column(name = "task_title")
	private String task_title;
    
    @Column(name = "task_name")
	private String task_name;
    

    /**
     * @return long return the serialVersionUID
     */
    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param serialVersionUID the serialVersionUID to set
     */
    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    /**
     * @return String return the task_title
     */
    public String getTask_title() {
        return task_title;
    }

    /**
     * @param task_title the task_title to set
     */
    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    /**
     * @return String return the task_name
     */
    public String getTask_name() {
        return task_name;
    }

    /**
     * @param task_name the task_name to set
     */
    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }	
	public TaskModel(){}
	public TaskModel(String task_title, String task_name) {
		super();
		this.task_title = task_title;
		this.task_name = task_name;
	}

}
