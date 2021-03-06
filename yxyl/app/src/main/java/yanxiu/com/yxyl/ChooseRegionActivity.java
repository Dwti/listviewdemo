package yanxiu.com.yxyl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

import yanxiu.com.adapter.CityAdapter;
import yanxiu.com.adapter.RegionItem;
import yanxiu.com.adapter.RegionItemAdapter;

public class ChooseRegionActivity extends AppCompatActivity {
    private List<RegionItem> yxylRegions=new ArrayList<>();
    private List<RegionItem> citys=new ArrayList<>();
    private List<RegionItem> countys=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_region);
        initRegionsProvice();
        RegionItemAdapter yxylRegionsAdapter=new RegionItemAdapter(this,R.layout.provinceitem,yxylRegions);

        /*CityAdapter cityAdapte=new CityAdapter(this,R.layout.cityitem,citys);*/
        ListView listView=(ListView)findViewById(R.id.ls_list_province_item);
        ListView listView1=(ListView)findViewById(R.id.ls_list_city_item);
        ListView listView2=(ListView)findViewById(R.id.ls_list_county_item);
        listView.setAdapter(yxylRegionsAdapter);


        initRegionsCity();
    }
    ListView listView=(ListView)findViewById(R.id.ls_list_province_item);


    private AdapterView.OnItemClickListener clickListener=new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent();
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

        }
    };


 /*   public void chooseSchool(View view){
        Intent intent=new Intent(this,ChooseSchool.class);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }*/
    //初始化数据
   private void initRegionsProvice() {
       int i = 0;
       /*RegionItem  sichuan=new RegionItem("四川","绵阳市","三台县");
       yxylRegions.add(sichuan);
       RegionItem  chongqing=new RegionItem("重庆","北碚区","市辖区");
       yxylRegions.add(chongqing);
       RegionItem  beijing=new RegionItem("北京","北京","西城区");
       yxylRegions.add(beijing);*/
       for (; i < 9; i++) {
           RegionItem sichuan = new RegionItem("四川");
           yxylRegions.add(sichuan);
           RegionItem chongqing = new RegionItem("重庆");
           yxylRegions.add(chongqing);
           RegionItem beijing = new RegionItem("北京");
           yxylRegions.add(beijing);


       }
   }
    private void initRegionsCity(){
        int i=0;
       /*RegionItem  sichuan=new RegionItem("四川","绵阳市","三台县");
       yxylRegions.add(sichuan);
       RegionItem  chongqing=new RegionItem("重庆","北碚区","市辖区");
       yxylRegions.add(chongqing);
       RegionItem  beijing=new RegionItem("北京","北京","西城区");
       yxylRegions.add(beijing);*/
        for(;i<9;i++){
            RegionItem  sichuan=new RegionItem("成都");
            yxylRegions.add(sichuan);
            RegionItem  chongqing=new RegionItem("重庆");
            yxylRegions.add(chongqing);
            RegionItem  beijing=new RegionItem("北京");
            yxylRegions.add(beijing);


        }


    }

}
