package com.superheeyoung.amountdecimalformat.ui.amount

import androidx.lifecycle.ViewModel
import com.superheeyoung.amountdecimalformat.ui.state.AmountState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AmountViewModel @Inject constructor() : ViewModel() {
    private val _amountState = MutableStateFlow(AmountState())
    val amountState get() = _amountState.asStateFlow()
}