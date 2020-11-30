package com.todolist.todo_sqllite.db;

import android.provider.BaseColumns;

public class Task {
    public static final String DB_NAME = "com.todolist.todo_sqllite";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE = "task";
        public static final String COL_TASK_TITLE = "title";
    }
}
