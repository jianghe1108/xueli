package GoodsManagement;


import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;

public class GMaddgoodsTest extends BaseTest{
	
	@Test
    public void testBackLogin() throws InterruptedException {
    	BackLogin add=new Other.BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void addg() throws InterruptedException { 
	    GoodsManagement addg=new GoodsManagement(webtest);
	    addg.addgoods("2017年最新款衬衫", "131","韩都衣舍", "49.9", "30.9","45", "46","47","48", "C:\\Users\\acer\\Pictures\\lovewallpaper\\1.jpg","商品描述");
	 }
}	   