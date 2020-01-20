package com.example.halojatahalloo

import android.telecom.CallAudioState
import android.telecom.Connection
import java.util.logging.Logger


class MyConnection: Connection() {

    val log = Logger.getLogger(MyConnectionService::class.java.name)

    override fun onShowIncomingCallUi() {
        super.onShowIncomingCallUi()
    }

    override fun onCallAudioStateChanged(state: CallAudioState?) {
        super.onCallAudioStateChanged(state)
    }

    override fun onHold() {
        super.onHold()
    }

    override fun onUnhold() {
        super.onUnhold()
    }

    override fun onAnswer() {
        super.onAnswer()
    }

    override fun onReject() {
        super.onReject()
    }

    override fun onDisconnect() {
        super.onDisconnect()
    }
}