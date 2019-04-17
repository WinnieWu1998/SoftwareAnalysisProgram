package com.example.a28961.softwareanalysisprogram;

import android.content.Intent;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Label
{
    String Name;
    ArrayList<Book> MyBookList = new ArrayList<Book>();

    void DeleteBook(int number)
    {
        if (number < MyBookList.size()) {
            MyBookList.remove(number);
        }
    }
    void AddBook(Book mybook)
    {
        MyBookList.add(mybook);
    }

    void ShowBook()
    {

    }

}





