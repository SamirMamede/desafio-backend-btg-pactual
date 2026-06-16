## Desafio Backend do BTG Pactual 🚀

## Escopo 📋
Processar pedidos e gerar relatório.

## Atividades 🛠️
1. Crie uma aplicação, na tecnologia de sua preferência (JAVA, DOTNET, NODEJS)
2. Modele e implemente uma base de dados (PostgreSQL, MySQL, MongoDB).
3. Crie um micro serviço que consuma dados de uma fila RabbitMQ e grave os dados para conseguir listar as informações:
   - Valor total do pedido 💰
   - Quantidade de Pedidos por Cliente 👤
   - Lista de pedidos realizados por cliente 📦

Exemplo da mensagem que deve ser consumida:

```
   {
       "codigoPedido": 1001,
       "codigoCliente":1,
       "itens": [
           {
               "produto": "lápis",
               "quantidade": 100,
               "preco": 1.10
           },
           {
               "produto": "caderno",
               "quantidade": 10,
               "preco": 1.00
           }
       ]
   }
```


4. Crie uma API REST, em que permita o consultar as seguintes informações:
   - Valor total do pedido 💵
   - Quantidade de Pedidos por Cliente 📊
   - Lista de pedidos realizados por cliente 🗂️
