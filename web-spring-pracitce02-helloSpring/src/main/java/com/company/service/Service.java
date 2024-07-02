package com.company.service;

import com.company.dao.Database;

public class Service {
    Database database;

    public void setDatabase (Database database) {
        this.database = database;
    }

    public void printMsg () {
        database.printMsg();
    }
}
