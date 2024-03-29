public class ListagemProdutos {
    public static void main(String[] args) {
        String produto1 = "Livro";
        String produto2 = "Celular";
        double preco1 = 49.95;
        double preco2 = 1470.76;
        String resultado = """
                    >>> Listagem de Produtos
                    ________________________
                    Nome: %s
                    Preço: %.2f
                    ________________________
                    Nome: %s
                    Preço: %.2f
                """.formatted(produto1, preco1, produto2, preco2);
        System.out.println(resultado);
    }
}
