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
import javafx.scene.control.TextField;

public class EditListController implements Initializable
{
    @FXML private TextField listTitle;

    public TodoList selectedTodoList = null;

    @Override public void initialize(URL url, ResourceBundle rb) { }

    public void setupFields(TodoList selectedTodoList)
    {
        // load selected todo list title field value
    }

    @FXML private void editList(ActionEvent event)
    {
        // make sure there is one selected todo list

        // make sure todo list title input is valid

        // set the title of the selected todo list

        // get the path for the selected todo list file

        // save the file with updated todo list title

        // load todo list

        // close the edit todo window
    }
}
