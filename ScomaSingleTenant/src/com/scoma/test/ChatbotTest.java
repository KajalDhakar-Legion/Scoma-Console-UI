package com.scoma.test;

import org.testng.annotations.Test;

import com.scoma.pages.Chatbotpage;

import org.testng.annotations.Test;

public class ChatbotTest extends LoginTest
{
	//int options = 1;
	
  @Test
  public void verify_chatbot()
	{		
	  Chatbotpage chatbot = new Chatbotpage(driver);
	  chatbot.click_chatbot();
	}
  
  @Test(dependsOnMethods={"verify_chatbot"})
  public void clickOnChatbotOptions()
  {
	 Chatbotpage chatbot = new Chatbotpage(driver);
	 chatbot.chatbot_options(1);
  }
}
