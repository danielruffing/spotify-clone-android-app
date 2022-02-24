package com.example.cse438.cse438_assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.cse438.cse438_assignment2.Adapter.TrackListAdapter
import com.example.cse438.cse438_assignment2.fragments.HomeFragment
import com.example.cse438.cse438_assignment2.fragments.PlaylistFragment
import com.example.cse438.cse438_assignment2.network.TrackViewModel
import kotlinx.android.synthetic.main.activity_main.*
import com.example.cse438.cse438_assignment2.data.Track
import com.example.cse438.cse438_assignment2.data.TrackDB


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)
        val a = TrackDB("a", "p", 1, 1)

    }

}

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() : Int {
        return 2
    }

    override fun getItem(position: Int) : Fragment {
        return when (position) {
            0 -> { HomeFragment() }
            else -> PlaylistFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Home"
            else -> "Playlists"
        }
    }

}
