package com.example.kotlinintentindependentstudy3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener {

            val inputStr = edtPhoneNum.text.toString()
            val myUri = Uri.parse("tel:${inputStr}")
            val dialIntent = Intent(Intent.ACTION_DIAL , myUri)
            startActivity(dialIntent)

        }

        btnSendTo.setOnClickListener {

            val inputStr = edtPhoneNum.text.toString()
            val myUri = Uri.parse("smsto:${inputStr}")
            val sendToIntent = Intent(Intent.ACTION_SENDTO , myUri)
            sendToIntent.putExtra("sms_body" , "안녕하세요.")
            startActivity(sendToIntent)
        }

        btnView.setOnClickListener {

            val myUri = Uri.parse("http://m.naver.com")
            val viewIntent = Intent(Intent.ACTION_VIEW , myUri)
            startActivity(viewIntent)
        }

        btnViewPlayStore.setOnClickListener {

            val myUri = Uri.parse("market://details?id=com.kakao.talk")
            val myIntent = Intent(Intent.ACTION_VIEW , myUri)
            startActivity(myIntent)
        }
    }
}