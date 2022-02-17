package com.sado.downloadmanager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(private val tabs : Array<String>,
                   fm: FragmentManager,
                   private val fragments : Array<Fragment>) :
    FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return tabs.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabs[position]
    }
}