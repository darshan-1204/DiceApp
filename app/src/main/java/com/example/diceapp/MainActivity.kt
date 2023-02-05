package com.example.diceapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.diceapp.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.roll.setOnClickListener {

            val num = Random().nextInt(6 - 1 + 1) + 1


            if (num == 1) {
                binding.one.visibility = View.VISIBLE
                binding.two.visibility = View.GONE
                binding.three.visibility = View.GONE
                binding.four.visibility = View.GONE
                binding.five.visibility = View.GONE
                binding.six.visibility = View.GONE
            }
            if (num == 2) {
                binding.one.visibility = View.GONE
                binding.two.visibility = View.VISIBLE
                binding.three.visibility = View.GONE
                binding.four.visibility = View.GONE
                binding.five.visibility = View.GONE
                binding.six.visibility = View.GONE
            }

            if (num == 3) {
                binding.one.visibility = View.GONE
                binding.two.visibility = View.GONE
                binding.three.visibility = View.VISIBLE
                binding.four.visibility = View.GONE
                binding.five.visibility = View.GONE
                binding.six.visibility = View.GONE
            }
            if (num == 4) {
                binding.one.visibility = View.GONE
                binding.two.visibility = View.GONE
                binding.three.visibility = View.GONE
                binding.four.visibility = View.VISIBLE
                binding.five.visibility = View.GONE
                binding.six.visibility = View.GONE
            }

            if (num == 5) {
                binding.one.visibility = View.GONE
                binding.two.visibility = View.GONE
                binding.three.visibility = View.GONE
                binding.four.visibility = View.GONE
                binding.five.visibility = View.VISIBLE
                binding.six.visibility = View.GONE
            }
            if (num == 6) {
                binding.one.visibility = View.GONE
                binding.two.visibility = View.GONE
                binding.three.visibility = View.GONE
                binding.four.visibility = View.GONE
                binding.five.visibility = View.GONE
                binding.six.visibility = View.VISIBLE
            }

            binding.toast.text = "Your toss is :-$num"
        }
    }
}