package malaria.com.malaria.activities.results;

import android.os.Bundle;

import malaria.com.malaria.R;
import malaria.com.malaria.activities.base.BaseActivity;
import malaria.com.malaria.dagger.MalariaComponent;

public class ResultsActivity extends BaseActivity {
    public ResultsActivity() {
        super(R.layout.activity_results);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onInject(MalariaComponent applicationComponent) {
        applicationComponent.inject(this);
    }
}
