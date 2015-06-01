package me.nlmartian.silkcal.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.nlmartian.sample.DatePickerController;
import me.nlmartian.sample.DayPickerView;
import me.nlmartian.sample.SimpleMonthAdapter;

public class MainActivity extends AppCompatActivity implements DatePickerController {

    private DayPickerView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = (DayPickerView) findViewById(R.id.calendar_view);
        calendarView.setController(this);
    }

    @Override
    public int getMaxYear() {
        return 0;
    }

    @Override
    public void onDayOfMonthSelected(int year, int month, int day) {

    }

    @Override
    public void onDateRangeSelected(SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay> selectedDays) {

    }
}
