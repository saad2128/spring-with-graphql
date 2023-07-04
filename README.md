# spring-with-graphql
## To enable GraphQL Playground

1- GraphQL Playground for Chrome
2- use this url http://localhost:8080/graphql
3- Following query for GraphQL Playground

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
