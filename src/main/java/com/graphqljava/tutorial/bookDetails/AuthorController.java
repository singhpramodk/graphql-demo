package com.graphqljava.tutorial.bookDetails;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
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


  @SchemaMapping
  public Book book(Author author) {
    return Book.getByAuthorId(author.getId());
  }
}