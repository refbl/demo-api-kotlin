package br.com.teste.demospringboot.model

import br.com.teste.demospringboot.validation.NotaValida
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Nota (@Id
            @GeneratedValue
            @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
            val id: Long = 0L,
            @field:NotaValida
            val nota: Int = 0,
            @field:NotBlank
            val texto: String = ""){

    //constructor() : this(0L, 0, "")

}
