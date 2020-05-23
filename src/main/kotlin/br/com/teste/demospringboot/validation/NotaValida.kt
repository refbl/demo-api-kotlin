package br.com.teste.demospringboot.validation

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [NotaValidator::class])
@MustBeDocumented
annotation class NotaValida(
        val message: String = "Por favor, informe uma nota valida.",
        val groups: Array<KClass<Any>> = [],
        val payload: Array<KClass<Payload>> = []
)
