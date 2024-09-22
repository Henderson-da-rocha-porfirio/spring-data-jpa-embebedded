# Component Mapping ( ORM )
#### 1. Nós usamos componente mapping quando nós queremos salvar uma classe que tem um relacionamento com outra classe na mesma tabela do database.
#### 2. Exemplo:
##### a. Temos Funcionario que carrega as informações com todos os seus campos nele e então Funcionario também usa uma classe chamada Endereço com objetos dentro que carregarão a informação endereço na Classe Funcionario que tem um campo chamado endereço dentro dele.
##### b. Mas nós queremos salvar os dados inteiros quando Funcionario for salvo. Queremos ver a informação de Funcionario marcada no nome e também a informação de Endereço.
#### 3. Para isso, marcamos Endereço com @Embeddable do JPA. Com isso, as implementações JPA e também o Hibernate entendem que esta classe Endereço não é uma entidade mas que será embedded ( embutida ) em outra classe e daí nós utilizamos uma segunda anotação:
##### a. @Embedded em Endereço dentro de Funcionario.
##### b. @Embeddable na Classe Endereço.
#### 4. Então o hibernate saberá que isso é um Funcionario e está salvo e que a classe/objeto embedded (embutida) foi salva do mesmo jeito.
