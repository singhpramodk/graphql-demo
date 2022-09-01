package com.graphqljava.tutorial.controller;

import com.graphqljava.tutorial.entity.Author;
import com.graphqljava.tutorial.entity.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
//    @QueryMapping
//    public Book bookById(@Argument String id) {
//        return Book.getById(id);
//    }


  @QueryMapping
  public Author authorById(@Argument String id) {
    return Author.getById(id);
  }


  @QueryMapping
  public Author authorByName(@Argument String firstName) {
    return Author.getByName(firstName);
  }


  @MutationMapping
  public Author createAuthor(Author author) {
    return Author.add(author);
  }


  @SchemaMapping
  public Book book(Author author) {
    return Book.getByAuthorId(author.getId());
  }


}