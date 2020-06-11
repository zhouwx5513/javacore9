package com.zhouwx.springboot_test.async;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MyScheduler {

    @Scheduled(fixedRate = 2000)
    public  void runJobA(){






        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("【线程调度A】"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Scheduled(cron = "* * * * * ?")
    public  void runJobB(){
        System.err.println("【线程调度B】"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }




}
