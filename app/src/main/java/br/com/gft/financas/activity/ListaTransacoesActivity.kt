package br.com.gft.financas.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.gft.financas.R
import br.com.gft.financas.adapter.ListaTransacoesAdapter
import br.com.gft.financas.model.Tipo.*
import br.com.gft.financas.model.Transacao
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(Transacao(valor = BigDecimal(30.5), tipo = DESPESA, data = Calendar.getInstance()),
                                Transacao(valor = BigDecimal(100.0), categoria = "Economia", tipo = RECEITA),
                                Transacao(valor = BigDecimal(20.0), categoria = "Comida", tipo = DESPESA))

        //val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transacoes)

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)

        // = findViewById<ListView>(R.id.lista_transacoes_listview)

    }
}
