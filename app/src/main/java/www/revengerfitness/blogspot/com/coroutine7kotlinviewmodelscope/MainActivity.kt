package www.revengerfitness.blogspot.com.coroutine7kotlinviewmodelscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Coroutine scope attached with your view Models called viewModelScope.
 * similarly we have lifecycleScope attached with lifecycle(Activity or Fragments)
 * Coroutines in this scope will be cancelled automatically when view model or lifecycle is cleared or destroyed.
 * we don't need to manually cancel the coroutines.*/

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        lifecycleScope.launch{
delay(2000)
            val intent=Intent(this@MainActivity,AnotherActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}