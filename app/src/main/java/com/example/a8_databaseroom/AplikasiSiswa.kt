package com.example.a8_databaseroom

import android.app.Application
import com.example.a8_databaseroom.repositori.ContainerApp
import com.example.a8_databaseroom.repositori.ContainerDataApp

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}