package com.raiven.taskfilter.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class Database {
	
	private ObservableList<Task> tasks;
	private TableView<Task> table;

	public Database(TableView<Task> table) {
		this.table = table;
		tasks = FXCollections.observableArrayList();
		getContents();
		table.getItems().addAll(tasks);
	}

	private void getContents() {
		// TODO Auto-generated method stub
		addTask("do programming assignment", Task.OPEN)
		.addTask("actually help my teammates in the project", Task.PENDING)
		.addTask("get my money back from wolfe", Task.PENDING)
		.addTask("give shorbo a shaved bald haircut", Task.CLOSED)
		.addTask("help vinith finish his protein bowl", Task.CLOSED)
		.addTask("take anis to the synagogue", Task.PENDING)
		.addTask("buy food from poulet rouge", Task.IN_PROGRESS)
		.addTask("go to gym", Task.OPEN);
	}

	private Database addTask(String string, String open) {
		// TODO Auto-generated method stub
		addTask(new Task(tasks.size(), string, open));
		return this;
	}

	private Database addTask(Task task) {
		// TODO Auto-generated method stub
		tasks.add(task);
		return this;
	}

	public ObservableList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ObservableList<Task> tasks) {
		this.tasks = tasks;
	}

	public void filter(String selectedItem) {
		// TODO Auto-generated method stub
		if (selectedItem.equals("ALL")) {
			table.setItems(tasks);
		}
		else {
			table.setItems(tasks.filtered(task -> task.getStatus().equalsIgnoreCase(selectedItem)));
		}
	}
	
}
