package com.example.a8_databaseroom.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SiswaDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    @Query("SELECT * from tblsiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>
}
