**Teste da aplicação**

http://localhost:8080/graphiql

**Exemplo de consulta**
```graphql
query {
    authors{
      name
      books{
        title
      }
    }
    allBooks{
      title
    }
  }
```
![](src/main/resources/img/info.png)
