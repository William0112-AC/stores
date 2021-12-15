package com.cursosant.android.stores

import androidx.room.*

/****

 * Desarrollo de Software Multiplataforma
 *
 * Diseño para Apps
 ***/
@Dao
interface StoreDao {
    @Query("SELECT * FROM StoreEntity")
    fun getAllStores() : MutableList<StoreEntity>

    @Insert
    fun addStore(storeEntity: StoreEntity)

    @Update
    fun updateStore(storeEntity: StoreEntity)

    @Delete
    fun deleteStore(storeEntity: StoreEntity)
}