package com.github.ebrahimi16153.bottomnavigationinjetpackcomposeandroid.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.github.ebrahimi16153.bottomnavigationinjetpackcomposeandroid.model.User
import com.github.ebrahimi16153.bottomnavigationinjetpackcomposeandroid.model.list

@Composable
fun Home(navController: NavController) {

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            // top header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Social App", style = MaterialTheme.typography.caption)
                Icon(
                    modifier = Modifier
                        .size(15.dp)
                        .rotate(-36f),
                    imageVector = Icons.Default.Send,
                    contentDescription = ""
                )

            }

            Spacer(modifier = Modifier.height(10.dp))
            // storySection
            StorySection()
            //postSection
            PostSection()

        }


    }
}

@Composable
fun StorySection() {

    val items1 = list

    LazyRow() {
        items(items = items1) {

            Story(it)

        }
    }


}


@Composable
fun Story(user: User) {
    Surface(
        shape = CircleShape,
        border = BorderStroke(width = 1.dp, color = MaterialTheme.colors.primary),
        modifier = Modifier
            .width(70.dp)
            .height(70.dp)
            .padding(all = 3.dp)

    ) {

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = user.profile),
            contentDescription = ""
        )

    }

}

@Composable
fun PostSection() {
    LazyColumn {
        items(items = list) {
            Post(it)
        }
    }
}

@Composable
fun Post(user: User) {

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = user.post),
                contentDescription = "",
                modifier = Modifier.size(500.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(horizontalArrangement = Arrangement.Center) {

                    Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "")
                    Icon(imageVector = Icons.Default.Star, contentDescription = "")

                }

                Row(horizontalArrangement = Arrangement.End) {
                    Icon(imageVector = Icons.Default.Send, contentDescription = "")

                }
            }
            Spacer(modifier = Modifier.height(3.dp))
            Text(modifier = Modifier.padding(20.dp), text = user.caption, style = MaterialTheme.typography.caption)


        }


    }
}


