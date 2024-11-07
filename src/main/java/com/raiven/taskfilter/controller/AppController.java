package com.raiven.taskfilter.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.raiven.taskfilter.model.Database;
import com.raiven.taskfilter.model.Task;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AppController implements Initializable {
	
	@FXML
	ComboBox<String> selectValueComboBox;
	
	@FXML
	TableView<Task> table;
	
	@FXML
	TableColumn<Task, Integer> numberColumn;
	
	@FXML
	TableColumn<Task, String> taskNameColumn;
	
	@FXML
	TableColumn<Task, String> statusColumn;
	
	Database database;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub;
		String[] items = {"CLOSED", "IN PROGRESS", "OPEN", "PENDING", "ALL"};
		database = new Database(table);
		selectValueComboBox.getItems().addAll(items);
		
		//set cell value factories
		numberColumn.setCellValueFactory(new PropertyValueFactory<>("number"));
		taskNameColumn.setCellValueFactory(new PropertyValueFactory<>("taskName"));
		statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
		
	}
	
	@FXML
	private void filter() {
		String selectedItem = selectValueComboBox.getSelectionModel().getSelectedItem();
		database.filter(selectedItem);
	}

}
