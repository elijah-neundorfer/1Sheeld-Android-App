package com.integreight.onesheeld.enums;

import java.util.ArrayList;
import java.util.List;

import com.integreight.onesheeld.R;
import com.integreight.onesheeld.shields.controller.AccelerometerShield;
import com.integreight.onesheeld.shields.controller.CameraShield;
import com.integreight.onesheeld.shields.controller.ClockShield;
import com.integreight.onesheeld.shields.controller.EmailShield;
import com.integreight.onesheeld.shields.controller.EmptyShield;
import com.integreight.onesheeld.shields.controller.FacebookShield;
import com.integreight.onesheeld.shields.controller.FoursquareShield;
import com.integreight.onesheeld.shields.controller.GamepadShield;
import com.integreight.onesheeld.shields.controller.GpsShield;
import com.integreight.onesheeld.shields.controller.GravityShield;
import com.integreight.onesheeld.shields.controller.GyroscopeShield;
import com.integreight.onesheeld.shields.controller.KeyboardShield;
import com.integreight.onesheeld.shields.controller.KeypadShield;
import com.integreight.onesheeld.shields.controller.LcdShield;
import com.integreight.onesheeld.shields.controller.LedShield;
import com.integreight.onesheeld.shields.controller.LightShield;
import com.integreight.onesheeld.shields.controller.MagnetometerShield;
import com.integreight.onesheeld.shields.controller.MicShield;
import com.integreight.onesheeld.shields.controller.MusicShield;
import com.integreight.onesheeld.shields.controller.NotificationShield;
import com.integreight.onesheeld.shields.controller.OrientationShield;
import com.integreight.onesheeld.shields.controller.PhoneShield;
import com.integreight.onesheeld.shields.controller.PressureShield;
import com.integreight.onesheeld.shields.controller.ProximityShield;
import com.integreight.onesheeld.shields.controller.PushButtonShield;
import com.integreight.onesheeld.shields.controller.SevenSegmentShield;
import com.integreight.onesheeld.shields.controller.SkypeShield;
import com.integreight.onesheeld.shields.controller.SliderShield;
import com.integreight.onesheeld.shields.controller.SmsShield;
import com.integreight.onesheeld.shields.controller.SpeakerShield;
import com.integreight.onesheeld.shields.controller.TemperatureShield;
import com.integreight.onesheeld.shields.controller.ToggleButtonShield;
import com.integreight.onesheeld.shields.controller.TwitterShield;
import com.integreight.onesheeld.utils.ControllerParent;

public enum UIShield {

