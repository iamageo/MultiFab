<h1 align="center">Multi Float Action Button</h1><br/>
<p align="center"> 
➕ An efficient and beaufitul Multi Float action button library based on Twitter implemented in Jetpack Compose 🚀
</p>

![banner_multifab](https://user-images.githubusercontent.com/26925002/187031958-a2aa51a4-9aee-4f6a-9066-644ddb91862c.png)

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
  <img alt="repo size" src="https://img.shields.io/github/repo-size/iamageo/MultiFab"/>
  <br/>
    <img alt="forks" src="https://img.shields.io/github/forks/iamageo/MultiFab?style=social"/>
    <img alt="stars" src="https://img.shields.io/github/stars/iamageo/MultiFab?style=social"/>


</p>

## Including in your project
[![](https://jitpack.io/v/iamageo/MultiFab.svg)](https://jitpack.io/#iamageo/MultiFab)

### Gradle
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
  implementation 'com.github.iamageo:MultiFab:{multifab-version}'
}
```

## Anatomy
![anatomy](https://user-images.githubusercontent.com/26925002/187083144-b87a3b3e-7eb0-4356-86b8-2ab8f80000bf.png)

> 1 - MultiFloatActionButton
  - FabIcon
  - FabOption
  - itemsMultiFab
  - onFabItemClicked
  - FabTitle
  - ShowFabTitle
  
> 2 - MultiFabItem

## Basic Usage
Add in you Activity file.

```kotlin
MultiFloatingActionButton(
    fabIcon = FabIcon(
        iconRes = R.drawable.ic_baseline_add_24,
        iconResAfterRotate = R.drawable.ic_baseline_remove_24,
        iconRotate = 180f
    ),
    fabOption = FabOption(
        iconTint = Color.White,
        showLabels = true,
        backgroundTint = Color.Blue,
    ),
    itemsMultiFab = listOf(
        MultiFabItem(
            icon = R.drawable.ic_baseline_add_24,
            label = "first",
            labelColor = Color.White
        ),
        MultiFabItem(
            icon = R.drawable.ic_baseline_add_24,
            label = "second",
            labelColor = Color.White
        ),
    ),
    onFabItemClicked = { println(it) },
    fabTitle = "MultiFloatActionButton",
    showFabTitle = false
 )
```
## Preview
![multifab](https://user-images.githubusercontent.com/26925002/187035337-b9f654b6-7e90-4395-bada-5c22aa681692.gif)

## Hacktoberfest 2022
This project has been submitted for hacktoberfest 2022. [See more here](https://hacktoberfest.com/)

## License
```
    Copyright 2022 Geovani Amaral

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

```
