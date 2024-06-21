package com.allen.Application;

import com.allen.Application.model.Deal;
import com.allen.Application.repository.DealRepository;
import com.allen.Application.repository.DealRepositoryImpl;
import com.allen.Application.repository.UserRepository;
import com.allen.Application.repository.UserRepositoryImpl;
import com.allen.Application.service.DealService;
import com.allen.Application.service.DealServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		DealRepository dealRepository = new DealRepositoryImpl();
		UserRepository userRepository = new UserRepositoryImpl();
		DealService dealService = new DealServiceImpl(dealRepository,userRepository);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Add a Deal");
			System.out.println("2.View a Deal");
			System.out.println("3.Claim a Deal");
			System.out.println("4.Update Deal Status");
			System.out.println("5.Update Deal");
			System.out.println("6.Exit");
			int choice = sc.nextInt();
			if(choice==1) {
				System.out.println("Enter deal id");
				int id = sc.nextInt();
				System.out.println("Enter product id");
				int productId = sc.nextInt();
				System.out.println("Enter quantity");
				int quantity = sc.nextInt();
				System.out.println("Enter isActive");
				boolean isActive = sc.nextBoolean();
				System.out.println("Enter start time");
				int start = sc.nextInt();
				System.out.println("Enter end time");
				int end = sc.nextInt();
				dealService.addDeal(new Deal(id,productId,quantity,isActive,start,end));
			} else if(choice==2) {
				System.out.println("Enter deal id");
				int id = sc.nextInt();
				dealService.getDeal(id);
			} else if(choice==3) {
				System.out.println("Enter user id");
				int userId = sc.nextInt();
				System.out.println("Enter deal id");
				int dealId = sc.nextInt();
				dealService.claimDeal(userId,dealId);
			} else if(choice==4) {
				System.out.println("Enter deal id");
				int id = sc.nextInt();
				System.out.println("Enter deal status");
				boolean status = sc.nextBoolean();
				dealService.updateDealStatus(id, status);
			} else if(choice==5) {
				System.out.println("Enter deal id");
				int id = sc.nextInt();
				System.out.println("Enter deal status");
				boolean status = sc.nextBoolean();
				System.out.println("Enter deal product id");
				int productId = sc.nextInt();
				System.out.println("Enter deal quantity");
				int quantity = sc.nextInt();
				System.out.println("Enter start time");
				int start = sc.nextInt();
				System.out.println("Enter end time");
				int end = sc.nextInt();
				dealService.updateDeal(new Deal(id,productId,quantity,status,start,end));
			} else if(choice==6) {
				System.exit(0);
			} else {
				System.out.println("Invalid Input");
			}
		}
//		SpringApplication.run(Application.class, args);
	}

}
