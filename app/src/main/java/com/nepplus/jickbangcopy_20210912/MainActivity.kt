package com.nepplus.jickbangcopy_20210912

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20210912.adapter.RoomAdapter
import com.nepplus.jickbangcopy_20210912.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdepter : RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(8000,"서울시 동대문구",5,"1번째 방입니다") )
        mRoomList.add( RoomData(25000,"서울시 서대문구",8,"2번째 방입니다"))
        mRoomList.add( RoomData(5000,"서울시 서대문구",4,"3번째 방입니다"))
        mRoomList.add( RoomData(15000,"서울시 중랑구",0,"4번째 방입니다"))
        mRoomList.add( RoomData(85000,"서울시 강서구",-1,"5번째 방입니다"))
        mRoomList.add( RoomData(35000,"서울시 성북구",8,"6번째 방입니다"))
        mRoomList.add( RoomData(97000,"서울시 은평구",8,"7번째 방입니다"))
        mRoomList.add( RoomData(21000,"서울시 강남구",8,"8번째 방입니다"))
        mRoomList.add( RoomData(23000,"서울시 서초구",8,"9번째 방입니다"))
        mRoomList.add( RoomData(28000,"서울시 송파구",8,"10번째 방입니다"))

        mRoomAdepter = RoomAdapter(this, R.layout.room_list_item,mRoomList)
        roomListView.adapter = mRoomAdepter

    }
}