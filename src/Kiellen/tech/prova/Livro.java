package Kiellen.tech.prova;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;


    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public void exibirIinformacoes(){
        System.out.println("Título: " + titulo + ", Autor: " + autor +", Ano: " + ano);
    }

}
