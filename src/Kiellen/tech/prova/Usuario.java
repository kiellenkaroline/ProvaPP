package Kiellen.tech.prova;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome){
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
    }

    public void devolverLivro(Livro livro){
        if(livrosEmprestados.remove(livro)){
            System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não foi encontrado na biblioteca. ");
        }
    }

    public void exibirLivrosEmprestados(){
        System.out.println("Livros emprestados por " + nome + ":");
        if(livrosEmprestados.isEmpty()){
            System.out.println("Nenhum livro emprestado.");
        }else{
            for(Livro livro: livrosEmprestados){
                livro.exibirIinformacoes();
            }
        }
    }
}
