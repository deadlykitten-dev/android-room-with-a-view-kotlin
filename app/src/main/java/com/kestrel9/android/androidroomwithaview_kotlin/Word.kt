package com.kestrel9.android.androidroomwithaview_kotlin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * AndroidRoomWithAView-Kotlin
 * Class: Word
 * Created by kestr on 2018-10-16.
 *
 * Description:
 */
@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)