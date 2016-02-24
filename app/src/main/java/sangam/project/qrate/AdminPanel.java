package sangam.project.qrate;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AdminPanel extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);
        listView = (ListView)findViewById(R.id.listView);

    }
    public class AsyncGetTrackStatusTask extends AsyncTask<Void,Void,Void> {
        ArrayList<String> trackName;
        ArrayList<Integer> unreadCount;
        @Override
        protected Void doInBackground(Void... voids) {

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            UnreadAdapter adapter = new UnreadAdapter(AdminPanel.this,R.layout.adapter_unread,trackName,unreadCount);
            listView.setAdapter(adapter);
        }
    }
}
