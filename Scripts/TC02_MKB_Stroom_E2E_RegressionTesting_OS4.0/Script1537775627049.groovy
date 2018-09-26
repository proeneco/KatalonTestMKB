import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement as WebElement
import groovy.time.TimeCategory as TimeCategory
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver

//Open browser
WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Cookies_Accept_Page_Productkeuze'))

//Adding Stroom to the Cart
WebUI.scrollToElement(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Adding_Stroom_ToCart_Page_Productkeuze'), 
    20)

WebUI.click(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Adding_Stroom_ToCart_Page_Productkeuze'))

//Adding HollandsWind to the Cart and Changing it to HollandseZon
WebUI.waitForElementPresent(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Adding_HollandseWInd_ToCart_Page_Productkeuze'), 
    20)

WebUI.click(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Adding_HollandseWInd_ToCart_Page_Productkeuze'))

//Adding HollandsZon to the Cart and Changing it to HollandseZon
WebUI.waitForElementPresent(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Adding_HollandseZon_ToCart_Page_Productkeuze'), 
    20)

WebUI.click(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Adding_HollandseZon_ToCart_Page_Productkeuze'))

//Removing HollandseZon from Cart
WebUI.click(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Adding_HollandseZon_ToCart_Page_Productkeuze'))

WebUI.delay(1)

//Adding Stroom Back to the Cart
WebUI.scrollToElement(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Adding_Stroom_ToCart_Page_Productkeuze'), 
    20)

WebUI.click(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/Adding_Stroom_ToCart_Page_Productkeuze'))

//Select 3 year Stroom Product and checkout from the Cart
WebUI.click(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/ProductDuration_3years_Selection_Page_Productkeuze'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/CheckOutCart_From_ProductList_Page_Productkeuze'), 
    20)

WebUI.click(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Productkeuze/CheckOutCart_From_ProductList_Page_Productkeuze'))

WebUI.setText(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/CompanyName_AutoCompletionField_Page_Gegevens'), 
    '4dms')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/CompanyName_AutoCompletionField_Page_Gegevens'), 
    '\t')

WebUI.setText(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/PostCode_InputField_Page_Gegevens'), 
    '3401 MX')

WebUI.sendKeys(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/PostCode_InputField_Page_Gegevens'), 
    '\t')

WebUI.acceptAlert()

WebUI.setText(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/HouseNumber_InputField_Page_Gegevens'), 
    '5')

WebUI.scrollToElement(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/DHR_RadioButton_Page_Gegevens'), 
    20)

WebUI.click(findTestObject('OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/DHR_RadioButton_Page_Gegevens'))

//Calcualation of Next Month Date
use(TimeCategory, { 
        today = new Date()

        NextMonth = (today + 1.month)
    })

WebUI.setText(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/StartDate_InputField_Page_Gegevens'), 
    NextMonth.format('dd/MM/yyyy').toString())

WebUI.sendKeys(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/StartDate_InputField_Page_Gegevens'), 
    '\t')

WebUI.click(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/FirstName_InputField_Page_Gegevens'))

WebUI.click(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/SwitchType01_JA_RadioButton_Page_Gegevens'))

WebUI.setText(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/FirstName_InputField_Page_Gegevens'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/LastName_InputField_Page_Gegevens'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/TelephoneNumber_InputField_Page_Gegevens'), 
    '0123456789')

//WebUI.setText(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/EmailId_InputField_Page_Gegevens'), Email)

WebUI.setText(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/EmailId_InputField_Page_Gegevens'),
	findTestData("MKB_TestDataFile").getValue(2, 8))

WebUI.setText(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/IBAN_InputField_Page_Gegevens'), 
    'NL13Test0123456789')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Gegevens/SubmitButtonGegevens_Page_Gegevens'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Bevestiging/Terms and Conditions_InputField_Page_Bevestiging'), 
    20)

WebUI.sendKeys(findTestObject('Object Repository/OR01_MKB_Stroom_E2E_RegressionTesting_OS4.0_TC01/Page_Bevestiging/Terms and Conditions_InputField_Page_Bevestiging'), 
    Keys.chord(Keys.SPACE))

