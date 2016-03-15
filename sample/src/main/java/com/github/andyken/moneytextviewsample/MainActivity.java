package com.github.andyken.moneytextviewsample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.github.andyken.moneytextviewlib.MoneyTextView;
/**
 * Created by andyken on 16/2/10.
 */
public class MainActivity extends Activity {

	private Context context;
	private MoneyTextView moneyTextView;
	private MoneySKView moneySKView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		initData();
		initNode();
		initEventListener();
	}

	private void initData() {
		context = this;
	}

	private void initNode() {
		moneyTextView = (MoneyTextView) findViewById(R.id.main_moneyTextView);
		moneySKView = (MoneySKView) findViewById(R.id.main_moneySKView);
	}

	private void initEventListener() {
		moneySKView.setMoneySKTextViewListener(new MoneySKView.MoneySKTextViewListener() {
			@Override
			public void clickNum(int num) {
				moneyTextView.clickNum(String.valueOf(num));
			}

			@Override
			public void clickNumAction(MoneySKView.NumActionType actionType) {
				switch (actionType) {
					case DOT:
						moneyTextView.clickDot();
						break;
					case BACKSPACE:
						moneyTextView.delStr();
						break;
					case ADD:
						moneyTextView.clickAdd();
						break;
					case EQUAL:
						moneyTextView.clickEqual();
						break;
				}
			}
		});

		moneySKView.setMoneySKGlobalActionListener(new MoneySKView.MoneySKGlobalActionListener() {
			@Override
			public void clickGlobalAction(MoneySKView.GlobalActionType globalActionType) {
				switch (globalActionType) {
					case OK:
						break;
					case CURRENCY:
						break;
				}
			}
		});
	}
}
