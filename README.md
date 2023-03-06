
# DialogX 
[![](https://jitpack.io/v/pixAndroid/DialogX.svg)](https://jitpack.io/#pixAndroid/DialogX)


Easy to create a custom dialog box using this library.


## Implementation

#### Step 1. Add the JitPack repository to your build.gradle file

```bash
    allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }
```
#### Step 2. Add the dependency

```bash
	dependencies {
	        implementation 'com.github.pixAndroid:DialogX:1.0'
	}
```

## Create a custom dialog
```bash
      new DialogX()
                .setTitle("Processing ..")
                .setDescription("Please do not close this window")
                .setTitleTextColor(R.color.purple_500)
                .setDescriptionTextColor(R.color.teal_200)
                .setProgressColorHex(R.color.purple_500)
                .showBottomLoading(MainActivity.this, true);
                
                //Close a shown Dialog Window
                DialogX.dismiss();
```

## Badges

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)


