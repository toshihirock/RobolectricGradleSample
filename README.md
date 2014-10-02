RobolectricGradleSample
=======================

EclipseでRobolectricを使ってビルドする時のサンプル

## 前提

+ ADT Plugin for Eclipseがインストールされていること
+ Gradleがインストールされいてること(2.1での動作を確認)
+ Android Support Repositoryがインストールされていること
+ ビルド対象のAndoroidSDKバージョンがインストールされていること。（本サンプルではSDK17)もし、異なる場合にはbuild.graldeの**compileSdkVersion**を変更すること
+ 対象のAndoridSDKBuild-toolsがインストールされていること。（本サンプルではSDK20.0.0)もし、異なる場合にはbuild.graldeの**compileSdkVersion**を変更すること
+ 環境変数ANDROID_HOMEが設定されていること
+ テストメソッド名を日本語にしているのでGradle実行時の文字コードはUTF-8とすること

## 実行

```bash
git clone https://github.com/toshihirock/RobolectricGradleSample.git
gradle clean test
```

## Eclipseでの注意

+ Robolectricの公式サイトだと**Browse to and select “…/MyProject/test”**という記載があるが、本構成の場合**“…/MyProject/test/java”**
として取り込む事。

## 参考

+ [robolectric-gradle-plugin](https://github.com/robolectric/robolectric-gradle-plugin)
+ [deckard-gradle](https://github.com/robolectric/deckard-gradle)
+ [Robolectric](http://robolectric.org/)
