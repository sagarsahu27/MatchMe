package com.sagarsahu27.matchme.models

enum class BoardSize(val numCards: Int) {
    EASY (8),
    MEDIUM (12),
    HARD (24);

    fun getWidth(): Int {
        return when (this) {
            EASY -> 2
            MEDIUM -> 3
            HARD -> 4
        }
    }

    fun getHeight(): Int {
        return numCards / getWidth()
    }

    fun getPairs(): Int {
        return numCards / 2
    }

}