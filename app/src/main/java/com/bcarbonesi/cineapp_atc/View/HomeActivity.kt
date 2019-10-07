package com.bcarbonesi.cineapp_atc.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bcarbonesi.cineapp_atc.Adapter.TabPagerAdapter
import com.bcarbonesi.cineapp_atc.R
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_detalhes_scrolling.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        floatingActionButtonSearch.setOnClickListener { view ->
            Snackbar.make(view,"Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()
        }

        configureTabLayout()


    }

    private fun configureTabLayout() {

        tabLayout.addTab(tabLayout.newTab().setText("Em Destaque").setIcon(R.drawable.ic_vector_destaque))
        tabLayout.addTab(tabLayout.newTab().setText("Catálogo").setIcon(R.drawable.ic_vector_catalogo))
        tabLayout.addTab(tabLayout.newTab().setText("Ranking").setIcon(R.drawable.ic_vector_ranking))
        tabLayout.addTab(tabLayout.newTab().setText("Pra Ver").setIcon(R.drawable.ic_vector_pipoca))

        val adapter = TabPagerAdapter(supportFragmentManager,
            tabLayout.tabCount)
        pager.adapter = adapter

        pager.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                pager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }

        })
    }
}
