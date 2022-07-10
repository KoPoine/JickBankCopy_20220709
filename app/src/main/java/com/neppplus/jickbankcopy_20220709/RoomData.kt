package com.neppplus.jickbankcopy_20220709

import java.text.DecimalFormat

class RoomData (
    val price : Int,
    val address : String,
    val level : Int,
    val description : String
        ){

    fun getFormattedPrice() : String {
        val formatter = DecimalFormat("#,###")

        var resultPrice = ""

        if (price < 10000) {
            resultPrice = formatter.format(price)
        } else {
//            price가 12000일 경우
            val over = price / 10000 // over = 1
            val remain = price % 10000  // remain = 2000
            resultPrice = "${over}억 ${formatter.format(remain)}"
        }
        return resultPrice
    }

    fun getFormattedLevel() : String {
        var resultLevel = ""

//        if (level > 0) {
//            resultLevel = ", ${level}층"
//        } else if (level == 0) {
//            resultLevel = ", 반지하"
//        } else {
//            resultLevel = ", 지하 ${level * -1}층"
//        }

        when {
            level > 0 -> {
                resultLevel = ", ${level}층"
            }
            level == 0 -> {
                resultLevel = ", 반지하"
            }
            else -> {
                resultLevel = ", 지하 ${level * -1}층"
            }
        }

        return resultLevel
    }
}


















