import 'package:flutter/services.dart';

//Programado por HeroRickyGames

class IsDebug {
  static const platform = MethodChannel('com.hrs.flutter./debugverify');

  static Future<bool> getNativeIsDebugOrNot() async {

    return await platform.invokeMethod('verifyIsDebug');

  }
}