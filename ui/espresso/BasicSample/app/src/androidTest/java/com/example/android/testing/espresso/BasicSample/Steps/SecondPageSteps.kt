package com.example.android.testing.espresso.BasicSample.Steps

import com.example.android.testing.espresso.BasicSample.Data.Data
import com.example.android.testing.espresso.BasicSample.PagesMatchers.SecondPage
import com.example.android.testing.espresso.BasicSample.getText
import org.junit.Assert

object SecondPageSteps {
        fun asserting(){
            Assert.assertEquals(SecondPage.textView.getText(), Data.secondFavMovie)
        }
}