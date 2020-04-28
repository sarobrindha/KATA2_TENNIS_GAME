package viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController

class GameViewModel : ViewModel() {

    fun navigateToPlayerInfoFragment(navController:NavController, actionId:Int){
        //Todo : Should navigate to player info
    }

    override fun onCleared() {
        super.onCleared()
    }
}

@Suppress("UNCHECKED_CAST")
class GameViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GameViewModel() as T
    }
}