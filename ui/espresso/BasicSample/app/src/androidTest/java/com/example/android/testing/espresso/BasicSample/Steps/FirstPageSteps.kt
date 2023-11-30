package com.example.android.testing.espresso.BasicSample.Steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import com.example.android.testing.espresso.BasicSample.PagesMatchers.FirstPage
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.typeText

object FirstPageSteps {
    fun changeTextActionStep(userName: String){
        FirstPage.userInput.typeText(userName)
    }

    fun  openActivityAndChangeTextSctionStep(){
        FirstPage.actChangeTextBtn.tap()
    }

    fun changeButtonClick(){
        FirstPage.changedTextBtn.tap()
    }

    fun clearTextActionStep(){
        onView(FirstPage.userInput).perform(clearText())
    }
}