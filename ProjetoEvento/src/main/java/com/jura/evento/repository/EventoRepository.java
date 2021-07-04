package com.jura.evento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jura.evento.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>  {

}
