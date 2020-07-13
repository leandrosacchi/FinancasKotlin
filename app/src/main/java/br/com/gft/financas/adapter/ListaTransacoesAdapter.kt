package br.com.gft.financas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.gft.financas.R
import br.com.gft.financas.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*
import java.text.SimpleDateFormat

class ListaTransacoesAdapter(
    transacoes: List<Transacao>,
    context: Context) :   BaseAdapter() {
    
    private val transacoes = transacoes
    private val context = context


    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        val viewCriada: View = LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)
        val transacao = transacoes[posicao]

        viewCriada.transacao_valor.text = transacao.valor.toString()
        viewCriada.transacao_categoria.text = transacao.categoria

        val sdf = SimpleDateFormat("dd/MM/yyyy")
        val dataFormatada = sdf.format(transacao.data.time)
        viewCriada.transacao_data.text = dataFormatada

        return viewCriada
    }

    override fun getItem(posicao: Int): Transacao {
        return transacoes[posicao]
    }

    override fun getItemId(posicao: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transacoes.size
    }

}