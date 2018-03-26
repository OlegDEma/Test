package com.test.test;

import com.test.test.Model.PostTrucks;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

    static List<PostTrucks> list = new ArrayList<PostTrucks>();

    public static List<PostTrucks> getList() {
        return list;
    }

    public PostTrucks getModel(int rate,boolean f,String source,Date age,Date avail,String truck,String truckO,int dhO,String fP,String origin,int trip,String destination,int dhD,String truckD,double length,double weight,String company,long phone){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 30);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        PostTrucks postTrucks = new PostTrucks(rate,f,source,age,avail,truck,truckO,dhO,fP,origin,trip,destination,dhD,truckD,length,weight,company,phone);
        return postTrucks;
    }

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 30);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        list.add(getModel(3150,true,"DAT",c.getTime(),c.getTime(),"V","Belwood",371,"F","Erie",422,"Sealy",52,"a",43,52,"casda",312031203));
        list.add(getModel(3152,false,"DA",c.getTime(),c.getTime(),"M","Other",374,"P","Halk",42,"New",44,"b",50,60,"dasca",635676303));
        list.add(getModel(3154,true,"DAT",c.getTime(),c.getTime(),"X","Lviv",370,"D","Pablo",351,"Vegas",31,"c",55,10,"asca",52256252));



	}
}
