package com.example.a8_databaseroom.repositori

import com.example.a8_databaseroom.room.Siswa
import com.example.a8_databaseroom.room.SiswaDAO
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>

    suspend fun insertSiswa(siswa: Siswa)
}


