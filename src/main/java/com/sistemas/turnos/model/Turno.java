package com.sistemas.turnos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_TURNO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @JoinColumn(name = "MEDICO_ID")
    @OneToOne(fetch = FetchType.LAZY, targetEntity = Medico.class, cascade=CascadeType.ALL)
    private Medico medico;

    @JoinColumn(name = "PACIENTE_ID")
    @OneToOne(fetch = FetchType.LAZY, targetEntity = Paciente.class, cascade=CascadeType.ALL)
    private Paciente paciente;

    @JoinColumn(name = "EQUIPO_ID")
    @OneToOne(fetch = FetchType.LAZY, targetEntity = Equipo.class, cascade=CascadeType.ALL)
    private Equipo equipo;

    @JoinColumn(name = "ESPECIALIDAD_ID")
    @OneToOne(fetch = FetchType.LAZY, targetEntity = Especialidad.class, cascade=CascadeType.ALL)
    private Especialidad especialidad;

    @JoinColumn(name = "PLAN_ID")
    @OneToOne(fetch = FetchType.LAZY, targetEntity = Plan.class, cascade=CascadeType.ALL)
    private Plan plan;

    @Column(name = "HORA_DESDE")
    private Date horaDesde;

    @Column(name = "HORA_HASTA")
    private Date horaHasta;

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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
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
}
