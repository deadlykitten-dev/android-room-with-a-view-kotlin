package com.kestrel9.android.androidroomwithaview_kotlin

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

/**
 * AndroidRoomWithAView-Kotlin
 * Class: WordRepository
 * Created by kestr on 2018-10-16.
 *
 * Description:
 */
class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}