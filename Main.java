import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo conteudo = new Curso("Novo Curso", "testando", 10);

        System.out.println(conteudo);
//        System.out.println(mentoria);
    }
}
