package com.mdev.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class EncryptFragment2  : Fragment()  {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_encrypt2, container, false)
        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message2
        val encryptedView = view.findViewById<TextView>(R.id.encrypted_message2)

        encryptedView.text = message.reversed()
        return view
    }
}