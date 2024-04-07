package pe.edu.idat.kenshin.ec1_david_vega

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var precio : EditText
    lateinit var cantidad : EditText
    lateinit var btnCalcular : Button
    lateinit var txtresultado : TextView
    lateinit var txtdescuento : TextView
    lateinit var txtTotalGeneral : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnAM2)
        button.setOnClickListener {
            val intent = Intent(this,Ejercicio2::class.java)
            startActivity(intent)
        }

        precio = findViewById(R.id.precio)
        cantidad = findViewById(R.id.cantidad)
        btnCalcular = findViewById(R.id.btnCalcular)
        txtresultado = findViewById(R.id.txtresultado)
        txtdescuento = findViewById(R.id.txtdescuento)
        txtTotalGeneral = findViewById(R.id.txtTotalGeneral)

        btnCalcular.setOnClickListener(View.OnClickListener {
            val p = Integer.parseInt(precio.text.toString())
            val c = Integer.parseInt(cantidad.text.toString())
            val total = p * c
            var descuento = 0.0

            if (total > 200){
                descuento = total * 0.20
            }
            val precioFinal = total - descuento

            txtresultado.setText("Total : $total")
            txtdescuento.setText("Descuento : $descuento")
            txtTotalGeneral.setText("Total a pagar : $precioFinal")
        })
    }
}