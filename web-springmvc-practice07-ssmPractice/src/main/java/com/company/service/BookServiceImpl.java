package com.company.service;

import com.company.dao.BookMapper;
import com.company.pojo.Book;
import java.util.ArrayList;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class BookServiceImpl implements BookService {
    BookMapper bookMapper;

    public void setBookMapper (BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public ArrayList<Book> selectAll () {
        return bookMapper.selectAll();
    }
}