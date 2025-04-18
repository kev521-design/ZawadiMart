package com.Kevin.zawadimart.navigation



import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.Kevin.zawadimart.data.UserDatabase
import com.Kevin.zawadimart.navigation.ROUT_ABOUT
import com.Kevin.zawadimart.navigation.ROUT_DASHBOARD
import com.Kevin.zawadimart.navigation.ROUT_FORM
import com.Kevin.zawadimart.navigation.ROUT_FORM1
import com.Kevin.zawadimart.navigation.ROUT_HOME
import com.Kevin.zawadimart.navigation.ROUT_INTENT
import com.Kevin.zawadimart.navigation.ROUT_ITEM
import com.Kevin.zawadimart.navigation.ROUT_SERVICE
import com.Kevin.zawadimart.navigation.ROUT_SPLASH
import com.Kevin.zawadimart.navigation.ROUT_START
import com.Kevin.zawadimart.repository.UserRepository
import com.Kevin.zawadimart.ui.theme.screens.about.AboutScreen
import com.Kevin.zawadimart.ui.theme.screens.auth.LoginScreen
import com.Kevin.zawadimart.ui.theme.screens.auth.RegisterScreen
import com.Kevin.zawadimart.ui.theme.screens.dashboard.DashboardScreen
import com.Kevin.zawadimart.ui.theme.screens.home.HomeScreen
import com.Kevin.zawadimart.ui.theme.screens.intent.IntentScreen
import com.Kevin.zawadimart.ui.theme.screens.item.ItemScreen
import com.Kevin.zawadimart.ui.theme.screens.splash.SplashScreen
import com.Kevin.zawadimart.ui.theme.screens.start.StartScreen
import com.Kevin.zawadimart.viewmodel.AuthViewModel


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_FORM
) {

    val context = LocalContext.current

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
        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUT_FORM){
            SplashScreen(navController)
        }
        composable(ROUT_FORM1){
            SplashScreen(navController)
        }



        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUTE_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUTE_LOGIN) {
                    popUpTo(ROUTE_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUTE_LOGIN) { inclusive = true }
                }
            }
        }










    }
}

