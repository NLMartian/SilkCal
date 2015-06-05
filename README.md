# SilkCal
Android calendar view inspired by Sunrise calendar and iOS7 stock calendar.

<img src="https://github.com/NLMartian/SilkCal/raw/master/images/screenshot.gif" width="360">

Usage
-----

1. Add `compile 'me.nlmartian.silkcal:silkcal:0.1.0'` to your dependencies.
2. Add jcenter to your repositories list like this:

```groovy
allprojects {
   repositories {
       jcenter()
   }
}
```

3. Add `DayPickerView` to your view hierarchy like this:

```xml
  <me.nlmartian.silkcal.DayPickerView
        xmlns:calendar="http://schemas.android.com/apk/res-auto"
        android:id="@+id/calendar_view"
        android:layout_width="match_parent"
        android:layout_height="260dp"
        android:background="@android:color/white"
        calendar:drawRoundRect="false"/>
```
