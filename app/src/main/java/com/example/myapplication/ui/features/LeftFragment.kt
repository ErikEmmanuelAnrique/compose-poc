package com.example.myapplication.ui.features

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.BaseComposableFragment

class LeftFragment : BaseComposableFragment() {

    @Composable
    override fun MainComposableLayout() {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
        ) {
            Text(text = "Left")
        }
    }

    @Composable
    @Preview
    override fun DefaultPreview() {
        //TODO("Not yet implemented")
    }
}