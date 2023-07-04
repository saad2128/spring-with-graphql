# spring-with-graphql
## To enable GraphQL Playground

- GraphQL Playground for Chrome
- use this url http://localhost:8080/graphql
- Following query for GraphQL Playground

```bash
query{
  orders{
    id
    customer{
      id
      firstName
      lastName
      email
    }
    salesperson{
      id
      firstName
      lastName
      email
    }
    orderLines{
      product{
        name
        variety
        size
        price
      }
      quantity
    }
  }
}
```
