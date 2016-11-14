package edu.iu.livepodcast.RestConterller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corundumstudio.socketio.*;
import com.corundumstudio.socketio.listener.DataListener;


/**
 * Created by Sujeet on 11/9/16.
 */

@Controller
public class homeController {

    SocketIOServer socketIOServer = null;

    @RequestMapping(value = "/livePodcast")
    public String connect(){


//        Configuration configuration = new Configuration();
//        configuration.setHostname("developers-iuhelp.herokuapp.com");
//        configuration.setPort(8085);
//
//        socketIOServer = new SocketIOServer(configuration);



        return "home";
    }
}
