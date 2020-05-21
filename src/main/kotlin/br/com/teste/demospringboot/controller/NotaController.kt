package br.com.teste.demospringboot.controller

import br.com.teste.demospringboot.model.Nota
import br.com.teste.demospringboot.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("nps")
class NotaController {

    @Autowired
    lateinit var service: NotaService

    @GetMapping
    fun listar(): List<Nota>{
        return service.listar()
    }

    @PostMapping
    fun adicionar (@RequestBody nota: Nota): Nota{
        return service.adicionar(nota)
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: Long ,@RequestBody nota: Nota): Nota{
        return service.alterar(id, nota)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) {
        service.delete(id)
    }
}