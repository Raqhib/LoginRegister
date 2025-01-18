package id.co.mondo.loginregister

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.co.mondo.loginregister.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)




    }
}