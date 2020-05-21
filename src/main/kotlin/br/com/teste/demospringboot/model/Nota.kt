package br.com.teste.demospringboot.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Nota (@Id
           @GeneratedValue
           @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
           val id: Long = 0L,
            val nota: Number = 0,
            val texto: String = "")
