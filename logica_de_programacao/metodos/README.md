# Metodos
### Este exemplo foi retirado do exercicio : [PrimeiroMetodo](https://github.com/gladsonsimoes/ExerciciosDeExemplo_Java/blob/main/logica_de_programacao/metodos/01_PrimeiroMetodo.java/)
### como criar um metodo ?
#### final da linha se cria um metodo assim :
~~~java
        static void imprimirTraco() {
        String padraoTraco = "------------------------------------------------";
        System.out.println(padraoTraco);
    }
~~~
### pronto eu criei um metodo como faço para invocar ?
### para invocar simplesmente assim:
~~~java
          imprimirTraco();
~~~

tem diferentes métodos:
~~~java

public static void //metodo estatico publico 

static void //metodo estatico 

public void //metodo não estático publico 

void //um metodo não estatico e nem publico
~~~

### Metodo rebendo parametro: 
#### sim ele recebe , [clique pra ver](https://universidadejava.com.br/java/java-metodos-parametro//)

### pra que serve o public ? 
#### public. O modificador de acesso public é o menos restritivo de todos. Ele permite que qualquer outra parte da sua aplicação tenha acesso ao componente marcado como public
----
site para tirar duvidas : https://www.devmedia.com.br/trabalhando-com-metodos-em-java/25917#:~:text=Métodos%20static%20em%20Java&text=Os%20métodos%20static%20tem%20um,exemplos%20de%20declarações%20de%20métodos.
