package com.example.a8_databaseroom.repositori

import android.content.Context
import com.example.a8_databaseroom.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context) : ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}
