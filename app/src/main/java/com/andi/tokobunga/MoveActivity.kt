package com.andi.intentapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_detail_florist1: Button
    private lateinit var btn_detail_florist2: Button
    private lateinit var btn_detail_florist3: Button
    private lateinit var btn_detail_florist4: Button
    private lateinit var btn_detail_florist5: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        btn_detail_florist1 = findViewById(R.id.btn_detail_florist1)
        btn_detail_florist1.setOnClickListener(this)

        btn_detail_florist2 = findViewById(R.id.btn_detail_florist2)
        btn_detail_florist2.setOnClickListener(this)

        btn_detail_florist3 = findViewById(R.id.btn_detail_florist3)
        btn_detail_florist3.setOnClickListener(this)

        btn_detail_florist4 = findViewById(R.id.btn_detail_florist4)
        btn_detail_florist4.setOnClickListener(this)

        btn_detail_florist5 = findViewById(R.id.btn_detail_florist5)
        btn_detail_florist5.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when (v.id){
                R.id.btn_detail_florist1 -> run {
                    val intent = Intent(this, MoveWithDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama", "Paket Buket Bunga 1")
                    bundle.putString("Jenis", "Harga Rp. 50.000")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }

                R.id.btn_detail_florist2 -> run {
                    val intent = Intent(this, MoveWithDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama", "Paket Buket Bunga 2")
                    bundle.putString("Jenis", "Harga Rp. 100.000")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }

                R.id.btn_detail_florist3 -> run {
                    val intent = Intent(this, MoveWithDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama", "Paket Buket Bunga 3")
                    bundle.putString("Jenis", "Harga Rp. 150.000")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }

                R.id.btn_detail_florist4 -> run {
                    val intent = Intent(this, MoveWithDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama", "Paket Buket Bunga 4")
                    bundle.putString("Jenis", "Harga Rp. 200.000")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }

                R.id.btn_detail_florist5 -> run {
                    val intent = Intent(this, MoveWithDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama", "Paket Buket Bunga 5")
                    bundle.putString("Jenis", "Harga Rp. 250.000")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }
    }
}