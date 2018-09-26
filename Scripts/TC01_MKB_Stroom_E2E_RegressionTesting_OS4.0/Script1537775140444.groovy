import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://zakelijk.eneco.nl/OrderflowOs/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://zakelijk.eneco.nl/OrderflowOs/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://zakelijk.eneco.nl/OrderflowOs/")
selenium.click("id=wt130_wtMainContent_SilkUIFramework_wt45_block_wtColumn1_wtProductList_ctl00_wt71_SilkUIFramework_wt1_block_wtContent_wtAddButton")
selenium.click("id=wt130_wtMainContent_SilkUIFramework_wt45_block_wtColumn1_wtProductList_ctl02_wt71_SilkUIFramework_wt1_block_wtContent_wtAddButton")
selenium.click("id=wt130_wtMainContent_SilkUIFramework_wt45_block_wtColumn1_wtProductList_ctl04_wt71_SilkUIFramework_wt1_block_wtContent_wtAddButton")
selenium.click("id=wt130_wtMainContent_SilkUIFramework_wt45_block_wtColumn1_wtProductList_ctl04_wt71_SilkUIFramework_wt1_block_wtContent_wtAddButton")
selenium.click("id=wt130_wtMainContent_SilkUIFramework_wt45_block_wtColumn1_wtProductList_ctl00_wt71_SilkUIFramework_wt1_block_wtContent_wtAddButton")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Contractduur'])[1]/following::span[2]")
selenium.click("id=wt130_wtMainContent_SilkUIFramework_wt45_block_wtColumn2_wtReciept_SilkUIFramework_wt12_block_wtContent_wtToBusinessDataButtom")
selenium.doubleClick("id=wt130_wtMainContent_SilkUIFramework_wt45_block_wtColumn2_wtReciept_SilkUIFramework_wt12_block_wtContent_wtToBusinessDataButtom")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtCompanyInput")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtCompanyInput", "4dms")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Click here to see your activities'])[1]/following::ui-autocomplete-item[1]")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtPostalCodeDiv")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wt151_wtInputToValidate_wtPostalCodeInput")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_SilkUIFramework_wt223_block_wtColumn1_wtNumberInput", "5")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Ja'])[1]/span[1]")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtDateField")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtDateField", "24-09-2018")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtDateField", "24-09-2018")
selenium.doubleClick("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtDateField")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtDateField", "12-12-2018")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtStartDateDiv")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Aanhef'])[1]/following::span[2]")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtInitials")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtInitials", "test")
selenium.click("id=wt189_wtMainContent")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtSurName")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtSurName", "test")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtPhoneNumber")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtPhoneNumber", "0123456789")
selenium.click("id=wt189_wtMainContent")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtEmail")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtEmail", "proeneco@gmail.com")
selenium.click("id=wt189_wtMainContent")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtIBANInput")
selenium.type("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_wtIBANInput", "nl13test0123456789")
selenium.click("id=wt189_wtMainContent")
selenium.click("id=wt189_wtMainContent_SilkUIFramework_wt109_block_wtColumn1_SilkUIFramework_wt90_block_wtColumn2_wt26")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Algemene voorwaarden'])[1]/following::span[3]")
selenium.click("id=wt167_wtMainContent_SilkUIFramework_wt45_block_wtColumn1_SilkUIFramework_wt170_block_wtColumn2_wtOrderButton")
