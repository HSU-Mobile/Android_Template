package com.jgeun.study.thread_example.game

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Handler
import android.os.Message
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.jgeun.study.thread_example.R

class GameView(context: Context) : View(context) {

    private val paint: Paint = Paint()
    private val displayMetrics: DisplayMetrics = DisplayMetrics()
    private var screenHeight: Int
    private var screenWidth: Int
    private var screenGameTop = 0F

    private val ball : Ball
    private val ballImage: Bitmap


    init {
        (context.getSystemService(AppCompatActivity.WINDOW_SERVICE) as WindowManager).defaultDisplay.getMetrics(displayMetrics)
        screenHeight = displayMetrics.heightPixels
        screenWidth= displayMetrics.widthPixels
        ball = Ball(600F, 200F, screenWidth/16, screenHeight/32, 10f, -10f)
        ballImage = Bitmap.createScaledBitmap(
                BitmapFactory.decodeResource(resources, R.drawable.bubble_red),
        ball.width,
        ball.height,
        true
        )
        BallThread(ball).start()

        var mHandler: Handler = object : Handler() {
            override fun handleMessage(msg: Message) {
                invalidate()
                sendEmptyMessageDelayed(0, 10)
            }
        }

        mHandler.sendEmptyMessageDelayed(0, 10)

    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawRect(0F, 0F, screenWidth.toFloat(), screenGameTop, paint)

        canvas.drawBitmap(ballImage, ball.x, ball.y, null)

    }

    inner class BallThread(private val ball: Ball): Thread() {

        override fun run() {
            super.run()

            while(true) {
                Log.d("Check", "run: ${ball.x} ${ball.y}")
                ball.x += ball.speedX // 가로로 이동
                ball.y += ball.speedY // 세로로 이동

                if (ball.x < ball.width / 2) {                           // 왼쪽 벽
                    ball.x = ball.width / 2.toFloat()
                    ball.speedX = -ball.speedX
                } else if (ball.x > screenWidth - ball.width / 2) {         // 오른쪽 벽
                    ball.x = (screenWidth - ball.width / 2).toFloat()
                    ball.speedX = -ball.speedX
                } else if (ball.y < screenGameTop ) {                    // 천장
                    ball.y = screenGameTop
                    ball.speedY = -ball.speedY
                } else if (ball.y > screenHeight - ball.height){ // 바닥
                    ball.y = screenHeight.toFloat() - 100f - ball.height/2
                    ball.speedY = -ball.speedY
                }
                sleep(10)

            }
        }
    }
}