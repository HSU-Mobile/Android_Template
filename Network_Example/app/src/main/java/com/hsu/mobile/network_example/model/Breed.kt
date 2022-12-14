package com.hsu.mobile.network_example.model

data class Breed(
    val name: String,
    val temperament: String,
    val origin: String,
    val description: String,
    val life_span: String,
    val image: Image?
)

data class Image(
    val width: Int,
    val height: Int,
    val url: String?
)
