/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 James Karlinski
 */

package ucf.assignments;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EditTodoController implements Initializable
{
    @FXML private TextField todoDescription;
    @FXML private DatePicker todoDueDate;
    @FXML private ComboBox<String> comboStatusOptions;

    public Todo selectedTodo;
    public TodoList selectedTodoList;

    @Override public void initialize(URL url, ResourceBundle rb)
    {
        // populate todo status option combo box
    }

    public void setupFields(Todo selectedTodo, TodoList selectedTodoList)
    {
        // set input field values using the selected todo object
    }

    @FXML private void saveTodo(ActionEvent event)
    {
        // make sure there a todo list is selected

        // map the selected status value

        // get description and due date input values

        // validate the description and due date input values

        // update valid todo values

        // find the path for the todo list file that contains the selected todo

        // update the file

        // refresh todo lists

        // close edit todo window
    }
}
