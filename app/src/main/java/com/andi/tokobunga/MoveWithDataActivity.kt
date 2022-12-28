package com.andi.intentapps

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvDataReceived: TextView
    private lateinit var btnDialNumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        tvDataReceived = findViewById(R.id.tv_data_received)
        DataReceived()

        btnDialNumber = findViewById(R.id.btn_dial_number)
        btnDialNumber.setOnClickListener(this)
    }

    private fun DataReceived(){
        val bundle = intent.extras
        val nama = bundle?.getString("Nama")
        val alamat = bundle?.getString("Jenis")

        tvDataReceived.text = nama + " " + alamat
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){

                R.id.btn_dial_number -> run {
                    var dialNumber = "085649939797"
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + dialNumber))
                    startActivity(intent)
                }
            }
        }
    }
}