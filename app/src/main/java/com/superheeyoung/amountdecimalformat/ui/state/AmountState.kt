package com.superheeyoung.amountdecimalformat.ui.state

data class AmountState(
    val amount : String = "",
    val isValid : Boolean = amount.isNotEmpty() && amount.toFloat() > 0
)
