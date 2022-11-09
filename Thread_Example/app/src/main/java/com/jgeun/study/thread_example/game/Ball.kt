package com.jgeun.study.thread_example.game

data class Ball(
    var x: Float = 0f,
    var y: Float = 0f,
    var width: Int = 60,
    var height: Int = 60,
    var speedX: Float = 3f,
    var speedY: Float = -3f,
)