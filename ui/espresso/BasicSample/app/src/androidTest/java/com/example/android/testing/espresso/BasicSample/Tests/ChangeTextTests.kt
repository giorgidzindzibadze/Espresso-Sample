package com.example.android.testing.espresso.BasicSample.Tests

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.Data.Data
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.PagesMatchers.FirstPage
import com.example.android.testing.espresso.BasicSample.Steps.FirstPageSteps
import com.example.android.testing.espresso.BasicSample.Steps.SecondPageSteps
import com.example.android.testing.espresso.BasicSample.getText
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {
    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()
    @Test
    fun fullNameTest(){
        FirstPageSteps.changeTextActionStep(Data.name)
        FirstPageSteps.changeButtonClick()

        Assert.assertEquals(FirstPage.changedText.getText(), Data.name)
    }
    @Test
    fun favMovieTest(){
        FirstPageSteps.changeTextActionStep(Data.favMovie)
        FirstPageSteps.changeButtonClick()

        Assert.assertEquals(FirstPage.changedText.getText(), Data.favMovie)

        FirstPageSteps.clearTextActionStep()
        FirstPageSteps.changeTextActionStep(Data.secondFavMovie)
        FirstPageSteps.openActivityAndChangeTextSctionStep()

        SecondPageSteps.asserting()
    }


}