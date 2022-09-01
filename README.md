# Book details example 


This is the source code for the "Getting started with GraphQL Java and Spring Boot" which 
is available here: https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/ 


URL:
http://localhost:8080/graphiql?path=/graphql

Use below query:
```
Book: 
{
bookById(id: "book-1") {
id
name
pageCount
author {
id
firstName
lastName
}
}
}

Author:
{
authorById(id: "author-1") {

id
firstName
lastName
}
}


```

```
Postman End Point:
http://localhost:8080/graphql

```
