# MoneyTextView

A EditText used for inputing and adding money.

<img src="https://github.com/andyken/MoneyTextView/blob/master/sample/sample1.gif"/>

## Installation

Add the dependency to your build.gradle.

    compile 'com.github.andyken:moneytextview:1.2'

## Usage

Add the moneytextview to your layout.

    <com.github.andyken.moneytextview.MoneyTextView
        android:id="@+id/main_moneyTextView"
        android:layout_width="130dp"
        android:layout_height="65dp"
        android:layout_marginLeft="10dp"
        android:layout_gravity="right"
        android:gravity="end|center_vertical"
        moneytextview:integerFontSize="32sp"
        moneytextview:decimalPlaceFontSize="32sp"/>

- you can set the part of integer size by using xml attribute integerFontSize or the decimal size by using decimalPlaceFontSize.
- you can set the part of integer number by using xml attribute integerNum or the decimal number by using decimalNum.
- you can set the currency flag hidden by setting xml attribute needFlag to false.
- you can set the focus text color by using xml attribute focusTextColor.
- you can set the default money by using xml attribute initMoney.
- you can get the money by using getMoney or getMoneyStr.
