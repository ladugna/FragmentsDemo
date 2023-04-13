package com.example.fragmentsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsexample.databinding.FragmentContactBinding
import com.example.fragmentsexample.databinding.FragmentHomeBinding
import java.text.DateFormat
import java.time.LocalDate
import java.util.*

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view  = inflater.inflate(R.layout.fragment_home,container,false)
        // Initialize the binding object with the given below code, layout already inflated, so call bind()
        binding = FragmentHomeBinding.bind(view)

        var maxdate = Calendar.getInstance()
        maxdate.set(2023,11,31)
        // Set the Min and Max date for the CalenderView
        binding.cview.minDate = System.currentTimeMillis()
        binding.cview.maxDate = maxdate.timeInMillis
        binding.cview.setOnDateChangeListener{ v, year, month, dayOfMonth ->
            binding.tv1.text =  "You booked on ${month + 1}-$dayOfMonth-$year"
        }
        return view
    }
}