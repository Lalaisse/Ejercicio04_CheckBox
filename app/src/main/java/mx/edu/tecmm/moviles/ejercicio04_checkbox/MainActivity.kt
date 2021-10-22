package mx.edu.tecmm.moviles.ejercicio04_checkbox

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var txt:EditText;
    lateinit var chkCursiva: CheckBox;
    lateinit var chkNegrita: CheckBox;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt= findViewById(R.id.edNombre);
        chkCursiva= findViewById(R.id.chkCursiva);
        chkNegrita= findViewById(R.id.chkNegrita);
        val bandera=false;
    }

    fun clickCheck(v:View){
        txt.typeface= Typeface.DEFAULT; //Reinicia el formato
        Log.e("Checkbox","Se presionó");
        val checkPresionado: CheckBox= v as CheckBox; //Es un casting
        if (/*checkPresionado.id== R.id.chkCursiva && checkPresionado.isChecked*/chkCursiva.isChecked && !chkNegrita.isChecked){
            txt.typeface= Typeface.defaultFromStyle(Typeface.ITALIC);
        }else if (/*checkPresionado.id== R.id.chkNegrita && checkPresionado.isChecked*/!chkCursiva.isChecked && chkNegrita.isChecked){
            txt.typeface= Typeface.defaultFromStyle(Typeface.BOLD);
        }
        if (chkCursiva.isChecked && chkNegrita.isChecked) {
            txt.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC);
        }
    }
}