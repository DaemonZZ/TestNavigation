package com.example.testnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.testnavigation.databinding.FragmentTestLayoutBinding

class FragmentTestA : Fragment() {
    private lateinit var binding: FragmentTestLayoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTestLayoutBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnClick.text = this.javaClass.simpleName
        binding.btnClick.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentTestA_to_fragmentTestB)
        }
    }
}