package br.com.samantha.model;

import java.time.LocalDateTime;
import java.time.LocalDate;


public class Candidatura {
   private Long id;
   private Empresa empresa;
   private String cargo;
   private LocalDate dataCandidatura;
   private EtapaCandidatura etapa;
   private LocalDateTime dataEntrevista;
   private String observacoes;

    public Candidatura (Long id, Empresa empresa, String cargo, LocalDate dataCandidatura) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.dataCandidatura = dataCandidatura;
        this.etapa = EtapaCandidatura.INSCRITA;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void  alterarEtapa(EtapaCandidatura novaEtapa) {
        if (novaEtapa == null) {
            throw new IllegalArgumentException("A etapa não pode ser nula.");
        }
        this.etapa = novaEtapa;
    }

    public void setDataEntrevista(LocalDateTime dataEntrevista) {
        this.dataEntrevista = dataEntrevista;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public EtapaCandidatura getEtapa() {
        return etapa;
    }
}

