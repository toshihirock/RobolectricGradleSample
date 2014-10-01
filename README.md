RobolectricGradleSample
=======================

EclipseでRobolectricを使ってビルドする時のサンプル

## 前提

+ ADT Plugin for Eclipseがインストールされている事。
+ Gradle1.10がインストールされいてるこ事。
+ Android Support Repositoryがインストールされている事。
+ ビルド対象のAndoroidSDKバージョンがインストールされていること。（本サンプルではSDK17)もし、異なる場合にはbuild.graldeの**compileSdkVersion**を変更する事。
+ 対象のAndoridSDKBiild-toolsがインストールされていること。（本サンプルではSDK20.0.0)もし、異なる場合にはbuild.graldeの**compileSdkVersion**を変更する事。

## 実行

```bash
gradle clean test
```

## Eclipseでの注意

+ Robolectricの公式サイトだと**Browse to and select “…/MyProject/test”**という記載があるが、本構成の場合**Browse to and select “…/MyProject/test/java”**
として取り込む事。