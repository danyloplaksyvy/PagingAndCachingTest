package pro.danbya.pagingandcachingtest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pro.danbya.pagingandcachingtest.details.presentation.view.DetailsScreen
import pro.danbya.pagingandcachingtest.main.presentation.view.MainScreen

@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(startDestination = Screens.MainScreen.name, navController = navController) {
        composable(route = Screens.MainScreen.name) {
            MainScreen { id ->
                navController.navigate("${Screens.DetailsScreen.name}?$id")
            }
        }
        composable(route = "${Screens.DetailsScreen.name}?{id}") {
            DetailsScreen {
                navController.popBackStack()
            }
        }
    }
}