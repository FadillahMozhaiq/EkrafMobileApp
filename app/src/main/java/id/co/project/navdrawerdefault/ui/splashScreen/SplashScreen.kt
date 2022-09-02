package id.co.project.navdrawerdefault.ui.splashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.lifecycleScope
import id.co.project.navdrawerdefault.R
import id.co.project.navdrawerdefault.ui.authentication.LoginActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)

        val readStateLogin: LiveData<Boolean>

        lifecycleScope.launch {
            delay(2000)
            withContext(Dispatchers.Main) {
                        startActivity(Intent(this@SplashScreen, LoginActivity::class.java))
                        finish()
            }
        }
    }
}