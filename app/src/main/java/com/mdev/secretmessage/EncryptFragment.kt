package com.mdev.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController

class EncryptFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_encrypt, container, false)
        val nextButton = view.findViewById<Button>(R.id.button2)
        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
        val message2 =  EncryptFragmentArgs.fromBundle(requireArguments()).message2
        val check = EncryptFragmentArgs.fromBundle(requireArguments()).check
        val encryptedView = view.findViewById<TextView>(R.id.encrypted_message)


        if (check ) {
            encryptedView.text = message.reversed()

        }else{
            encryptedView.text = message
        }

        nextButton.setOnClickListener {
            val message2= message2
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message,message2,check)
            view.findNavController().navigate(action)


        }
        return view
    }
}