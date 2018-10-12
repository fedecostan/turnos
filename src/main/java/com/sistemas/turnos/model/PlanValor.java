package com.sistemas.turnos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "T_PLAN_VALOR")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PlanValor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PRESTADOR")
    private String prestador;

    @Column(name = "CODPLAN")
    private String codPlan;

    @Column(name = "ALTERNATIVA")
    private String alternativa;

    @Column(name = "FECHADESDE")
    private String fechaDesde;

    @Column(name = "FECHAHASTA")
    private String fechaHasta;

    @Column(name = "IMPORTE")
    private Double importe;

    @Column(name = "TIPOCOD")
    private String tipoCod;

    @Column(name = "CODDESDE")
    private String codDesde;

    @Column(name = "CODHASTA")
    private String codHasta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrestador() {
        return prestador;
    }

    public void setPrestador(String prestador) {
        this.prestador = prestador;
    }

    public String getCodPlan() {
        return codPlan;
    }

    public void setCodPlan(String codPlan) {
        this.codPlan = codPlan;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getTipoCod() {
        return tipoCod;
    }

    public void setTipoCod(String tipoCod) {
        this.tipoCod = tipoCod;
    }

    public String getCodDesde() {
        return codDesde;
    }

    public void setCodDesde(String codDesde) {
        this.codDesde = codDesde;
    }

    public String getCodHasta() {
        return codHasta;
    }

    public void setCodHasta(String codHasta) {
        this.codHasta = codHasta;
    }
}
