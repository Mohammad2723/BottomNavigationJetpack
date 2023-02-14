package com.github.ebrahimi16153.bottomnavigationinjetpackcomposeandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.github.ebrahimi16153.bottomnavigationinjetpackcomposeandroid.navigation.MainScaffold
import com.github.ebrahimi16153.bottomnavigationinjetpackcomposeandroid.ui.theme.BottomNavigationInJetpackComposeAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              MyApp()
        }
    }
}

@Composable
fun MyApp(){
    BottomNavigationInJetpackComposeAndroidTheme {
        MainScaffold()
    }
}
