package Kiellen.tech.prova;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Usuario usuario = new Usuario("Kiellen");
        biblioteca.exibirLivrosDisponiveis();
        biblioteca.emprestarLivro(usuario, livro1);
        usuario.exibirLivrosEmprestados();
        biblioteca.exibirLivrosDisponiveis();
        biblioteca.receberDevolucao(usuario, livro1);
        usuario.exibirLivrosEmprestados();
        biblioteca.exibirLivrosDisponiveis();
    }
}