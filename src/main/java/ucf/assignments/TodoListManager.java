/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 James Karlinski
 */

package ucf.assignments;

import javafx.collections.ObservableList;

public class TodoListManager
{
    private static final String TODO_LIST_STORAGE_PATH = "TodoLists";

    public ObservableList<TodoList> loadAllTodoListsFromStorage()
    {
        // initialize an array list to store todo lists that were loaded from files

        // make sure there is a directory to store todo lists, create if doesn't exist

        // iterate all files in root todo list storage directory

        // return the data as observable list because TableView needs it
        return null;
    }

    private TodoList retrieveLists(String filename)
    {

        // get file path and initialize file object

        // read from todo list file

        // initialize a new todo object and set values retrieved from file

        // close the reader

        // return the todo list object
        return null;
    }

    public String getTodoListFilePath(String fileName)
    {
        // combine the root directory and file path
        return "";
    }
}