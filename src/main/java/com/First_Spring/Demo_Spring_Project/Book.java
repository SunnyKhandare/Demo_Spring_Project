package com.First_Spring.Demo_Spring_Project;

public class Book {


    int id;
    String name;
    String author;

    public Book( int book_id , String book_name , String book_author ){

        super();
        this.id = book_id;
        this.name = book_name;
        this.author = book_author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString(){

        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
