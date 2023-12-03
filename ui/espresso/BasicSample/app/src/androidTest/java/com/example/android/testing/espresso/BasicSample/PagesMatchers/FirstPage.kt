package com.example.android.testing.espresso.BasicSample.PagesMatchers

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matcher
import com.example.android.testing.espresso.BasicSample.R



object FirstPage {
    val changedTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.changeTextBt) }
    val changedText: Matcher<View> by lazy { ViewMatchers.withId(R.id.textToBeChanged) }
    val actChangeTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.activityChangeTextBtn) }
    val userInput: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }

}