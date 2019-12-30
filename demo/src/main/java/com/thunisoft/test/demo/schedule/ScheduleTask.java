/**
 * @projectName demo
 * @package com.thunisoft.test.demo.schedule
 * @className com.thunisoft.test.demo.schedule.ScheduleTask
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.test.demo.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ScheduleTask
 *
 * @description TODO
 * @author zouweilin
 * @date 2019/12/20 17:14
 * @version TODO
 */
@Component
public class ScheduleTask {

    private static final Logger logger = LoggerFactory.getLogger(ScheduleTask.class);

    @Scheduled(cron = "0 15 10 * * ?")
    public void task(){
        logger.info("每天上午10:15分执行...");
    }
}
