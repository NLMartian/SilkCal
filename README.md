# SilkCal
Android calendar view inspired by Sunrise calendar and iOS7 stock calendar.

<img src="https://github.com/NLMartian/SilkCal/raw/master/images/screenshot.gif" width="360">

Usage
-----

1. Add `compile 'me.nlmartian.silkcal:library:0.1.1'` to your dependencies.
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

### Acknowledgements

Thanks to [Robin Chutaux](https://github.com/traex) for his [CalendarListview](https://github.com/traex/CalendarListview).

### MIT License

```
    The MIT License (MIT)
    
    Copyright (c) 2014 Robin Chutaux
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
```
