public class Petshop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Bidu";
        cachorro.idade = 1;
        cachorro.raca = "Boxer";
        cachorro.sexo = 'M';

        System.out.println("\n===============================");
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);

        cachorro = new Cachorro();

        cachorro.nome = "Kadu";
        cachorro.idade = 2;
        cachorro.raca = "Rask-Siberiano";
        cachorro.sexo = 'M';

        System.out.println("\n==============================");
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);
        
    }
}
