package com.kestrel9.android.androidroomwithaview_kotlin

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * AndroidRoomWithAView-Kotlin
 * Class: WordDao
 * Created by kestr on 2018-10-16.
 *
 * Description:
 */
@Dao
interface WordDao {

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>

    @Insert
    fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()
}