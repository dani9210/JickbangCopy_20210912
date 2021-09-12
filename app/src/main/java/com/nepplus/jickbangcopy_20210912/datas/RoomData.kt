package com.nepplus.jickbangcopy_20210912.datas

import java.text.NumberFormat
import java.util.*

class RoomData(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String)

{
    fun getFormattedPrice() : String {

//        1. 1억이 안넘는 경우( 가격 < 10000)
//        2. 그 외 : 1억 이상 =>   ?억 ???

        if (this.price < 10000) {


//                8000=> "8,000"으로 변경.

            val formattedStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return  formattedStr

}

        else {

//            75000 => "7억 5,000"

//            억단위? 75000 ->   7,   165000 ->  16   => 가격 / 10000 했을때, 몫?
//            정수 / 정수 => 결과도 무조건 정수. (소수점 버림)   168/ 10 =>  16

            val uk = this.price / 10000
//            천만원까지? 75000=> 5000 ,   168300  => 8300  => 가격을 / 10000,  나머지 ?

            val rest = this.price % 10000
//            c천만원단위 ->  컴마 찍기.

            val restCommarStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            val finalStr = "${uk}억 ${restCommarStr}"

            return finalStr



        }

    }
}