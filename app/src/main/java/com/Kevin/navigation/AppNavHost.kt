package com.Kevin.navigation



import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.Kevin.zawadimart.navigation.ROUT_ABOUT
import com.Kevin.zawadimart.navigation.ROUT_DASHBOARD
import com.Kevin.zawadimart.navigation.ROUT_HOME
import com.Kevin.zawadimart.navigation.ROUT_INTENT
import com.Kevin.zawadimart.navigation.ROUT_ITEM
import com.Kevin.zawadimart.navigation.ROUT_SERVICE
import com.Kevin.zawadimart.navigation.ROUT_START
import com.Kevin.zawadimart.ui.theme.screens.about.AboutScreen
import com.Kevin.zawadimart.ui.theme.screens.dashboard.DashboardScreen
import com.Kevin.zawadimart.ui.theme.screens.home.HomeScreen
import com.Kevin.zawadimart.ui.theme.screens.intent.IntentScreen
import com.Kevin.zawadimart.ui.theme.screens.item.ItemScreen
import com.Kevin.zawadimart.ui.theme.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_DASHBOARD
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD ){
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE){
            DashboardScreen(navController)
        }

    }
}

