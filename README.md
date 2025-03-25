Este projeto demonstra a implementação do padrão de projeto Abstract Factory em um sistema de locadora de veículos, permitindo a criação de famílias de veículos (carros e caminhões) com diferentes tipos de motorização (combustão e elétrico).


📌 Sobre o Abstract Factory
O Abstract Factory é um padrão criacional que fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

No contexto deste projeto:

Temos duas hierarquias de produtos: Carro e Caminhao

Cada produto tem duas variações: Combustao e Eletrico

As fábricas abstratas (LocadoraFactory) definem métodos para criar todos os produtos



🚀 Como Funciona
Interfaces de Produtos:

Carro e Caminhao definem a interface comum para todos os tipos de veículos

Produtos Concretos:

CarroCombustao, CarroEletrico, CaminhaoCombustao, CaminhaoEletrico são implementações concretas

Fábrica Abstrata:

LocadoraFactory declara métodos de criação para todos os tipos de produtos

Fábricas Concretas:

FactoryCombustao cria produtos da família combustão

FactoryEletrico cria produtos da família elétrico

Cliente:

SistemaLocadora trabalha com as fábricas e produtos apenas através de interfaces abstratas



✅ Benefícios
Isola classes concretas

Facilita a troca de famílias de produtos

Promove consistência entre produtos

Implementa o Princípio de Responsabilidade Única (SRP)

Implementa o Princípio Aberto/Fechado (OCP)



🧪 Testes
Os testes demonstram como o sistema cria diferentes famílias de veículos e verifica se os métodos retornam as strings esperadas para cada tipo de veículo.



