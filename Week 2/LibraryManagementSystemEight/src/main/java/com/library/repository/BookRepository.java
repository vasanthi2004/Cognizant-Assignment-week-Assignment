package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void displayRepositoryInfo() {
        System.out.println("BookRepository is working");
    }
}