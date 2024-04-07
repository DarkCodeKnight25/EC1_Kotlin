package pe.edu.idat.kenshin.ec1_david_vega

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejercicio4 : AppCompatActivity() {
    lateinit var primerDato : EditText
    lateinit var segundoDato : EditText
    lateinit var btnCalcularNumpar : Button
    lateinit var txtnumPar : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)

        val button = findViewById<Button>(R.id.btnRMA3)
        button.setOnClickListener {
            val intent = Intent(this, Ejercicio3::class.java)
            startActivity(intent)
        }

        primerDato = findViewById(R.id.primerDato)
        segundoDato = findViewById(R.id.segundoDato)
        btnCalcularNumpar = findViewById(R.id.btnCalcularNumpar)
        txtnumPar = findViewById(R.id.txtnumPar)

        btnCalcularNumpar.setOnClickListener(View.OnClickListener{
            val num1 = Integer.parseInt(primerDato.text.toString())
            val num2 = Integer.parseInt(segundoDato.text.toString())
            val num = 0

            for (num in num1..num2) {
                if(num % 2 == 0) {
                    txtnumPar.setText("Numero Par : " + num)
                }
            }

        })
    }
}