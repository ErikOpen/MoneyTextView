# MoneyTextView

A EditText used for inputing and adding money.

<img src="https://github.com/andyken/MoneyTextView/blob/master/sample/sample1.gif"/>

<b>How to Use</b>


Add the moneytextview to your layout.

    <com.github.andyken.moneytextviewlib.MoneyTextView
        android:id="@+id/main_moneyTextView"
        android:layout_width="130dp"
        android:layout_height="65dp"
        android:layout_marginLeft="10dp"
        android:layout_gravity="right"
        android:gravity="end|center_vertical"
        moneytextview:integerFontSize="32sp"
        moneytextview:decimalPlaceFontSize="32sp"/>


you can get the money by using getMoney or getMoneyStr.
