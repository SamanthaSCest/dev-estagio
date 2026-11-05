package br.com.samantha;

import br.com.samantha.model.Candidatura;
import br.com.samantha.model.Empresa;
import br.com.samantha.model.EtapaCandidatura;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(1L, "Levty", "https://www.levty.com/br/trainee");


    Candidatura candidatura = new Candidatura(
        1L,
        empresa,
        "Programadora trainee",
        LocalDate.now()
    );

    System.out.println("Empresa: " + candidatura.getEmpresa().getNome());

    System.out.println("Etapa inicial: " + candidatura.getEtapa());

    candidatura.alterarEtapa(EtapaCandidatura.ENTREVISTA_RH);

    System.out.println("Etapa atualizada " + candidatura.getEtapa());

    }
}