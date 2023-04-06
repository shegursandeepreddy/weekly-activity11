package com.mdev.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.navigation.findNavController

class MessageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = view.findViewById<Button>(R.id.next)
        val messageView = view.findViewById<EditText>(R.id.message)
        val messageView2 = view.findViewById<EditText>(R.id.message2)
        val checkBox = view.findViewById<CheckBox>(R.id.checkBox)

        nextButton.setOnClickListener {
            val message = messageView.text.toString()
            val message2= messageView2.text.toString()
            val check = checkBox.isChecked
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message,message2,check)
            view.findNavController().navigate(action)
        }

        // Inflate the layout for this fragment
        return view
    }
}