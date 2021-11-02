package com.neppplus.intent_20211102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOther.setOnClickListener {

//            버튼이 눌리면 > OtherActivity로 이동하자. (화면 전환)

//            Intent로 어디서 출발 / 어디로 도착하는지 정보 설정. => 변수에 저장.
            val myIntent = Intent( this, OtherActivity::class.java )
//            출발/도착 정보를 가지고 이동
            startActivity( myIntent )


        }

    }
}