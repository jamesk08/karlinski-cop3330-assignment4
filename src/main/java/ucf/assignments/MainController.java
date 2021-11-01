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
import javafx.scene.control.*;

public class MainController implements Initializable
{
    @FXML TableColumn<TodoList, String> title;
    @FXML TableColumn<TodoList, String> description;
    @FXML TableColumn<TodoList, String> dueDate;
    @FXML TableColumn<TodoList, String> status;

    @Override public void initialize(URL url, ResourceBundle rb)
    {
        //  setup columns

        // load todo list from storage

        // setup todo table columns
        setupTodoTable();
    }

    public String getTodoListFilePath(TodoList todoList)
    {
        // get todo list path for given todo list
        return "";
    }

    @FXML public void loadTodoLists(int rowIndexToSelect)
    {
        // initialize todo list manager and load todo list from file storage

        // if todo lists found set todo list table values

        // set selected row using given row index
    }

    public void loadTodos()
    {
        // validate if a todo list is selected

        // initialize todoManager and get todo options
    }

    private void setupTodoListTable()
    {
        // setup the todo list table columns

        // set click event on the todo list so we can set the selected list
    }

    private void setupTodoTable()
    {
        // map todo display columns
    }

    @FXML private void addTodoList(ActionEvent event)
    {
        // get todo list title input and validate

        // create todo list storage directory if doesn't exist

        // create new todo list object

        // create new todo list file if doesnt exists

        // write into a file

        // clear title input field

        // refresh todo list table;
    }

    @FXML private void addTodo(ActionEvent event)
    {
        // get description and due date input values

        // validate the description and due date input values

        // initialize new todo object

        // get todo list file

        // save updated todo list from file storage

        // clear input values

        // refresh todo list using todos of selected list
    }

    @FXML private void deleteSelectedTodoList(ActionEvent event)
    {
        // validate for selected todo list

        // get the path for the todo list file that will be deleted

        // delete file

        // if todo list file is deleted remove the list item from display list
    }

    @FXML private void deleteSelectedTodo(ActionEvent event)
    {
        // get selected item from todo display list

        // validate for selected todo

        // find the todo list file using selected todo list

        // remove selected todo from todo list object

        // save the changes to the todo list file

        // remove the todo from display table
    }

    @FXML private void openEditListWindow(ActionEvent event)
    {
        // open new window for editing the selected todo list's title
    }

    @FXML private void openEditTodoWindow(ActionEvent event)
    {
        // get selected todo value

        // open new window to edit selected todo
    }

    private void openWindow(String resourceFileName, String windowTitle, Todo selectedTodo)
    {
        // open new window using given fxml resource file path

        // initialize required fields for EditTodoListController

        // initialize required fields for EditTodoController

        // display the new window
    }
}
