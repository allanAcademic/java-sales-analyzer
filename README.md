# java-sales-analyzer
Analisador de vendas em Java com leitura de CSV, agrupamento por categoria e geração de relatório. Projeto de estudo com foco em arquitetura de pacotes, estruturas de dados e tratamento de exceções.
 
# Java Sales Analyzer
 
## Sobre o projeto
Aplicação Java que lê um arquivo CSV de vendas, agrupa os dados por categoria usando HashMap e gera um relatório de faturamento no console. O projeto foi desenvolvido para demonstrar organização em pacotes, uso de coleções, tratamento de exceções customizadas e boas práticas de separação de responsabilidades.
 
## Tecnologias
- Java 17+
- java.io (BufferedReader, FileReader)
- java.util (ArrayList, HashMap)
## Estrutura do projeto
```
src/
└── main/java/salesanalyses/
    ├── Principal.java          # Ponto de entrada da aplicação
    ├── analisador/
    │   └── AnalisadorVendas.java   # Agrupamento por categoria com HashMap
    ├── excecao/
    │   └── DadosInvalidosException.java  # Exceção customizada para dados inválidos
    ├── leitor/
    │   └── LeitorVendas.java       # Leitura e parsing do CSV
    ├── modelo/
    │   └── Venda.java              # Classe modelo com encapsulamento
    └── relatorio/
        └── RelatorioVendas.java    # Geração e exibição do relatório
```
 
## Como executar
1. Clone o repositório
2. Coloque o arquivo `vendas.csv` na raiz do projeto (um exemplo está incluído)
3. Execute `Principal.java`
4. Informe o nome do arquivo quando solicitado (sem a extensão `.csv`)
## Exemplo de saída
```
Informe o nome do arquivo que deseja analisar:
vendas
 
Categoria: Eletrônicos | Total: R$ 8290.0
Categoria: Móveis      | Total: R$ 3180.0
Categoria: Educação    | Total: R$ 446.0
Categoria: Livros      | Total: R$ 369.0
Categoria: Outros      | Total: R$ 75.0
 
Faturamento Total: R$ 12360.0
```
 
## O que aprendi
- Leitura de arquivos com `BufferedReader` e try-with-resources
- Agrupamento de dados com `HashMap` e o método `Map.merge()`
- Criação de exceções customizadas (`DadosInvalidosException`)
- Organização de projeto em pacotes por responsabilidade
- Separação entre leitura, análise e apresentação de dados
## Status
Concluído — melhorias planejadas: ranking de top categorias e integração com banco de dados
 
## Autor
Allan Chrystal - GitHub: @allanAcademic
