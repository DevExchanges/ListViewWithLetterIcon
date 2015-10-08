package devexchanges.info.letterlistview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> stringArrayList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        setData();
        adapter = new ListViewAdapter(this, R.layout.item_listview, stringArrayList);
        listView.setAdapter(adapter);
    }

    private void setData() {
        stringArrayList = new ArrayList<>();
        stringArrayList.add("Quỳnh Trang");
        stringArrayList.add("Hoàng Biên");
        stringArrayList.add("Đức Tuấn");
        stringArrayList.add("Đặng Thành");
        stringArrayList.add("Xuân Lưu");
        stringArrayList.add("Phạm Thanh");
        stringArrayList.add("Kim Kiên");
        stringArrayList.add("Ngô Trang");
        stringArrayList.add("Thanh Ngân");
        stringArrayList.add("Nguyễn Dương");
        stringArrayList.add("Quốc Cường");
        stringArrayList.add("Trần Hà");
    }
}
