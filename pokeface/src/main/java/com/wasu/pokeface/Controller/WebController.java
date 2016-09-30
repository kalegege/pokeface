package com.wasu.pokeface.Controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class WebController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
		Logger log= Logger.getLogger(WebController.class);
		log.info("大功告成，我的log写进my.log文件了！");
		System.out.println("two");
	}

}
