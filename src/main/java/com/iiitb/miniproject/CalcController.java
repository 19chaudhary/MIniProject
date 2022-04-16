package com.iiitb.miniproject;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@RestController
public class CalcController {
     Logger logger = LogManager.getLogger("CalcController");
    @RequestMapping(value = "/getpower",method = RequestMethod.POST)
    public double getPower(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        double input2 = Double.parseDouble((String) payload.get("input2"));
        res = Math.pow(input1,input2);
        logger.info("[POWER] - INPUT:" + input1+"^"+input2+" , OUTPUT:" + res);
        return res  ;
    }
    @RequestMapping(value = "/getsqrt",method = RequestMethod.POST)
    public double getSqrt(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        res = Math.sqrt(input1) ;
        logger.info("[SQRT] - INPUT:" + input1 + " , OUTPUT:" + res);
        return res  ;
    }
    @RequestMapping(value = "/getfact",method = RequestMethod.POST)
    public double getFact(@RequestBody Map<String,Object> payload){
        double res= 1;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        for(double i=1;i<=input1;i++)
            res = res*i;

        logger.info("[FACT] - INPUT:" + input1 + " , OUTPUT:" + res);
        return res;
    }
    @RequestMapping(value = "/getlog",method = RequestMethod.POST)
    public double getLog(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        res = Math.log(input1);
        logger.info("[LOG] - INPUT:" + input1 + " , OUTPUT:" + res);
        return res  ;
    }
}
