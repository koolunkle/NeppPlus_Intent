package com.neppplus.intent_20211102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        btnOk.setOnClickListener {

//            1. 입력된 닉네임? 변수에 저장
            val inputNickname = edtNickname.text.toString()

//            2. 닉네임을 들고 가야함. => (결과를) 담아줘야함. => Intent 추가 활용
            val resultIntent = Intent() // 왕복이고, 데이터를 담기 위한 목적만 있음. 출발/도착지 명시 X

//            실제 데이터 첨부. putExtra
            resultIntent.putExtra("nick", inputNickname)

//            최종 결과 ( 확인누름, 들고 돌아갈 데이터) 지정
            setResult(RESULT_OK, resultIntent)

//            실제 이전화면 복귀
            finish()

        }

    }
}