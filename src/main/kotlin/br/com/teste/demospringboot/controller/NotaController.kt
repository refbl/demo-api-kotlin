package br.com.teste.demospringboot.controller

import br.com.teste.demospringboot.model.Nota
import br.com.teste.demospringboot.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("nps")
class NotaController {

    @Autowired
    lateinit var service: NotaService

    @GetMapping
    fun listar(): HttpEntity<List<Nota>> {
        val responseHeaders = HttpHeaders()
        //responseHeaders.set("notas", service.listar())
        responseHeaders.contentType = MediaType.APPLICATION_JSON
        return HttpEntity(service.listar(), responseHeaders)
    }

    @PostMapping
    fun adicionar (@Valid @RequestBody nota: Nota): Nota{
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