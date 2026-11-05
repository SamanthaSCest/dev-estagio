package br.com.samantha.model;
public class Empresa {
    
    private Long id;
    private String nome;
    private String site;

    public Empresa(Long id, String nome, String site) {
        this.id = id;
        this.nome = nome;
        this.site = site;
    }

    public Long getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getSite() {
        return site;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
