package io.github.anatolyd

interface Funny {
    fun haveFun(): String
}

class BigClass : Funny {
    override fun haveFun() = "big"
}

class SmallClass : Funny {
    override fun haveFun() = "small"
}
