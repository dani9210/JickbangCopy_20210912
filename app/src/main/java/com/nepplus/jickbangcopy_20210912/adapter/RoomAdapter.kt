package com.nepplus.jickbangcopy_20210912.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.viewpager2.R
import com.nepplus.jickbangcopy_20210912.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>)  : ArrayAdapter<RoomData>(mContext,resId,mList) {


    val mInflater = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            temprow = mInflater.inflate(R.layout)

            val row - tempRow!!

            return row
        }

    }
}