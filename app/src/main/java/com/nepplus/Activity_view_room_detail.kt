package com.nepplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20210912.datas.RoomData

class Activity_view_room_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.nepplus.jickbangcopy_20210912.R.layout.activity_view_room_detail)

        val room = intent.getSerializableExtra("roomData") as RoomData





    }
}