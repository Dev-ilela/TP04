package br.unisanta.tp04.dao

import br.unisanta.tp04.model.Usuario

class UsuarioDao {
    companion object{
        private val usuarios = mutableListOf<Usuario>()

        fun salvar(nome: String):String{
            val usuario = Usuario(nome)
            usuarios.add(usuario)
            return "Usuário Salvo"
        }

        fun obter():List<Usuario>{
            return usuarios
        }
    }


}