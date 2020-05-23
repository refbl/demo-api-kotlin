package br.com.teste.demospringboot.validation

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

private const val NOTA_MIN = 1
private const val NOTA_MAX = 100
class NotaValidator : ConstraintValidator<NotaValida, Int> {
    override fun isValid(value: Int, context: ConstraintValidatorContext?): Boolean {
        return value in NOTA_MIN..NOTA_MAX
    }
}