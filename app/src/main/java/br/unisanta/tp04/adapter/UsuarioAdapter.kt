package br.unisanta.tp04.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.tp04.R
import br.unisanta.tp04.model.Usuario

class UsuarioAdapter(private val usuarios:List<Usuario>):
    RecyclerView.Adapter<UsuarioAdapter.ViewHolder>()
{
    class ViewHolder(itemView: View):
            RecyclerView.ViewHolder(itemView){
                val nomeUsuario =itemView.findViewById<TextView>(R.id.txv_nome_usuario)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_usuario, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return usuarios.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val usuario = usuarios[position]
        holder.nomeUsuario.text = usuario.nome
    }

}