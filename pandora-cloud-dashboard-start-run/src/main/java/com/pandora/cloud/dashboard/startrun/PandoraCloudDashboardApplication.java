package com.pandora.cloud.dashboard.startrun;

import com.pandora.cloud.common.schedule.annotation.EnablePandoraCloudJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>封装Qicloud项目PandoraCloudDashboardApplication类.<br></p>
 * <p>//TODO...<br></p>
 *
 * @author Powered by marklin 2021-05-03 01:59
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@SpringBootApplication
@EnablePandoraCloudJob
public class PandoraCloudDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(PandoraCloudDashboardApplication.class, args);
    }
}
