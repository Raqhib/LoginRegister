package id.co.mondo.loginregister

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.co.mondo.loginregister.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}