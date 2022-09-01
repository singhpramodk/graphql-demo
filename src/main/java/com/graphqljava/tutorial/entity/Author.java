package com.graphqljava.tutorial.entity;

import java.util.Arrays;
import java.util.List;

public class Author {

  private String id;
  private String firstName;
  private String lastName;

  public Author(String id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  private static List<Author> authors = Arrays.asList(
      new Author("author-1", "Joanne", "Rowling"),
      new Author("author-2", "Herman", "Melville"),
      new Author("author-3", "Anne", "Rice")
  );

  public static Author getById(String id) {
    return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
  }

  public static Author getByName(String firstName) {
    return authors.stream().filter(author -> author.getFirstName().contains(firstName)).findFirst()
        .orElse(null);
  }

  public static Author add(Author author) {
    authors.add(new Author(author.id, author.firstName, author.lastName));
    return author;
  }


  public String getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }
}