package com.Adactin.testNg;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.mproject.ActualCode;
import com.Adactin.PomOfPom;

public class TestLogin extends ActualCode {

	   public static WebDriver driver=browser_Launch();
		 
		public static PomOfPom p=new PomOfPom(driver);
		
		@BeforeSuite
		private void launch() {
			implicitWait(10);
			url("https://adactinhotelapp.com/");
			sysout(driver.getTitle());
		}
	@Test(priority = -1)
		private void titleCheck() {
			String s="Adactin.com - Hotel Reservation System";
			String title = getTitle();
			Assert.assertEquals(title,s,"title not eqauls assert failed");
			System.out.println("Assert passed");
		}
		
	@Test(priority = 0)
		private void urlCheck() {
		String s1="https://adactinhotelapp.com/";
		String url = getCurrenturl();
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(url, s1, "Not eqauls");
		System.out.println("Title checkeds");
		sf.assertAll();
		}
	@Test(priority = 1)
		@DataProvider(name="Datas")
		private Object datas() {
		 return new Object[][]{
		{"ragupathi2000","327Q31"}};
		}
	
		@Test(dataProvider="Datas",priority = 2)
		private void login(String name,String pass) {
	    sendKeys(p.getL().getUsername(), name);
	    sendKeys(p.getL().getPassword(), pass);
	    click(p.getL().getLogin());
		}	
		
		@Test(priority = 3)
		private void Select_Location() {
			dropDown(p.getS().getSelect(),"text","Sydney");
		    sysout("location seleted");
		}@Test(priority = 4)
		private void Select_Hotel() {
			dropDown(p.getS().getSelect1(),"text","Hotel Creek");
			sysout("Hotel seleted");
		}@Test(priority = 5)
		private void Select_Room() {
			dropDown(p.getS().getSelect2(),"text","Standard");
			sysout("Room seleted");
		}@Test(priority = 6)
      		private void Select_NumberofRooms() {
				dropDown(p.getS().getSelect3(),"index","2");
				sysout("Number of room seleted");
			}@Test(priority = 7)
      		private void Select_CheckInDate() {
      			sendKeys(p.getS().getSelect4(),"14/09/2022");
      			sysout("Checkin date seleted");

			}@Test(priority = 8)
		
      		private void Select_CheckOutDate() {
      			sendKeys(p.getS().getSelect5(),"14/10/2022");
      			sysout("Checkoutdate seleted");
			}@Test(priority = 9)
      		private void Select_AdultsperRoom() {
      			dropDown(p.getS().getSelect6(),"index","2");
      			sysout("Adults room seleted");
			}
      		private void Select_ChildrenperRoom() {
      			dropDown(p.getS().getSelect7(),"index","2");
      			sysout("children room  seleted");
			} 
      		@Test(priority = 10)
      		private void Serach_Hotel() {
      		 click(p.getS().getSelect8());
      		sysout("search hotel");
			}@Test(priority = 11)
      		private void Select_Hotel1() {
      			radioButton(p.getS().radioselect);
      		    click(p.getS().getClick1());
			}@Test(priority = 12)
      		private void FirstName() {
      			 sendKeys(p.getS().getSend1(),"Ragu");

			}@Test(priority = 13)
      		private void LastName() {
      			sendKeys(p.getS().getSend2(), "s");

			}@Test(priority = 14)
      		private void BillingAddress() {
      			 sendKeys(p.getS().getSend3(),"kaniyamoor,kallakurichi");

			}@Test(priority = 15)
      		private void CreditCardNo() {
      			sendKeys(p.getS().getSend4(),"1112111411121112");

			}@Test(priority =16)
      		private void CreditCard() {
      			dropDown(p.getS().getSend5(),"text","VISA");

			}@Test(priority = 17)
      		private void ExpiryDate() {
      			dropDown(p.getS().getSend6(),"index","2");
      			dropDown(p.getS().send7,"text","2016");
			}
			@Test(priority = 18)
      		private void CVVNumber() {
      			sendKeys(p.getS().getSend8(),"1234");
			}
			@Test(priority = 19)
      		private void BookNow() {
      			 click(p.getS().getClick2());
      			System.out.println("Booked now");
			}
			@Test(priority = 20)
            private void BookedItinerary() {
            	 click(p.getS().getClick3());
            	 System.out.println("Booked Itinerary");
}            
            @AfterMethod
            private void Screenshot() throws IOException {
            	 takeScreenshot("C:\\Users\\S RAGUPATHI\\eclipseNew-workspace\\Mavenproject\\snaps\\Serachhotel.png", driver);
            	 System.out.println("Screenshot");
			}
            @AfterTest
		private void Logout() {
		click(p. getS().getLogout());
		System.out.println("Logout");
		}
		@AfterSuite
		private void close1() {
			driver.close();
	    System.out.println("quit the browser");
		}
            
}
