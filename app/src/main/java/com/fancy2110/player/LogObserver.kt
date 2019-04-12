package com.fancy2110.player

interface LogObserver {
    fun logMessage(prefix: String, level: Int, text: String)
}