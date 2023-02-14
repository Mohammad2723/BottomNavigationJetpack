package com.github.ebrahimi16153.bottomnavigationinjetpackcomposeandroid.navigation

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable

import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.ebrahimi16153.bottomnavigationinjetpackcomposeandroid.screen.*


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScaffold() {

    val navController = rememberNavController()


    Scaffold(bottomBar = { MyBottomAppBar(navController = navController) }) {


        NavHost(navController = navController, startDestination = ScreenRoute.Home.name) {


            composable(route = ScreenRoute.Home.name) {
                Home(navController = navController)
            }

            composable(route = ScreenRoute.Search.name) {
                Search(navController = navController)
            }

            composable(route = ScreenRoute.Add.name) {
                Add(navController = navController)
            }

            composable(route = ScreenRoute.Reels.name) {
                Reels(navController = navController)
            }

            composable(route = ScreenRoute.Profile.name) {
                Profile(navController = navController)
            }
        }
    }
}

@Composable
fun MyBottomAppBar(navController: NavController) {
    BottomAppBar() {




      //Home
        BottomNavigationItem(
            selected = true,
            onClick = {
                navController.popBackStack()
                navController.navigate(ScreenRoute.Home.name)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "",
                )
            })

        //Search
        BottomNavigationItem(
            selected = true,
            onClick = {
                navController.popBackStack()
                navController.navigate(ScreenRoute.Search.name)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                )
            })

        //Add
        BottomNavigationItem(
            selected = true,
            onClick = {
                navController.popBackStack()
                navController.navigate(ScreenRoute.Add.name)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = ""
                )
            })

        //Reels
        BottomNavigationItem(
            selected = true,
            onClick = {
                navController.popBackStack()
                navController.navigate(ScreenRoute.Reels.name)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "",
                )
            })

        //Profile
        BottomNavigationItem(
            selected = true,
            onClick = {
                navController.popBackStack()
                navController.navigate(ScreenRoute.Profile.name)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "",
                )
            })


    }
}