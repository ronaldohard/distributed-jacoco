package io.github.anatolyd

interface Funny {
    fun haveFun(): String
}

class BigClass : Funny {
    override fun haveFun() = "big"

    fun extraFun() = "no fun at all"
}

class SmallClass : Funny {
    override fun haveFun() = "small"
}
