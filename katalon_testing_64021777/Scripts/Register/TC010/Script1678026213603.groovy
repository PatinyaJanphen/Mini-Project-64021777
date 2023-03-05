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

WebUI.navigateToUrl('https://pongvarid.github.io/probation_client_nuxt/?fbclid#/')

WebUI.click(findTestObject('Object Repository/Register/Page_/span_'))

WebUI.click(findTestObject('Object Repository/Register/Page_/a_'))

WebUI.click(findTestObject('Object Repository/Register/Page_/div_'))

WebUI.setText(findTestObject('Object Repository/Register/Page_/input__input-63'), username)

WebUI.click(findTestObject('Object Repository/Register/Page_/div__1'))

WebUI.setText(findTestObject('Object Repository/Register/Page_/input__input-66'), password)

WebUI.click(findTestObject('Object Repository/Register/Page_/div__1_2'))

WebUI.setText(findTestObject('Object Repository/Register/Page_/input__input-69'), confirm_password)

WebUI.click(findTestObject('Object Repository/Register/Page_/div__1_2_3'))

WebUI.setText(findTestObject('Object Repository/Register/Page_/input__input-72'), e_mail)

WebUI.click(findTestObject('Object Repository/Register/Page_/div__1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Register/Page_/input__input-75'), company)

WebUI.click(findTestObject('Object Repository/Register/Page_/div__1_2_3_4_5'))

WebUI.setText(findTestObject('Object Repository/Register/Page_/input__input-78'), address)

WebUI.click(findTestObject('Object Repository/Register/Page_/span__1'))

TestObject divObjectRegister = findTestObject('Object Repository/Register/Page_/h2_')

String register = WebUI.getText(divObjectRegister)

if (register == 'สมัครสมาชิกเรียบร้อยแล้ว') {
    WebUI.click(findTestObject('Object Repository/Register/Page_/button_'))

    WebUI.click(findTestObject('Object Repository/Register/Page_/div_'))

    WebUI.setText(findTestObject('Object Repository/Register/Page_/input__input-111'), username)

    WebUI.click(findTestObject('Object Repository/Register/Page_/div__1'))

    WebUI.setText(findTestObject('Object Repository/Register/Page_/input__input-114'), password)

    WebUI.click(findTestObject('Object Repository/Register/Page_/span__1_2'))

    TestObject divObjectHello = findTestObject('Object Repository/Register/Page_/span_,')

    String hello = WebUI.getText(divObjectHello)

    if (hello == 'สวัสดี,') {
        //        WebUI.click(findTestObject('Object Repository/Register/Page_/span_,'))
        println(hello)
    }
} else if (register != 'สมัครสมาชิกเรียบร้อยแล้ว') {
    KeywordUtil.markFailedAndStop('Test case stopped due to != สมัครสมาชิกเรียบร้อยแล้ว.')
}

