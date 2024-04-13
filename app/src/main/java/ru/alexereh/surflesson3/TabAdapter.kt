package ru.alexereh.surflesson3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ru.alexereh.surflesson3.fragment.LaunchesFragment
import ru.alexereh.surflesson3.fragment.RocketsFragment
import ru.alexereh.surflesson3.fragment.UpcomingFragment
import java.lang.IllegalStateException

class TabAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> UpcomingFragment()
            1 -> LaunchesFragment()
            2 -> RocketsFragment()
            else -> throw IllegalStateException("Произошло непоправимое")
        }
    }
}