	LED_SHIELD((byte) 0x02, "LED", 0xff03d203,
			R.drawable.shields_list_led_symbol, false, LedShield.class), NOTIFICATION_SHIELD(
			(byte) 0x06, "Notification", 0xffd4d903,
			R.drawable.shields_list_notifications_symbol, false,
			NotificationShield.class), SEVENSEGMENT_SHIELD((byte) 0x07,
			"Seven Segment", 0xffe28203,
			R.drawable.shields_list_seven_segment_symbol, false,
			SevenSegmentShield.class), BUZZER_SHIELD((byte) 0x08, "Buzzer",
			0xffe93f03, R.drawable.shields_list_buzzer_symbol, false,
			SpeakerShield.class), MIC_SHIELD((byte) 0x18, "Mic", 0xff0362c0,
			R.drawable.shields_list_mic_symbol, false, MicShield.class), KEYPAD_SHIELD(
			(byte) 0x09, "Keypad", 0xff03c0ae,
			R.drawable.shields_list_keypad_symbol, false, KeypadShield.class), SLIDER_SHIELD(
			(byte) 0x01, "Sliders", 0xffc0034c,
			R.drawable.shields_list_slider_symbol, false, SliderShield.class), LCD_SHIELD(
			(byte) 0x17, "LCD", 0xff99bd03, R.drawable.shields_list_lcd_symbol,
			false, LcdShield.class, false), MAGNETOMETER_SHIELD((byte) 0x0A,
			"Magnetometer", 0xff40039f,
			R.drawable.shields_list_magnetometer_symbol, false,
			MagnetometerShield.class), PUSHBUTTON_SHIELD((byte) 0x03,
			"Push Button", 0xffb97547,
			R.drawable.shields_list_push_button_symbol, false,
			PushButtonShield.class), TOGGLEBUTTON_SHIELD((byte) 0x04,
			"On/Off Button", 0xffc0039d,
			R.drawable.shields_list_push_button_symbol, false,
			ToggleButtonShield.class), ACCELEROMETER_SHIELD((byte) 0x0B,
			"Accelerometer", 0xff266a5d,
			R.drawable.shields_list_accelerometer_symbol, false,
			AccelerometerShield.class), FACEBOOK_SHIELD((byte) 0x19,
			"Facebook", 0xff039dc0, R.drawable.shields_list_facebook_symbol,
			false, FacebookShield.class), TWITTER_SHIELD((byte) 0x1A,
			"Twitter", 0xffa14c4c, R.drawable.shields_list_twitter_symbol,
			false, TwitterShield.class), GAMEDPAD_SHIELD((byte) 0x0C,
			"Game Pad", 0xff658f08, R.drawable.shields_list_gamepad_symbol,
			false, GamepadShield.class), FOURSQUARE_SHIELD((byte) 0x1B,
			"Foursquare", 0xff061179,
			R.drawable.shields_list_foursquare_symbol, false,
			FoursquareShield.class), GPS_SHIELD((byte) 0x1C, "GPS", 0xffa10b07,
			R.drawable.shields_list_gps_symbol, false, GpsShield.class), SMS_SHIELD(
			(byte) 0x0D, "SMS", 0xffdb7f40, R.drawable.shields_list_sms_symbol,
			false, SmsShield.class), MUSICPLAYER_SHIELD((byte) 0x1D,
			"Music Player", 0xffb950e9,
			R.drawable.shields_list_musicplayer_symbol, false,
			MusicShield.class), GYROSCOPE_SHIELD((byte) 0x0E, "Gyroscope",
			0xff4c84e9, R.drawable.shields_list_gyroscope_symbol, false,
			GyroscopeShield.class), FLASHLIGHT_SHIELD((byte) 0x05,
			"Flashlight", 0xff0b4c8d,
			R.drawable.shields_list_flashlight_symbol, false,
			EmptyShield.class, false), SKYPE_SHIELD((byte) 0x1F, "Skype",
			0xff08c473, R.drawable.shields_list_skype_symbol, false,
			SkypeShield.class), PROXIMITY_SHIELD((byte) 0x13, "Proximity",
			0xff543c8d, R.drawable.shields_list_proximity_symbol, false,
			ProximityShield.class), GRAVITY_SHIELD((byte) 0x14, "Gravity",
			0xffd95342, R.drawable.shields_list_gravity_symbol, false,
			GravityShield.class), ORIENTATION_SHIELD((byte) 0x0F,
			"Orientation", 0xff58844f,
			R.drawable.shields_list_orientation_symbol, false,
			OrientationShield.class), LIGHT_SHIELD((byte) 0x10, "Light",
			0xff8b268d, R.drawable.shields_list_light_sensor_symbol, false,
			LightShield.class), PRESSURE_SHIELD((byte) 0x11, "Pressure",
			0xff67584d, R.drawable.shields_list_pressure_symbol, false,
			PressureShield.class), TEMPERATURE_SHIELD((byte) 0x12,
			"Temperature", 0xff999f45,
			R.drawable.shields_list_temperature_symbol, false,
			TemperatureShield.class), CAMERA_SHIELD((byte) 0x15, "Camera",
			0xff6d0347, R.drawable.shields_list_camera_symbol, false,
			CameraShield.class), PHONE_SHIELD((byte) 0x20, "Phone", 0xffe9bd03,
			R.drawable.shields_list_email_symbol, false, PhoneShield.class), NFC(
			(byte) 0x20, "NFC", 0xff127303, R.drawable.shields_list_nfc_symbol,
			false, EmptyShield.class, false), WIFI((byte) 0x20, "WIFI",
			0xff08bbb2, R.drawable.shields_list_wifi_symbol, false,
			EmptyShield.class, false), GSM((byte) 0x20, "GSM", 0xff5a0303,
			R.drawable.shields_list_gsm_symbol, false, EmptyShield.class, false), GLCD(
			(byte) 0x20, "GLCD", 0xff988564,
			R.drawable.shields_list_lcd_symbol, false, EmptyShield.class, false), EMAIL_SHIELD(
			(byte) 0x1E, "Email", 0xffd95342,
			R.drawable.shields_list_gravity_symbol, false, EmailShield.class), CLOCK_SHIELD(
			(byte) 0x21, "Clock", 0xffd95342,
			R.drawable.shields_list_gravity_symbol, false, ClockShield.class), KEYBOARD_SHIELD(
			(byte) 0x21, "Keyboard", 0xffd95342,
			R.drawable.shields_list_gravity_symbol, false,
			KeyboardShield.class);

	private byte id;
	private String name;
	private int itemBackgroundColor;
	private int symbolId;
	private boolean mainActivitySelection;
	private static UIShield shieldsActivitySelection;
	private static boolean isConnected = false;
	private boolean isReleasable = true;
	private Class<? extends ControllerParent<?>> shieldType;

