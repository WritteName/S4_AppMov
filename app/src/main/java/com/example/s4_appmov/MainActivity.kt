package com.example.s4_appmov

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var txtQuest: TextView
    lateinit var Quest: TextView
    lateinit var Alt01: Button
    lateinit var Alt02: Button
    lateinit var Alt03: Button
    lateinit var Alt04: Button
    lateinit var BtnRes: Button
    lateinit var txtPoints: TextView

    var Points = 0.0
    val NoQuest = cuestionario.Preguntas.size
    var CurrentNoQuest = 0
    var SeleccAltv = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtQuest = findViewById<TextView>(R.id.txtNoQuestion)
        Quest = findViewById<TextView>(R.id.txtQuestion)
        Alt01 = findViewById<Button>(R.id.btnAnswer01)
        Alt02 = findViewById<Button>(R.id.btnAnswer02)
        Alt03 = findViewById<Button>(R.id.btnAnswer03)
        Alt04 = findViewById<Button>(R.id.btnAnswer04)
        BtnRes = findViewById<Button>(R.id.btnRespond)
        txtPoints = findViewById<TextView>(R.id.txtPoints)

        Alt01.setOnClickListener(this)
        Alt02.setOnClickListener(this)
        Alt03.setOnClickListener(this)
        Alt04.setOnClickListener(this)
        BtnRes.setOnClickListener(this)

        txtQuest.text = "PREGUNTA No.${CurrentNoQuest+1}"
        cargarPregunta()
    }

    override fun onClick(view: View?) {
        Alt01.setBackgroundColor(Color.rgb(109, 124, 177))
        Alt02.setBackgroundColor(Color.rgb(109, 124, 177))
        Alt03.setBackgroundColor(Color.rgb(109, 124, 177))
        Alt04.setBackgroundColor(Color.rgb(109, 124, 177))

        val Selected = view as Button

        if (Selected.id == R.id.btnRespond) {
            if (SeleccAltv == cuestionario.Respuestas[CurrentNoQuest]) {
                Points++
            }
            CurrentNoQuest++
            cargarPregunta()
        } else {
            SeleccAltv = Selected.text.toString()
            Selected.setBackgroundColor(Color.rgb(103, 80, 164))
        }
    }

    private fun cargarPregunta() {
        if (CurrentNoQuest == NoQuest) {
            resultados()
            return
        }

        txtQuest.text = "PREGUNTA No.${CurrentNoQuest+1}"
        txtPoints.text = "Puntos:$Points ptos"

        Quest.text = cuestionario.Preguntas[CurrentNoQuest]
        Alt01.text = cuestionario.Alternativas[CurrentNoQuest][0]
        Alt02.text = cuestionario.Alternativas[CurrentNoQuest][1]
        Alt03.text = cuestionario.Alternativas[CurrentNoQuest][2]
        Alt04.text = cuestionario.Alternativas[CurrentNoQuest][3]
    }
    private fun resultados(){
        val results = if (Points > NoQuest * 0.6) "Passed" else "Failed"

        AlertDialog.Builder(this)
            .setTitle(results)
            .setMessage("Score is $Points out of $NoQuest")
            .setPositiveButton("Restart") { _, _ ->
                reiniciar()
            }
            .setCancelable(false)
            .show()
    }

    private fun reiniciar(){
        Points = 0.0
        CurrentNoQuest = 0
        cargarPregunta()
    }
}
