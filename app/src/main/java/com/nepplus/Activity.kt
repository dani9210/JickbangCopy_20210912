package com.nepplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20210912.MainActivity

class Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.nepplus.jickbangcopy_20210912.R.layout.activity_)

//        3초 뒤에 -> 화면전화 코드 실행 시키고싶다.
//        코드 실행을 3초 지연시키는 방법?


        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)


    }
}