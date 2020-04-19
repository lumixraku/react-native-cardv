
package com.raku.cardv;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNCardvModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCardvModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCardv";
  }

  @ReactMethod
  public void show(String text) {
    ReactApplicationContext context = this.reactContext;
    Toast.makeText(context, text, Toast.LENGTH_LONG).show();
  }
}