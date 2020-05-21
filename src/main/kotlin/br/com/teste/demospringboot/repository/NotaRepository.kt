package br.com.teste.demospringboot.repository

import br.com.teste.demospringboot.model.Nota
import org.springframework.data.repository.CrudRepository

interface NotaRepository : CrudRepository<Nota, Long> {
}