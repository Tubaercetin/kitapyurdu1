package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKey(By.id("search-input"), "oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));

        //methods.scrollWithAction(By.id("product-394421"));
        methods.scrollWithAction(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);

        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//img[@title='kitapla bulu??man??n en kolay yolu!']"));
        methods.waitBySeconds(1);
        methods.waitBySeconds(3);

        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("img[title='Puan Katalo??undaki T??rk Klasikleri']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector("div[class='sort']>select[onchange='location = this.value;']"),"Y??ksek Oylama"); //Oylama yapar
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//span[@class = 'mn-strong common-sprite' and contains(text(), 'T??m Kitaplar')]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//span[@class = 'mn-strong common-sprite' and contains(text(), 'T??m Kitaplar')]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//a[@class = 'mn-icon icon-angleRight' and text() = 'Hobi']"));
        methods.waitBySeconds(3);
        clickRandomProduct();
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#button-cart > span"));  //sepete ekleme
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath(("//a[@class = 'common-sprite' and contains(text(), 'Listelerim')]")));
        methods.click(By.xpath("//a[@class = 'common-sprite' and contains(text(), 'Listelerim')]"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#header-top > div > div.top-menu.fr > ul > li:nth-child(1) > div > ul > li > div > ul > li:nth-child(1) > a"));
        methods.waitBySeconds(3);


        methods.scrollWithAction(By.xpath(("//h4[@class = 'common-sprite' and contains(text(), 'Sepetim')]")));
        methods.click(By.xpath("//h4[@class = 'common-sprite' and contains(text(), 'Sepetim')]"));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector("#js-cart"));
        methods.waitBySeconds(3);

        methods.findElement(By.xpath("//input[@name='quantity']")).clear(); //miktar?? silme
        methods.waitBySeconds(2);
        methods.sendKey(By.xpath("//input[@name='quantity']"), "3"); //miktar?? 3 yapar
        methods.waitBySeconds(3);
        methods.click(By.xpath("//i[@title='G??ncelle']")); // Yeni miktar
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='right']//a[@class='button red']")); //sat??n alma
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("address-firstname-companyname"),"Tuba");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-lastname-title"),"Er??etin");
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector("select[id='address-zone-id']"), "??stanbul");
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector("select#address-county-id"),"KA??ITHANE");
        methods.waitBySeconds(3);
        methods.sendKey(By.cssSelector("input[id='district']"),"Ka????thane");
        methods.waitBySeconds(3);
        methods.sendKey(By.cssSelector("textarea[id='address-address-text']"), "Ev adresim");
        methods.waitBySeconds(3);
        methods.sendKey(By.cssSelector("input[id='address-postcode']"), "34000");
        methods.waitBySeconds(3);
        methods.sendKey(By.cssSelector("#address-telephone"),"2120000000");
        methods.waitBySeconds(3);
        methods.sendKey(By.cssSelector("#address-mobile-telephone"),"5310000000");
        methods.waitBySeconds(3);

        methods.click(By.cssSelector("#shipping-existing > div > table > tbody > tr > td:nth-child(2)"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#shipping-address-form > div:nth-child(5) > label"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#shipping-method-header"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#tab-shipping-companies-non > table > tbody > tr:nth-child(1) > td:nth-child(1)"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBySeconds(3);
    }
    public void clickRandomProduct() {
        Random rnd = new Random();
        List<WebElement> Products = methods.findElements(By.cssSelector(".pr-img-link"));
        WebElement rndProduct = Products.get(rnd.nextInt(Products.size()));
        rndProduct.click();
        logger.info("Rastgele bir ??r??n se??ildi");

    }

    public void attributeTest() {
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"), "title");
        System.out.println("Al??nan text: " + attribute);
        logger.info("Al??nan text: " + attribute);
        methods.waitBySeconds(5);

    }

    public void textControlTest() {
        String text = methods.getText(By.id(".common-sprite"));
        System.out.println("Al??nan text: " + text);
        logger.info("Al??nan text: " + text);
        methods.waitBySeconds(5);

    }



}
