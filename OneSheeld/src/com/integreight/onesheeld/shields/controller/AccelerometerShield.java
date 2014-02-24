package com.integreight.onesheeld.shields.controller;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.Log;

import com.integreight.firmatabluetooth.ShieldFrame;
import com.integreight.onesheeld.enums.UIShield;
import com.integreight.onesheeld.utils.ControllerParent;

public class AccelerometerShield extends ControllerParent<AccelerometerShield>
		implements SensorEventListener {
	public static final byte ACCELEROMETER_VALUE=0x01;
	private SensorManager mSensorManager;
	private Sensor mAccelerometer;
	private AccelerometerEventHandler eventHandler;
	private ShieldFrame frame;
	Handler handler;
	int PERIOD = 1000;
	boolean flag = false;
	boolean isHandlerLive = false;

	private final Runnable processSensors = new Runnable() {
		@Override
		public void run() {
			// Do work with the sensor values.

			flag = true;
			// The Runnable is posted to run again here:
			handler.postDelayed(this, PERIOD);
		}
	};

	public AccelerometerShield() {
	}

	public AccelerometerShield(Activity activity, String tag) {
		super(activity, tag);
	}

	@Override
	public ControllerParent<AccelerometerShield> setTag(String tag) {
		mSensorManager = (SensorManager) getApplication().getSystemService(
				Context.SENSOR_SERVICE);
		mAccelerometer = mSensorManager
				.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

		return super.setTag(tag);
	}

	public void setAccelerometerEventHandler(
			AccelerometerEventHandler eventHandler) {
		this.eventHandler = eventHandler;
		CommitInstanceTotable();
	}

	@Override
	public void onNewShieldFrameReceived(ShieldFrame frame) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		
		if (flag) {
			// TODO Auto-generated method stub
			frame = new ShieldFrame(UIShield.ACCELEROMETER_SHIELD.getId(), ACCELEROMETER_VALUE);
			// frame.addByteArgument((byte) Math.round(event.values[0]));
			frame.addFloatArgument(event.values[0]);
			frame.addFloatArgument(event.values[1]);
			frame.addFloatArgument(event.values[2]);
			activity.getThisApplication().getAppFirmata()
					.sendShieldFrame(frame);

			eventHandler.onSensorValueChangedFloat(event.values);

			Log.d("Sensor Data of X", event.values[0] + "");
			Log.d("Sensor Data of Y", event.values[1] + "");
			Log.d("Sensor Data of Z", event.values[2] + "");
			//
			flag = false;
		}

	}

	// Register a listener for the sensor.
	public void registerSensorListener() {
		if (mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {
			// Success! There's sensor.
			if (!isHandlerLive) {
				handler = new Handler();
				mSensorManager.registerListener(this, mAccelerometer,
						SensorManager.SENSOR_DELAY_NORMAL);
				handler.post(processSensors);
				eventHandler.isDeviceHasSensor(true);
				isHandlerLive = true;
			} else {
				Log.d("Your Sensor is registered", "Accelerometer");
			}
		} else {
			// Failure! No sensor.
			Log.d("Device dos't have Sensor ", "Accelerometer");
			eventHandler.isDeviceHasSensor(false);

		}
	}

	// Unregister a listener for the sensor .
	public void unegisterSensorListener() {
		// mSensorManager.unregisterListener(this);
		if (mSensorManager != null && handler != null && mAccelerometer != null) {

			mSensorManager.unregisterListener(this, mAccelerometer);
			mSensorManager.unregisterListener(this);
			handler.removeCallbacks(processSensors);
			handler.removeCallbacksAndMessages(null);
			isHandlerLive = false;
		}
	}

	public static interface AccelerometerEventHandler {

		void onSensorValueChangedFloat(float[] value);

		void isDeviceHasSensor(Boolean hasSensor);

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.unegisterSensorListener();

	}

}
