package com.example.kotlin.chat.service

interface MessageService {

    fun latest(): List<MessageVM>

    fun after(lastMessageId: String): List<MessageVM>

    fun post(message: MessageVM)
}