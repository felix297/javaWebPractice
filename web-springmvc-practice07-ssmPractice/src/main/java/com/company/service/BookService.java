package com.company.service;

import java.util.ArrayList;
import com.company.pojo.Book;
import com.company.dao.BookMapper;

public interface BookService {
    public ArrayList<Book> selectAll ();
}