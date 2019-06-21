package eteczl.edu.br.borrachariassustentaveis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*

class ActivityCadastro : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val btncadastrar = findViewById<Button>(R.id.btncadastrar) as Button
        btncadastrar.setOnClickListener {
            val toast = Toast.makeText(this@ActivityCadastro,"Botão cadastrar clicado...",Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP,0,0)
            toast.show()

        }

        val btnclear = findViewById<Button>(R.id.btnlimpar) as Button
        btnclear.setOnClickListener {
            name.text.clear()
            cep.text.clear()
            fone.text.clear()
            email.text.clear()
            pass.text.clear()
        }





    }
}
