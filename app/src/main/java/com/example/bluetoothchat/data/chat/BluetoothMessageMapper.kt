package com.example.bluetoothchat.data.chat

import com.example.bluetoothchat.domain.chat.BluetoothMessage

fun String.toBluetoothMessage(isFromLoacal: Boolean): BluetoothMessage {
    val str = this.split("#")
    return BluetoothMessage(
        str[1], str[0],
        isFromLoacal
    )

}

fun BluetoothMessage.toByteArray(): ByteArray {
    return "$senderName#$message".encodeToByteArray()
}