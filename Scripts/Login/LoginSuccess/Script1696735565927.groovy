import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sandbox.product.prieds.com/')

WebUI.setText(findTestObject('Object Repository/LoginSuccess/Page_Prieds Technology/input_Sign In_username'), 'testingwmslite3')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginSuccess/Page_Prieds Technology/input_IDUsername_password'), 
    'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/LoginSuccess/Page_Prieds Technology/mat-icon_visibility_off'))

WebUI.click(findTestObject('Object Repository/LoginSuccess/Page_Prieds Technology/button_Login'))

//WebUI.verifyElementText(findTestObject('Object Repository/LoginSuccess/Page_Prieds Technology/font_Salesman REYNER'), 'Salesman: REYNER')
//
//WebUI.verifyElementText(findTestObject('Object Repository/LoginSuccess/Page_Prieds Technology/div_Location  SITE A'), 'Location : SITE A')
//
//WebUI.verifyElementText(findTestObject('Object Repository/LoginSuccess/Page_Prieds Technology/div_System  OMS'), 'System : OMS')

WebUI.verifyElementText(findTestObject('Object Repository/LoginSuccess/Page_Prieds Technology/div_Dashboard'), 'Dashboard')

