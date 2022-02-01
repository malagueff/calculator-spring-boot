# calculator-spring-boot
Calculadora con maven y spring boot

## Requisitos necesarios
Se necesita tener instalado en la maquina donde se vaya a ejecutar:
1. Maven
2. Java 11

## Como ejecutar
Abrir una consola y ejecutar:

```
git clone https://github.com/malagueff/calculator-spring-boot.git
cd calculator-spring-boot
mvn clean install
java -jar target/calculator-spring-boot-0.0.1-SNAPSHOT.jar
```

Ejemplo petición suma
`http://localhost:8080/api/calculate?num1=1&num2=2&operation=ADD`

Ejemplo petición resta
`http://localhost:8080/api/calculate?num1=1&num2=2&operation=SUBTRACT`