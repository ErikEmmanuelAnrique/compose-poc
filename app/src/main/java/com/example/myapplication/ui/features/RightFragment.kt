package com.example.myapplication.ui.features

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.BaseComposableFragment

class RightFragment : BaseComposableFragment() {

    @Composable
    override fun MainComposableLayout() {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Magenta)
        ) {
            Text(text = "Right")
        }
    }

    @Composable
    @Preview
    override fun DefaultPreview() {
        //TODO("Not yet implemented")
    }
}