package com.neppplus.intent_20211102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

//        복귀버튼 눌리면 -> 메인화면으로 이동

        btnReturnToMain.setOnClickListener {

            val myIntent = Intent( this, MainActivity::class.java )
            startActivity(myIntent)

        }

    }
}