package com.cubidevs.figurasgeometricas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SelAreaPerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sel_area_per)
    }

    fun onButtonClicked(view: View) {
        var figurarecibida = intent.extras
        var data = figurarecibida.getInt("figura")
        if (view is Button) {
            if (view.getId()==R.id.bnArea){
                when (data){
                    0 -> {

                    }
                    1 -> {

                    }
                    2 -> {

                    }
                    3 -> {

                    }
                    4 -> {

                    }
                    5 -> {

                    }
                    6 -> {

                    }
                }
            }
            if (view.getId()==R.id.bnPerimetro) {
                when (data) {
                    0 -> {

                    }
                    1 -> {

                    }
                    2 -> {

                    }
                    3 -> {

                    }
                    4 -> {

                    }
                    5 -> {
                        var intent = Intent(this, PerPentaActivity::class.java)
                        startActivity(intent)
                    }
                    6 -> {

                    }
                }
            }
        }
    }
}
