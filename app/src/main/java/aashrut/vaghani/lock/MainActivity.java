package aashrut.vaghani.lock;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 0;
    private ComponentName adminReceiver;
    private DevicePolicyManager dpm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dpm = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
        adminReceiver = new ComponentName(this, MainActivity.class);
        dpm.lockNow();
        finish();
    }
}