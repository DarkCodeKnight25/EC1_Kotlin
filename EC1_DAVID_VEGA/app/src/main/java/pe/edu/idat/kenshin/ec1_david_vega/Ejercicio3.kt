package pe.edu.idat.kenshin.ec1_david_vega

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejercicio3 : AppCompatActivity() {
    lateinit var edad : EditText
    lateinit var txtdetalleEdad : TextView
    lateinit var btnCalcularEdad : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        val button = findViewById<Button>(R.id.btnMA4)
        button.setOnClickListener {
            val intent = Intent(this, Ejercicio4::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.btnRMA2)
        button2.setOnClickListener {
            val intent = Intent(this, Ejercicio2::class.java)
            startActivity(intent)
        }

        edad = findViewById<EditText>(R.id.edad)
        txtdetalleEdad = findViewById<TextView>(R.id.txtdetalleEdad)
        btnCalcularEdad = findViewById(R.id.btnCalcularEdad)

        btnCalcularEdad.setOnClickListener(View.OnClickListener {
            val e = Integer.parseInt(edad.text.toString())

            if (e>18){
                txtdetalleEdad.setText("Debe sacar su DNI azul")
            }else if(e<18){
                txtdetalleEdad.setText("No es el momento de sacar su DNI azul")
            }
        })
    }
}