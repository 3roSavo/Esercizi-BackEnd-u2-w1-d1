package savogineros.EserciziBackEndu2w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import savogineros.EserciziBackEndu2w1d1.entities.Menu;
import savogineros.EserciziBackEndu2w1d1.entities.Pizza;
import savogineros.EserciziBackEndu2w1d1.entities.Topping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EserciziBackEndU2W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(EserciziBackEndU2W1D1Application.class, args);

		// METODO VECCHIO
		/*Topping salame = new Topping(34,1.0,"salame");
		Topping prosciutto = new Topping(44,0.50, "prosciutto");
		Pizza pizza = new Pizza("Margherita", Arrays.asList(salame, prosciutto));
		//System.out.println(pizza);
		*/

		// METODO COI BEANS
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EserciziBackEndU2W1D1Application.class);

		System.out.println(ctx.getBean("pizzaMargherita"));
		System.out.println(ctx.getBean("pizzaAsiago"));
		System.out.println(ctx.getBean("pizzaProsciuttoEFunghi"));
		System.out.println(ctx.getBean("pizzaSalsicciaEPatatine"));
		System.out.println(ctx.getBean("drinkCocaCola"));
		System.out.println(ctx.getBean("drinkAranciata"));
		System.out.println(ctx.getBean("toppingPatatine"));
		System.out.println(ctx.getBean("toppingSalsiccia"));
		Menu menu = (Menu) ctx.getBean("menu");
		menu.printMenu();


	}

}
