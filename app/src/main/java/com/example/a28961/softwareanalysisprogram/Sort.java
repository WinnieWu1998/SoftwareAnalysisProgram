package com.example.a28961.softwareanalysisprogram;

import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

public class Sort
{
    ArrayList <Book> myBook;
    Sort(ArrayList<Book> books)
    {
        myBook=books;
    }
    void sort(int position)
    {
        switch ( position)
        {
            case 0:         //sort by Title
                Collections.sort(myBook, new Comparator<Book>() {
                    @Override
                    public int compare(Book book1, Book book2) {
                        return Collator.getInstance(Locale.CHINESE).compare(book1.getTitle(),book2.getTitle());
                    }
                });
                break;
            case 1:         //sort by Author
                Collections.sort(myBook, new Comparator<Book>() {
                    @Override
                    public int compare(Book book1, Book book2) {
                        return Collator.getInstance(Locale.CHINESE).compare(book1.getAuthor(),book2.getAuthor());
                    }
                });
                break;
            case 2:         //sort by Publisher
                Collections.sort(myBook, new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return Collator.getInstance(Locale.CHINESE).compare(o1.getPublisher(),o2.getPublisher());
                    }
                });
                break;
            case 3:         //sort by PubDate
                Collections.sort(myBook, new Comparator<Book>() {
                    @Override
                    public int compare(Book  book1,Book book2) {

                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
                        try {
                            Date dt1 = format.parse(book1.getDate());
                            Date dt2 = format.parse(book2.getDate());
                            if (dt1.getTime() < dt2.getTime()) {
                                return 1;
                            } else if (dt1.getTime() > dt2.getTime()) {
                                return -1;
                            } else {
                                return 0;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return 0;

                    }
                });
                break;
                default:
                    break;
        }


    }
}
