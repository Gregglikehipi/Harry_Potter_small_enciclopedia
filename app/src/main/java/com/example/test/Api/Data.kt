package com.example.test.Api

data class Elixir(
    val id: String,
    val name: String?,
    val effect: String?,
    val sideEffects: String?,
    val characteristics: String?,
    val time: String?,
    val difficulty: String,
    val ingredients: List<Ingredients>?,
    val inventors: List<Inventors>?,
    val manufacturer: String?,
)

data class Ingredients(
    val id: String,
    val name: String?,
)

data class Inventors(
    val id: String,
    val firstname: String?,
    val lastName: String?
)

data class Wizard(
    val elixirs: List<Elixirs>?,
    val id: String,
    val firstName: String?,
    val lastName: String?
)

data class Elixirs(
    val id: String,
    val name: String?,
)

data class Spell(
    val id: String,
    val name: String?,
    val incantation: String?,
    val effect: String?,
    val canBeVerbal: Boolean?,
    val type: String?,
    val light: String?,
    val creator: String?
)
