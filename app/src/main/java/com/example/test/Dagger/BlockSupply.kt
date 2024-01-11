package com.example.test.Dagger

import com.example.test.Api.MyRepository
import com.example.test.Dagger.BlockInfoPotion
import com.example.test.Dagger.BlockInfoSpell
import com.example.test.Dagger.BlockInfoWizard

class BlockSupply {
    companion object {
        fun getPotions(): List<BlockInfoPotion> {
            val list: MutableList<BlockInfoPotion> = ArrayList()
            MyRepository.getElixir() { post, throwable ->
                if (post != null) {
                    for (pot in post) {
                        var name: String = ""
                        var effect: String = ""
                        var sideEffect: String = ""
                        if (pot.name == null)
                            name = "-"
                        else {
                            name = pot.name.toString()
                        }
                        if (pot.effect == null)
                            effect = "-"
                        else {
                            effect = pot.effect.toString()
                        }
                        if (pot.sideEffects == null)
                            sideEffect = "-"
                        else {
                            sideEffect = pot.sideEffects.toString()
                        }
                        list.add(BlockInfoPotion(name, effect, sideEffect))
                    }
                } else {
                    // Handle error using 'throwable'
                }
            }
            return list
        }

        fun getSpells(): List<BlockInfoSpell> {
            val list: MutableList<BlockInfoSpell> = ArrayList()
            MyRepository.getSpell() { post, throwable ->
                if (post != null) {
                    for (pot in post) {
                        var name: String = ""
                        var effect: String = ""
                        var incantation: String = ""
                        if (pot.name == null)
                            name = "-"
                        else {
                            name = pot.name.toString()
                        }
                        if (pot.effect == null)
                            effect = "-"
                        else {
                            effect = pot.effect.toString()
                        }
                        if (pot.incantation == null)
                            incantation = "-"
                        else {
                            incantation = pot.incantation.toString()
                        }
                        list.add(BlockInfoSpell(name, incantation, effect))
                    }
                } else {
                    // Handle error using 'throwable'
                }
            }
            return list
        }

        fun getWizards(): List<BlockInfoWizard> {
            val list: MutableList<BlockInfoWizard> = ArrayList()
            MyRepository.getWizard() { post, throwable ->
                if (post != null) {
                    for (pot in post) {
                        var name: String = ""
                        var lastName: String = ""
                        if (pot.firstName == null)
                            name = "-"
                        else {
                            name = pot.firstName.toString()
                        }
                        if (pot.lastName == null)
                            lastName = "-"
                        else {
                            lastName = pot.lastName.toString()
                        }
                        list.add(BlockInfoWizard(name, lastName))
                    }
                } else {
                    // Handle error using 'throwable'
                }
            }
            return list
        }
    }
}