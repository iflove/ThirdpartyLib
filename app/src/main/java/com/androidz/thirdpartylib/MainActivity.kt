package com.androidz.thirdpartylib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.firefly.api.FireflyApi
import com.firefly.api.face.control.RelayUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        RelayUtil.sendRelaySignal(true)
//        FireflyApi.getInstance().reboot()

    }
}