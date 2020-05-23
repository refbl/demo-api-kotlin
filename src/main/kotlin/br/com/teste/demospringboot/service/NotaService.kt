package br.com.teste.demospringboot.service

import br.com.teste.demospringboot.model.Nota
import br.com.teste.demospringboot.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*

@Service
class NotaService {

    @Autowired
    lateinit var repository: NotaRepository


    fun listar(): List<Nota>{
        return repository.findAll().toList()
    }

    fun adicionar (nota: Nota): Nota{
        val retNps = repository.save(nota)
        this.enviarFila(nota)

        return retNps
    }

    private fun enviarFila(nota: Nota) {
        println("Enviando para Fila - ${nota.id}")

    }

    fun alterar(id: Long, nota: Nota): Nota{
        if (repository.existsById(id)){

            val safeNps = Nota(id, nota.nota, nota.texto)

            return repository.save(safeNps)
        }

        return Nota()
    }

    fun delete(@PathVariable id: Long) {
        if (repository.existsById(id)) {
            repository.deleteById(id)
        }
    }





}

