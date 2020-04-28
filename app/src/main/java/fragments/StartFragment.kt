package fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_start_game.*
import viewmodel.GameViewModel
import viewmodel.GameViewModelFactory

class StartFragment : Fragment(){

    private val viewModel by lazy {
        ViewModelProvider(this,GameViewModelFactory()).get(GameViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start_game,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        start_game_button.setOnClickListener {
            //Todo : navigation goes here
        }
    }
}