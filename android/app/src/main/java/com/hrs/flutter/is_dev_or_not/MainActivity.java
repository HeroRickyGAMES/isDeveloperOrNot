package com.hrs.flutter.is_dev_or_not;

import io.flutter.embedding.android.FlutterActivity;
import android.os.Build;
import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;

public class MainActivity extends FlutterActivity {
    private static final String CHANNEL = "com.hrs.flutter./debugverify";

    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine){
        super.configureFlutterEngine(flutterEngine);

        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {
                            if(call.method.equals("verifyIsDebug")){

                                if (BuildConfig.DEBUG) {
                                    result.success(true);
                                } else {
                                    result.success(false);
                                }

                            }else{
                                result.error("INDISPONIVEL", "O sistema não soube dizer se está em modo debug ou produção.", null);
                            }
                        }
                );
    }

}
