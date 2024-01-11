package com.example.test

import com.example.test.Dagger.BlockInfoPotion
import com.example.test.Dagger.BlockInfoSpell
import com.example.test.Dagger.BlockInfoWizard
import com.example.test.Dagger.BlockSupply
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)

}

@Module
class AppModule {

    @Provides
    fun provideBlockPotionList(): List<BlockInfoPotion> {
        //val list = BlockSupply.getPotions()
        //Log.w("Ho", list.size.toString())
        return BlockSupply.getPotions()
            // Add more BlockInfo instances with different text
    }

    @Provides
    fun provideBlockWizardList(): List<BlockInfoWizard> {
        //val list = BlockSupply.getPotions()
        //Log.w("Ho", list.size.toString())
        return BlockSupply.getWizards()
        // Add more BlockInfo instances with different text
    }

    @Provides
    fun provideBlockSpellList(): List<BlockInfoSpell> {
        //val list = BlockSupply.getPotions()
        //Log.w("Ho", list.size.toString())
        return BlockSupply.getSpells()
        // Add more BlockInfo instances with different text
    }


}