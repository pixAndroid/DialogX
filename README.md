
# DialogX 
[![](https://jitpack.io/v/pixAndroid/DialogX.svg)](https://jitpack.io/#pixAndroid/DialogX)


Easy to create a custom dialog box using this library.

### Project Requirements
distributionUrl=https\://services.gradle.org/distributions/gradle-7.5-bin.zip

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
	 implementation 'com.github.pixAndroid:DialogX:1.1'
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
                
                //Close the current window
                DialogX.dismiss();
```
## YES NO DIALOG
```bash
	new DialogX()
                .setTitle("Are you sure?")
                .setDescription("Please do not close this window if you are not sure.")
                .setTitleTextColor(R.color.purple_500)
                .setDescriptionTextColor(R.color.teal_200)
                .setProgressColorHex(R.color.purple_500)
                .setIconDrawable(R.drawable.ic_warning)
                .setYesNoClickListener(new DialogX.DialogXListener() {
                    @Override
                    public void onYesClicked() {
                        DialogX.dismiss();
                    }

                    @Override
                    public void onNoClicked() {
                        DialogX.dismiss();
                    }
                })
                .showBottomYesNoDialog(MainActivity.this, true);
```
## Badges

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)


