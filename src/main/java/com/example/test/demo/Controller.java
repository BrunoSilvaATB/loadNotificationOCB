package com.example.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {

    @Autowired
    NotificationRepository notificationRepository;

    @RequestMapping(value = "/loadNotification", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    void notification(@RequestBody String test){
        ModelAndView mav = new ModelAndView();
        Notification testMessage = new Notification();
        testMessage.setNotificationMessage(test);
        notificationRepository.save(testMessage);
    }

}

