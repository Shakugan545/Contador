package mx.udg.cuvalles.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btnIncrementar.setOnClickListener(this)
        btndecrementar.setOnClickListener(this)
    }
    /*Estamos utilizando una interfaz para capturar todos los clicks*/
    /*!! para decir que v existe y no es nulo */
    override fun onClick(v: View?) {
        if (v!!.id == R.id.btnIncrementar) {
            contador++
        } else if (v!!.id == R.id.btndecrementar) {
            contador--
        }
        etiquetaMostrar.text = "$contador"
    }
}