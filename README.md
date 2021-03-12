Injeção de Dependência com Spring - IoC Container

1º: Injeção de Dependência
2º: IoC container
3º: Beans com @Component
4º: Injetando depêndencia (beans Spring)
5º: @Configuration e @Bean para definir beans
6º: Pontos de injeção com @Autowired
7º: Dependência opcional com @Autowired
8º: Ambiguidade e injeção de lista de @Beans
9º: Desambiguação de @Beans com @Primary, @Qualifier e annotation customizada


Bean: Instanciar -> configurar -> injetar
Bean (dependency ou dependencia): são objetos(Classes) gerenciados pelo container do Spring

Spring tem o container de IoC que implementa a injeção de dependencia.

Spring no bootstrap da aplicação escaneia (Spring Component Scanning) as classes do projeto e ao encontrar o @compnent (componentes Spring, são beans) inicia o gerenciamento, 
instancia e coloca dentro do container pq sabe que pode ser usado a qualquer momento.

A annotation @SpringBootApplication na classe principal que é responsavel com escanear as classes e identificar os beans que serão instanciados e adicionados ao container do Spring. 
A meta annotation @SpringBootApplication usa a annotation @ComponentScan.
