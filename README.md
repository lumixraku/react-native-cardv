
# react-native-cardv

## How to generate it ?

Read this

https://medium.com/wix-engineering/creating-a-native-module-in-react-native-93bab0123e46

https://www.jianshu.com/p/091a68ea1ca7

这个package 就是用上面blog 中提到的 `react-native-create-library` 创建的


[官方文档](https://reactnative.dev/docs/native-modules-setup) 中说使用 `create-react-native-module`
但是我用这个命令创建出来的第三方包存在 HMR 报错问题.



## How to develop ?

本地调试时, 在你的RN 项目中引用你的第三方包
```
yarn add /usr/....YOUR_LOCAL_REPO_PATH
```

之后 node_modules 下就有这个包了




仍然需要手动 link

`$ react-native link react-native-cardv`









### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-cardv` and add `RNCardv.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNCardv.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.raku.cardv.RNCardvPackage;` to the imports at the top of the file
  - Add `new RNCardvPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-cardv'
  	project(':react-native-cardv').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-cardv/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-cardv')
  	```


## Usage
```javascript
import RNCardv from 'react-native-cardv';

// TODO: What to do with the module?
RNCardv;
```


## Trouble Shooting

### Gradle version 2.2 is required. Current version is 4.4 Error

https://stackoverflow.com/questions/52273360/gradle-version-2-2-is-required-current-version-is-4-4-error?rq=1

### Could not find com.android.tools.build:gradle:3.0.0-alpha1
https://stackoverflow.com/questions/44071080/could-not-find-com-android-tools-buildgradle3-0-0-alpha1-in-circle-ci