package com.example.littlelemon1stprojectfinal

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase

@Entity
data class MenuItemRoom(
    @PrimaryKey
    val id: Int,
    val title : String ,
    val description : String ,
    val price : Double,
    val category : String,
    val imageUrl : String

)
@Dao
interface MenuItemDao{
    @Query("SELECT * FROM menuitemroom")
    fun getAll(): LiveData<List<MenuItemRoom>>

    @Insert
    fun insertAll(vararg menuItems : MenuItemRoom)

    @Query("SELECT (SELECT COUNT(*) FROM menuitemroom)==0")
    fun isEmpty(): Boolean

}
@Database(entities = [MenuItemRoom::class],version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun menuItemDao(): MenuItemDao

}