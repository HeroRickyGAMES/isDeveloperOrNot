import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';

//Programado por HeroRickyGames

class isDebuging {
  static const platform = MethodChannel('com.hrs.flutter./debugverify');

  static Future<bool> getNativeIsDebugOrNot() async {

    bool isDebug = false;

    try{
      isDebug = await platform.invokeMethod('verifyIsDebug');

    }catch(e){
      if (kDebugMode) {
        print('Ocorreu um erro $e');
      }
    }

    return await platform.invokeMethod('verifyIsDebug');
  }
}