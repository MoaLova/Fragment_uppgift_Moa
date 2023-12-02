package com.example.fragmentuppgiftmoa

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint


class Ball (context: Context) {

    var posX = 0f
    var posY = 0f
    var paint = Paint()
    var size = 50f
    var speed = 5f

    fun update() {

        posY += speed
        posX += speed

    }

    fun draw(canvas: Canvas?) {

        canvas?.drawCircle(posX, posY, size, paint)
    }

}




