package com.bcarbonesi.cineapp_atc.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.bcarbonesi.cineapp_atc.View.Fragments.DestaqueFragment
import com.bcarbonesi.cineapp_atc.View.Fragments.NovidadesFragment
import com.bcarbonesi.cineapp_atc.View.Fragments.PraDepoisFragment
import com.bcarbonesi.cineapp_atc.View.Fragments.RankingFragment

class TabPagerAdapter (fm: FragmentManager, private var tabCount: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> return NovidadesFragment()
            1 -> return DestaqueFragment()
            2 -> return RankingFragment()
            3 -> return PraDepoisFragment()

            else -> return null
        }

    }

    override fun getCount(): Int {
        return tabCount
    }
}