	public int getSymbolId() {
		return symbolId;
	}

	public boolean isReleasable() {
		return isReleasable;
	}

	// public int getMainBWImageStripId() {
	// return mainBWImageStripId;
	// }
	public Boolean isMainActivitySelection() {
		return mainActivitySelection;
	}

	public static UIShield getShieldsActivitySelection() {
		return shieldsActivitySelection;
	}

	public static void setShieldsActivitySelection(UIShield selection) {
		shieldsActivitySelection = selection;
	}

	public void setMainActivitySelection(boolean toggleStatus) {
		this.mainActivitySelection = toggleStatus;
	}

	public int getItemBackgroundColor() {
		return itemBackgroundColor;
	}

	public String getName() {
		return name;
	}

	public Class<? extends ControllerParent<?>> getShieldType() {
		return shieldType;
	}

	public void setShieldType(Class<? extends ControllerParent<?>> shieldType) {
		this.shieldType = shieldType;
	}

	private UIShield(byte id, String name, int mainImageStripId, int symbolId,
			boolean mainActivitySelection,
			Class<? extends ControllerParent<?>> shieldType) {
		this.id = id;
		this.name = name;
		this.itemBackgroundColor = mainImageStripId;
		this.symbolId = symbolId;
		this.mainActivitySelection = mainActivitySelection;
		this.shieldType = shieldType;
	}

	private UIShield(byte id, String name, int mainImageStripId, int symbolId,
			boolean mainActivitySelection,
			Class<? extends ControllerParent<?>> shieldType,
			boolean isReleasable) {
		this.id = id;
		this.name = name;
		this.itemBackgroundColor = mainImageStripId;
		this.symbolId = symbolId;
		this.mainActivitySelection = mainActivitySelection;
		this.shieldType = shieldType;
		this.isReleasable = isReleasable;
	}

	public byte getId() {
		return id;
	}

	public static UIShield getPosition(int id) {
		switch (id) {
		case 1:
			return LED_SHIELD;
		case 2:
			return NOTIFICATION_SHIELD;
		case 3:
			return SEVENSEGMENT_SHIELD;
		case 4:
			return BUZZER_SHIELD;
		case 5:
			return MIC_SHIELD;
		case 6:
			return KEYPAD_SHIELD;
		case 7:
			return SLIDER_SHIELD;
		case 8:
			return LCD_SHIELD;
		case 9:
			return MAGNETOMETER_SHIELD;
		case 10:
			return PUSHBUTTON_SHIELD;
		case 11:
			return TOGGLEBUTTON_SHIELD;
		case 12:
			return ACCELEROMETER_SHIELD;
		case 13:
			return FACEBOOK_SHIELD;
		case 14:
			return TWITTER_SHIELD;
		case 15:
			return GAMEDPAD_SHIELD;
		case 16:
			return FOURSQUARE_SHIELD;
		case 17:
			return GPS_SHIELD;
		case 18:
			return SMS_SHIELD;
		case 19:
			return MUSICPLAYER_SHIELD;
		case 20:
			return GYROSCOPE_SHIELD;
		case 21:
			return FLASHLIGHT_SHIELD;
		case 22:
			return SKYPE_SHIELD;
		case 23:
			return PROXIMITY_SHIELD;
		case 24:
			return GRAVITY_SHIELD;
		case 25:
			return ORIENTATION_SHIELD;
		case 26:
			return LIGHT_SHIELD;
		case 27:
			return PRESSURE_SHIELD;
		case 28:
			return TEMPERATURE_SHIELD;
		case 29:
			return CAMERA_SHIELD;
		case 30:
			return PHONE_SHIELD;
		case 31:
			return NFC;
		case 32:
			return WIFI;
		case 33:
			return GSM;
		case 34:
			return GLCD;
		case 35:
			return EMAIL_SHIELD;
		case 36:
			return CLOCK_SHIELD;
		case 37:
			return KEYBOARD_SHIELD;
		}
		return null;
	}

	public static boolean isConnected() {
		return isConnected;
	}

	public static void setConnected(boolean isConnected) {
		UIShield.isConnected = isConnected;
	}

	public static List<UIShield> valuesFiltered() {
		UIShield[] vals = values();
		List<UIShield> valsFiltered = new ArrayList<UIShield>();
		for (int i = 0; i < vals.length; i++) {
			UIShield cur = vals[i];
			if (cur.isReleasable)
				valsFiltered.add(cur);
		}
		vals = null;
		return valsFiltered;
	}
}
