package br.com.gft.financas.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formataParaBrasileiro(): String {
    val padraoBrasileiro = "dd/MM/yyyy"
    val sdf = SimpleDateFormat(padraoBrasileiro)
    return  sdf.format(this.time)
}