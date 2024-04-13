package ru.alexereh.surflesson3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import ru.alexereh.surflesson3.R
import ru.alexereh.surflesson3.databinding.FragmentLaunchesBinding

class LaunchesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentLaunchesBinding>(
            inflater,
            R.layout.fragment_launches,
            container,
            false
        )
        return binding.root
    }
}