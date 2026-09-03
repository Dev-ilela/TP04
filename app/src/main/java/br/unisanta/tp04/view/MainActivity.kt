package br.unisanta.tp04.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.unisanta.tp04.R
import br.unisanta.tp04.dao.UsuarioDao
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }

        val edtNomeUsuario = findViewById<EditText>(R.id.edt_nome_usuario)
        val btnSalvar = findViewById<Button>(R.id.btn_salvar)
        val fabAvanca = findViewById<FloatingActionButton>(R.id.fab_avanca)

        btnSalvar.setOnClickListener{
            val nomeUsuario = edtNomeUsuario.text.toString()
            val retorno = UsuarioDao.salvar(nomeUsuario)
            edtNomeUsuario.text.clear()
            Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show()
        }

        fabAvanca.setOnClickListener{
            var intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }

    }
}