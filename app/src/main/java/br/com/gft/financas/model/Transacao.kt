package br.com.gft.financas.model

import java.math.BigDecimal
import java.util.*

class Transacao (val valor: BigDecimal,
                 val categoria: String = "Indefinido",
                 val tipo: Tipo,
                 val data: Calendar = Calendar.getInstance())