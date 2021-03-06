package com.simongirard.sfgdi;

import com.simongirard.sfgdi.controllers.ConstructorInjectedController;
import com.simongirard.sfgdi.controllers.I18nController;
import com.simongirard.sfgdi.controllers.MyController;
import com.simongirard.sfgdi.controllers.PropertyInjectedController;
import com.simongirard.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());
	}

}
