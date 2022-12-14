package ai.cloudcnctr.platformone.presentation.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ai.cloudcnctr.platformone.presentation.ui.bottombar.BottomBarScreen
import androidx.navigation.navArgument

/**
 * Created by Das on 2022-07-08.
 */
@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.TabOneScreen.route
    ) {
        composable(route = BottomBarScreen.TabOneScreen.route) {
            TabOneScreen()
        }

        composable(route = BottomBarScreen.TabTwoScreen.route) {
            TabTwoScreen()
        }

        composable(route = BottomBarScreen.TabThreeScreen.route) {
            TabThreeScreen()
        }

        composable(route = BottomBarScreen.TabFourScreen.route) {
            TabFourScreen()
        }

        composable(route = BottomBarScreen.CryptoListScreen.route) {
            CryptoListScreen(navController)
        }




        composable(
            route = Screen.CryptoDetailScreen.route + "/{arg_name}",
            arguments = listOf(
                navArgument("arg_name") {
                    type = NavType.StringType
                    defaultValue = "eth-ethereum"
                    nullable = true
                }
            )
        ) { backStackEntry ->
            CryptoDetailScreen(
                name = backStackEntry.arguments?.getString("arg_name")
            )
        }
    }
}