package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        getTitulo() = titulo;
        getDescricao(descricao);
        super();
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + 50;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "título=" + getTitulo() + '\'' +
                "descrição=" + getDescricao() +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}
