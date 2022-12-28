package com.andi.intentapps

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnMoveActivity: Button
    private lateinit var btnDialNumber: Button
    private lateinit var btnResultFromActivity: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveActivity = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        btnMoveActivity = findViewById(R.id.btn_move_activity_data)
        btnMoveActivity.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.btn_move_activity -> run {
                    val intent = Intent (this, MoveActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_move_activity_data -> run {
                    val intent = Intent(this, MoveWithDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama", "Paramita Florist")
                    bundle.putString("Jenis", "Toko Bunga")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }


            }
        }
    }

    private fun WarnaReceived(){
        val bundle = intent.extras
        val warna = bundle?.getString("Warna")
        tvResult.text = warna
    }
}