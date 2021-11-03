package com.neppplus.intent_20211102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_CODE_FOR_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOther.setOnClickListener {

//            버튼이 눌리면 > OtherActivity로 이동하자. (화면 전환)

//            Intent로 어디서 출발 / 어디로 도착하는지 정보 설정. => 변수에 저장.
            val myIntent = Intent(this, OtherActivity::class.java)
//            출발/도착 정보를 가지고 이동
            startActivity(myIntent)


        }

        btnSendMessage.setOnClickListener {

//             입력한 내용을 변수로 저장.
            val inputMessage = edtMessage.text.toString()

//            메시지 화면으로 이동. Intent 활용
            val myIntent = Intent(this, ViewMessageActivity::class.java)

//            필요 데이터를 첨부하는 코드
            myIntent.putExtra("message", inputMessage)

            startActivity(myIntent)

        }

        btnEditNickname.setOnClickListener {

//            닉네임을 변경하기 위한 화면 이동. (Intent 3 예시)

            val myIntent = Intent(this, EditNicknameActivity::class.java)

//            넘어갔다가 (어떤 데이터)를 들고 "돌아올것이다" 명시.
            startActivityForResult(myIntent, REQ_CODE_FOR_NICKNAME)


        }


    }
}