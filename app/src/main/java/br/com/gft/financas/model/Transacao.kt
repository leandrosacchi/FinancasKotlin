package br.com.gft.financas.model

import java.math.BigDecimal
import java.util.*

class Transacao (valor: BigDecimal,
                 categoria: String,
                 data: Calendar) {

    private val valor: BigDecimal = valor
    private val categoria = categoria
    private val data = data

    fun getValor(): BigDecimal{
        return valor
    }

}