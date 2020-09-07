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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://census.csnsw.catholic.edu.au/gallery/#!')

WebUI.click(findTestObject('Object Repository/Test_Case_4g_OR/Page_Gallery  CSNSW Gallery/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Test_Case_4g_OR/Page_Sign in to your account/input_Sign in_loginfmt'), 'peter.lewis@csnsw.catholic.edu.au')

WebUI.click(findTestObject('Object Repository/Test_Case_4g_OR/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Test_Case_4g_OR/Page_Gallery  CSNSW Gallery/span_Collections'))

WebUI.click(findTestObject('Object Repository/Test_Case_4g_OR/Page_Gallery/a_Census Upload'))

WebUI.click(findTestObject('Object Repository/Test_Case_4g_OR/Page_Gallery/a_Census Upload_1'))

WebUI.click(findTestObject('Object Repository/Test_Case_4g_OR/Page_Gallery  Census Upload/a_Run'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test_Case_4g_OR/Page_Gallery/select_August                              _e4b88a'), 
    'February', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test_Case_4g_OR/Page_Gallery/select_Student                             _cb792c'), 
    'Teaching Staff', true)

WebUI.click(findTestObject('Object Repository/Test_Case_4g_OR/Page_Gallery/input_File Content_actual'))

not_run: WebUI.closeBrowser()

