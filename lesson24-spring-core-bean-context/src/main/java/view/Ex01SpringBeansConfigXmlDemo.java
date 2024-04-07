package view;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bkit.java18.bean.Item;
import bkit.java18.bean.ItemGroup;
import bkit.java18.service.ClientService;

public class Ex01SpringBeansConfigXmlDemo {
	
	private static final String SPRING_BEANS_CONFIG = "01-spring-beans-config.xml";
	// private static final String SPRING_BEANS_COMPOSING = "02-spring-beans-composing.xml";
	
	public static void main(String[] args) {
		
		// B3. Initial Spring [IoC] Container -> 'context' is represented for container
		// ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(SPRING_BEANS_CONFIG, SPRING_BEANS_COMPOSING);
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(SPRING_BEANS_CONFIG);
		
		// Get beans in IoC container --> bean name -> <bean id=".." />
		String[] beans = context.getBeanDefinitionNames();
		Arrays.stream(beans).forEach(System.out::println);
		
		System.out.println("\n===========\n");
		
		// B4. Consume beans from IoC container
		ItemGroup itemGroupA = context.getBean("itemgroupa", ItemGroup.class);
		ItemGroup itemGroupB = context.getBean("itemgroupb", ItemGroup.class);
		
		System.out.println("item group a --> " + itemGroupA);
		System.out.println("item group b --> " + itemGroupB);
		
		Item itemB1 = context.getBean("itemb1", Item.class);
		System.out.println("item b1 --> " + itemB1);
		
		ClientService clientService = context.getBean("clientservice", ClientService.class);
		clientService.connect();
		
		System.out.println("\n====== Spring Bean Scope =====\n");
		ItemGroup itemGroupC1 = context.getBean("itemgroupc", ItemGroup.class);
		ItemGroup itemGroupC2 = context.getBean("itemgroupc", ItemGroup.class);
		
		System.out.println("hash(itemGroupC1) -> " + System.identityHashCode(itemGroupC1));
		System.out.println("hash(itemGroupC2) -> " + System.identityHashCode(itemGroupC2));
		
		ItemGroup itemGroupD1 = context.getBean("itemgroupd", ItemGroup.class);
		ItemGroup itemGroupD2 = context.getBean("itemgroupd", ItemGroup.class);
		
		System.out.println("hash(itemGroupD1) -> " + System.identityHashCode(itemGroupD1));
		System.out.println("hash(itemGroupD2) -> " + System.identityHashCode(itemGroupD2));
		
		// close connection IoC with XML configuration file
		context.close();
		
	}
	
}
