package com.rohit.fragmentstability;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentA extends Fragment {

	private static final String TAG = FragmentA.class.getSimpleName();

	private Button button;
	private TextView textView;

	int score;

	@Override
	public void onAttach(Context context) {
		super.onAttach(context);
		Log.i(TAG, "onAttach()");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (savedInstanceState != null) {
			score = savedInstanceState.getInt("score_key", 0);
		}

		Toast.makeText(getActivity(), "Score value : " + score, Toast.LENGTH_SHORT).show();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_a, container, false);

		Log.i(TAG, "onCreateView()");

		button = (Button) view.findViewById(R.id.button);
		textView = (TextView) view.findViewById(R.id.textView);

		if (savedInstanceState != null) {
			textView.setText(savedInstanceState.getString("txv_key"));
			button.setText(savedInstanceState.getString("btn_key"));
		}

		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				textView.setText("Dummy Text");
				button.setText("LOGOUT");

				score = 47;
				Toast.makeText(getActivity(), "Score value : " + score, Toast.LENGTH_LONG).show();
			}
		});

		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.i(TAG, "onActivityCreated()");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.i(TAG, "onStart()");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.i(TAG, "onResume()");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.i(TAG, "onPause()");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i(TAG, "onSaveInstanceState()");

		outState.putInt("score_key", score);
		outState.putString("txv_key", textView.getText().toString());
		outState.putString("btn_key", button.getText().toString());
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.i(TAG, "onStop()");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.i(TAG, "onDestroyView()");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "onDestroy()");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.i(TAG, "onDetach()");
	}
}
