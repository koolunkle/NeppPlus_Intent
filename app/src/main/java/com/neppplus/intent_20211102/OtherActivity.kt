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

//             새 Main화면을 추가해주는 동작. (복귀가 아님)

//            val myIntent = Intent( this, MainActivity::class.java )
//            startActivity(myIntent)

//            이 화면을 종료처리. => 밑에 있는 메인화면이 나타남.
            finish()

        }

    }
}