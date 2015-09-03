
package in.tanjo.versioncodeviewer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

/**
 * ショートカット対策で起動のみのActivity
 */
public class VersionCodeViewerMainActivity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        launchVersionCodeShowViewerActivity();
    }

    /**
     * VersionCodeShowViewerActivityを立ち上げる
     */
    private void launchVersionCodeShowViewerActivity() {
        Intent intent = new Intent(VersionCodeViewerMainActivity.this,
                                   VersionCodeShowViewerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
