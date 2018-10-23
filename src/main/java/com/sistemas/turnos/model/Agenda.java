package com.sistemas.turnos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_AGENDA")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @JoinColumn(name = "MEDICO_ID")
    @OneToOne(fetch = FetchType.LAZY, targetEntity = Medico.class, cascade=CascadeType.ALL)
    private Medico medico;

    @JoinColumn(name = "EQUIPO_ID")
    @OneToOne(fetch = FetchType.LAZY, targetEntity = Equipo.class, cascade=CascadeType.ALL)
    private Equipo equipo;

    @JoinColumn(name = "ESPECIALIDAD_ID")
    @OneToOne(fetch = FetchType.LAZY, targetEntity = Especialidad.class, cascade=CascadeType.ALL)
    private Especialidad especialidad;

    @Column(name = "DIA")
    private int dia;

    @Column(name = "HORA_DESDE")
    private Date horaDesde;

    @Column(name = "HORA_HASTA")
    private Date horaHasta;

    @Column(name = "DURACION")
    private int duracion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Date getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(Date horaDesde) {
        this.horaDesde = horaDesde;
    }

    public Date getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(Date horaHasta) {
        this.horaHasta = horaHasta;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
