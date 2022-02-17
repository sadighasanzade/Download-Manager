package com.sado.downloadmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.sado.downloadmanager.adapter.PagerAdapter
import com.sado.downloadmanager.databinding.ActivityMainBinding
import com.sado.downloadmanager.fragments.DownloadFragment
import com.sado.downloadmanager.fragments.ListenFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var downloadFragment: DownloadFragment
    private lateinit var listenFragment: ListenFragment
    private lateinit var adapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        //INITIALIZE FRAGMENTS
        downloadFragment = DownloadFragment()
        listenFragment = ListenFragment()

        //initialize viewpager
        val tabs = arrayOf("Download", "Listen")
        val fragments = arrayOf(downloadFragment, listenFragment)
        adapter = PagerAdapter(fm = supportFragmentManager , tabs = tabs , fragments = fragments)
        binding.pager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.pager)

    }
}