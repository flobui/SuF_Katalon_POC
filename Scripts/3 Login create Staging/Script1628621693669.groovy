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

WebUI.callTestCase(findTestCase('1 Login Staging'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/button_Ajouter'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/sflow-new-item-card_startupCrez des portfol_65ae7b'))

WebUI.setText(findTestObject('Object Repository/Page_Staging Test Startup Flow/input_Ajoutez une nouvelle startup  votre c_65f7e5'), 
    'E2etestsStartupflow (ne pas modifier svp)')

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/button_Continuez sans enrichissement'))

WebUI.setText(findTestObject('Object Repository/Page_Staging Test Startup Flow/textarea_Pitch (description rapide)_textare_02494e'), 
    'E2etestsStartupflow (ne pas modifier svp)')

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/button_Confirmer les informations gnrales'))

WebUI.setText(findTestObject('Object Repository/Page_Staging Test Startup Flow/textarea_concat(Quel est l, , objectif de c_c3b0b5'), 
    'E2etestsStartupflow (ne pas modifier svp)')

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/button_tape suivante'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/sflow-tag_Agency'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/section_SECTEURS DACTIVIT Obligatoire, slec_dca830'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/sflow-tag_Agriculture'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/button_Confirmer la slection de tags'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/sflow-source_Assurance'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/button_Confirmer la slection de source'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/div_Passer cette tape Confirmer la slection_766960'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/button_Confirmer la slection de contact'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/div_Crer la page E2etestsStartupflow (ne pa_cd9ccc'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/button_Crer la page E2etestsStartupflow (ne_79812b'))

WebUI.click(findTestObject('Object Repository/Page_Staging Test Startup Flow/button_Aller sur la fiche E2etestsStartupfl_ec390e'))

WebUI.closeBrowser()

