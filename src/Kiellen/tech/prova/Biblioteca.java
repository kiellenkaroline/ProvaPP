package Kiellen.tech.prova;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livrosDisponiveis;

    public Biblioteca(String nome){
        this.nome=nome;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livrosDisponiveis.add(livro);
        System.out.println("Livro adicionado à biblioteca: " + livro.getTitulo());
    }

    public void removerLivro(Livro livro){
        if(livrosDisponiveis.remove(livro)){
            System.out.println("Livro removido da bibliooteca: " + livro.getTitulo());
        }else {
            System.out.println("O livro " + livro.getTitulo() + " não foi encontrado na biblioteca");
        }
    }

    public void exibirLivrosDisponiveis(){
        System.out.println("Livros disponiveis na biblioteca " + nome + ":");
        if (livrosDisponiveis.isEmpty()){
            System.out.println("Nenhum livro disponivel;");
        }else{
            for(Livro livro : livrosDisponiveis){
                livro.exibirIinformacoes();
            }
        }
    }

    public void emprestarLivro(Usuario usuario, Livro livro){
        if(livrosDisponiveis.contains(livro)){
            livrosDisponiveis.remove(livro);
            usuario.emprestarLivro(livro);
        }else{
            System.out.println("O livro " + livro.getTitulo() + " não está disponivel na biblioteca");
        }
    }

    public void receberDevolucao(Usuario usuario, Livro livro) {
        usuario.devolverLivro(livro);
        adicionarLivro(livro);
    }
}
