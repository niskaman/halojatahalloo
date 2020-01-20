package com.example.halojatahalloo

import android.telecom.Connection
import android.telecom.ConnectionRequest
import java.util.logging.Logger
import android.telecom.ConnectionService
import android.telecom.PhoneAccountHandle
import android.telecom.PhoneAccount


class MyConnectionService : ConnectionService() {

    val log = Logger.getLogger(MyConnectionService::class.java.name)
//    val data = intent.getStringExtra("data")
//    log.info("Message is : ${data}")

    private lateinit var conn: MyConnection

    override fun onCreateOutgoingConnection(
        connectionManagerPhoneAccount: PhoneAccountHandle?,
        request: ConnectionRequest?
    ): Connection {
        this.conn = MyConnection()
        this.conn.connectionCapabilities = PhoneAccount.CAPABILITY_SELF_MANAGED
        log.info("Outgoing connection initialized")
        return this.conn
    }

    override fun onCreateOutgoingConnectionFailed(
        connectionManagerPhoneAccount: PhoneAccountHandle?,
        request: ConnectionRequest?
    ) {
        this.conn.destroy()
        log.info("Outgoing connection connection failed")
        // TODO: implement some kind of message e.g. toast
    }

    override fun onCreateIncomingConnection(
        connectionManagerPhoneAccount: PhoneAccountHandle?,
        request: ConnectionRequest?
    ): Connection {
        this.conn = MyConnection()
        this.conn.connectionCapabilities = PhoneAccount.CAPABILITY_SELF_MANAGED
        log.info("Incoming connection initialized")
        return this.conn
    }

    override fun onCreateIncomingConnectionFailed(
        connectionManagerPhoneAccount: PhoneAccountHandle?,
        request: ConnectionRequest?
    ) {
        log.info("Incoming connection connection failed")
    }
}