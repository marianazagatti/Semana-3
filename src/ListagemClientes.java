public class ListagemClientes {
    public static void main(String[] args) {
        String nome1 = "Fulano";
        String nome2 = "Sicrano";
        int dataNascimento1 = 1980;
        int dataNascimento2 = 2000;
        int anoAtual = 2023;
        int idade1;
        int idade2;

        System.out.println(">>>> Listagem de Clientes");
        System.out.println(">>>> Ano atual: " + anoAtual);
        System.out.println("_________________________");

        System.out.println("Nome: " + nome1);
        System.out.println("Data de Nascimento: " + dataNascimento1);
        idade1 = anoAtual - dataNascimento1;
        System.out.println("Idade: " + idade1);

        if(idade1 <= 17){
            System.out.println("Característica Etária: ADOLESCENTE");
        }else if (idade1 >= 18 && idade1 <= 29) {
            System.out.println("Característica Etária: JOVEM");
        }else if (idade1 >= 30 && idade1 <= 59){
            System.out.println("Característica Etária: ADULTO");
        }else{
            System.out.println("Característica Etária: IDOSO");
        }

        System.out.println("_________________________");
        System.out.println("Nome: " + nome2);
        System.out.println("Data de Nascimento: " + dataNascimento2);
        idade2 = anoAtual - dataNascimento2;
        System.out.println("Idade: " + idade2);

        if(idade2 <= 17){
            System.out.println("Característica Etária: ADOLESCENTE");
        }else if (idade2 >= 18 && idade2 <= 29) {
            System.out.println("Característica Etária: JOVEM");
        }else if (idade2 >= 30 && idade2 <= 59){
            System.out.println("Característica Etária: ADULTO");
        }else{
            System.out.println("Característica Etária: IDOSO");
        }

    }
}
