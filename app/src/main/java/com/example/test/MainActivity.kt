package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.Adapters.BlockElixirAdapter
import com.example.test.Adapters.BlockSpellAdapter
import com.example.test.Adapters.BlockWizardAdapter
import com.example.test.Dagger.BlockInfoPotion
import com.example.test.Dagger.BlockInfoSpell
import com.example.test.Dagger.BlockInfoWizard
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var blockInfoPotionList: List<BlockInfoPotion>

    @Inject
    lateinit var blockInfoWizardList: List<BlockInfoWizard>

    @Inject
    lateinit var blockInfoSpellList: List<BlockInfoSpell>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        setContentView(R.layout.activity_main)

        (application as App).appComponent.inject(this)

        // Set up RecyclerView

        findViewById<Button>(R.id.supabutton)
            .setOnClickListener {
                val startButton: Button = findViewById(R.id.supabutton)
                startButton.visibility = View.GONE
                val layout: RelativeLayout = findViewById(R.id.panel)
                layout.visibility = View.VISIBLE
                val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
                recyclerView.layoutManager = LinearLayoutManager(this)
                recyclerView.adapter = BlockElixirAdapter(blockInfoPotionList)
            }

        findViewById<Button>(R.id.elixir)
            .setOnClickListener {
                val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
                recyclerView.adapter = BlockElixirAdapter(blockInfoPotionList)
            }
        findViewById<Button>(R.id.spell)
            .setOnClickListener {
                val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
                recyclerView.adapter = BlockSpellAdapter(blockInfoSpellList)
            }
        findViewById<Button>(R.id.wizard)
            .setOnClickListener {
                val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
                recyclerView.adapter = BlockWizardAdapter(blockInfoWizardList)
            }
    }
}