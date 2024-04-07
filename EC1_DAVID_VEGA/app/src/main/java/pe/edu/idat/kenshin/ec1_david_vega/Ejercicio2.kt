package pe.edu.idat.kenshin.ec1_david_vega

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejercicio2 : AppCompatActivity() {
    lateinit var txtmonto : EditText
    lateinit var btnCalcularPrestamo : Button
    lateinit var txtNumCuotas : TextView
    lateinit var txtIntereses : TextView
    lateinit var txtPagoCuota : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        val button = findViewById<Button>(R.id.btnAM3)
        button.setOnClickListener {
            val intent = Intent(this, Ejercicio3::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.btnRMA1)
        button2.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        txtmonto = findViewById(R.id.txtmonto)
        btnCalcularPrestamo = findViewById(R.id.btnCalcularPrestamo)
        txtNumCuotas = findViewById(R.id.txtNumCuotas)
        txtIntereses = findViewById(R.id.txtIntereses)
        txtPagoCuota = findViewById(R.id.txtPagoCuota)

        btnCalcularPrestamo.setOnClickListener(View.OnClickListener {
            val prest = Integer.parseInt(txtmonto.text.toString())

            if(prest > 5000){
                txtNumCuotas.setText("Cuotas : " + 3 )
                txtIntereses.setText("Intereses : " + 0)
                txtPagoCuota.setText("Pago por Cuotas : " + 0 )
            }else if(prest < 1000){
                txtNumCuotas.setText("Cuotas : " + 1 )
                txtIntereses.setText("Intereses : " + 0)
                txtPagoCuota.setText("Pago por Cuotas : " + 0 )
            }else if(prest >= 2000 && prest>=3000){
                txtNumCuotas.setText("Cuotas : " + 2 )
                txtIntereses.setText("Intereses : " + 0)
                txtPagoCuota.setText("Pago por Cuotas : " + 0 )
            }
        })
    }
}
