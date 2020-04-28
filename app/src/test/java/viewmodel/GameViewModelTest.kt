package viewmodel

import androidx.navigation.NavController
import com.example.myapplication.R
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class GameViewModelTest {

    private lateinit var viewModel: GameViewModel

    @Before
    fun setUp(){
        viewModel = GameViewModel()
    }

    @Test
    fun testNavigateToPlayerInfoFragment() {
        val mockNavController = Mockito.mock(NavController::class.java)
        val expectedNavController = mockNavController.navigate(R.id.action_startFragment_to_playerInfoFragment)
        val actualNavController = viewModel.navigateToPlayerInfoFragment(mockNavController, R.id.action_startFragment_to_playerInfoFragment)
        Assert.assertEquals(expectedNavController,actualNavController)
    }

}