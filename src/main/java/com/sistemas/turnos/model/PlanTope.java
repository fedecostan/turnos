package com.sistemas.turnos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "T_PLAN_TOPE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PlanTope {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODPLAN")
    private String codPlan;

    @Column(name = "TIPOCOD")
    private String tipoCod;

    @Column(name = "CODDESDE")
    private String codDesde;

    @Column(name = "CODHASTA")
    private String codHasta;

    @Column(name = "CANTIDAD")
    private int cantidad;

    @Column(name = "PRESTADOR")
    private String prestador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodPlan() {
        return codPlan;
    }

    public void setCodPlan(String codPlan) {
        this.codPlan = codPlan;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrestador() {
        return prestador;
    }

    public void setPrestador(String prestador) {
        this.prestador = prestador;
    }
}
