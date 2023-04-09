package com.example.finalexam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.finalexam.databinding.FragmentLoginBinding


class Login : Fragment() {

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.btnLogin.setOnClickListener {

            val strName = binding.etName.text.toString()
            val strPassword = binding.etPassword.text.toString()

            when {
                strName.isBlank() -> {
                    Toast.makeText(context, "Enter valid name ", Toast.LENGTH_LONG).show()
                }

                else -> {

                    val action = LoginDirections.actionLoginToHome2()
                    findNavController().navigate(action)

                }
            }


        }


        return binding.root
    }


}