# bookstore-api
    A CRUD API for books and categories
<img src='https://github.com/lycan-nt/bookstore-api/blob/main/book-api.png'>

  ## Built with
- Java 8
- Gradle Project
- Jar
- Spring Web
- Spring Data JPA
- Data Base H2

## Instructions
    To make use of the features implemented in this API use the 
    
### API resources
  - URL Base: https://book-store-aplication.herokuapp.com/
  - Resource Categories
    - Requisition Type: GET Route: /ID (Search a category by id)
    - Requisition Type: GET Route: /categorias (Search all categorys)
    - Requisition Type: POST Route: /categorias (Register a new category: receive a json with the name and description) <br>
        { <br>
            "nome": "" <br>
            "descricao": "" <br>
        } <br>
        
    - Requisition Type: PUT Route: /categorias/ID (change a category: receive a json with the name and description) <br>
        { <br>
            "nome": "" <br>
            "descricao": "" <br>
        } <br>
        
    - Requisition Type: DELETE Route: /categorias/ID (Delete a category by id)
    

