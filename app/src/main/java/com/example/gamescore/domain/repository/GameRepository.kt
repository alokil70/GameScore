package com.example.gamescore.domain.repository

import com.example.gamescore.domain.entity.GameSettings
import com.example.gamescore.domain.entity.Level
import com.example.gamescore.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}