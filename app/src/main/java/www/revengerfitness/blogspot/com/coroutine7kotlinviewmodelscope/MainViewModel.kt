package www.revengerfitness.blogspot.com.coroutine7kotlinviewmodelscope

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    private val TAG:String = "prashant"
init {
viewModelScope.launch(){
    while (true){
        delay(500)
        Log.d(TAG,"hello prashant")
    }
}
}

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG,"View model destroyed")
    }
}