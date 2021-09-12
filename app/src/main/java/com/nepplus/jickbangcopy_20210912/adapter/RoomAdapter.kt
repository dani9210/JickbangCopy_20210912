package com.nepplus.jickbangcopy_20210912.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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
            tempRow =
                mInflater.inflate(com.nepplus.jickbangcopy_20210912.R.layout.room_list_item, null)

        }
            val row = tempRow!!

            val data = mList[position]

            val priceTxt = row.findViewById<TextView>(com.nepplus.jickbangcopy_20210912.R.id.priceTxt)
            val addressandFloorTxt = row.findViewById<TextView>(com.nepplus.jickbangcopy_20210912.R.id.addressandFloorTxt)
           val descriptionTxt = row.findViewById<TextView>(com.nepplus.jickbangcopy_20210912.R.id.descriptionTxt)

           priceTxt.text = data.getFormattedPrice()

        return row
    }
}