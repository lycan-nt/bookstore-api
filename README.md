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
    - Requisition Type: GET Route: /categorias/ID (Search a category by id)
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
    
  - Resource Books
    - Requisition Type: GET Route: livros/ID (Search a category by id)
    - Requisition Type: GET Route: /livros?categoria=ID (Search all boocks for a category)
    - Requisition Type: POST Route: /livros?categoria=ID (Register a new boock for a category: receive a json with the title, author name and text) <br>
        { <br>
            "titulo": "", <br>
            "nomeAutor": "", <br>
            "Texto": "" <br>
        } <br>
        
    - Requisition Type: PUT Route: /livros/ID (change a boock: receive a json with the title, author name and text) <br>
        { <br>
            "titulo": "", <br>
            "nomeAutor": "", <br>
            "Texto": "" <br>
        } <br>
        
    - Requisition Type: DELETE Route: /livros/ID (Delete a boock by id)
    
## Author
    Felipe D. Santos
    
## License
    MIT
