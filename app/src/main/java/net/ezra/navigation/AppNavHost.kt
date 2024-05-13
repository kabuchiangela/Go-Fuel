package net.ezra.navigation

import LoginScreen
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.account.AccountScreen
import net.ezra.ui.gas.GasScreen
import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.card.CardScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.eatery.EateryScreen
import net.ezra.ui.offers.OffersScreen
import net.ezra.ui.castrol.ShopScreen
import net.ezra.ui.notifications.NotificationsScreen
import net.ezra.ui.register.Dashboard
import net.ezra.ui.register.Register
import net.ezra.ui.register.StudentList

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_GAS) {
            GasScreen(navController)
        }

        composable(ROUTE_OFFERS) {
            OffersScreen(navController)
        }

        composable(ROUTE_ACCOUNT) {
            AccountScreen(navController)
        }

        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

        composable(ROUTE_EATERY) {
            EateryScreen(navController)
        }

        composable(ROUTE_CARD) {
            CardScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            Register(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUTE_NOTIFICATIONS) {
            NotificationsScreen(navController)
        }

        composable(ROUTE_VIEW_STUDENTS) {
            StudentList(navController = navController, viewModel = viewModel())
        }

        composable(ROUTE_DASHBOARD) {
            Dashboard(navController)
        }

































    }
}


