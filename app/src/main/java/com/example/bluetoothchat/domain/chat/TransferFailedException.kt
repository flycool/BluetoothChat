package com.example.bluetoothchat.domain.chat

import java.io.IOException

class TransferFailedException :IOException("Reading incoming data failed")