package com.example.test.Dagger

data class BlockInfo(
    val message: String,
    val info: String
)

data class BlockInfoSpell(
    val name: String,
    val incantation: String,
    val effect: String,
)

data class BlockInfoPotion(
    val name: String,
    val effect: String,
    val sideEffect: String
)

data class BlockInfoWizard(
    val name: String,
    val lastname: String
)