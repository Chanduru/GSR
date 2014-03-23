package gsr.Qbend.Admin;

public class QBTransactionLib {

    //Book cata log button  
	  		public static String Bookcatalog = ".//*[@id='ctl00_ContentPlaceHolder1_HyLBooks']";
    
   // add new book button 
			public static String Addnewbook=".//*[@id='ctl00_ContentPlaceHolder1_btncreatebook']";

                     // Book Tab
	//Bookname 
			public static String Bookname = " .//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtBookAutoComplete']";



/*

//ISBN No 13   
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtISBNNo13']


//ISBN No 10 
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtISBNNo10']

//Publish Year(date pick) 
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtPublishYear_dateInput_text']

//Edition 
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtEdition']

//No of page
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtNoofPages']

//Active
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkActive']

//Logical Unit Sales
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkLUSale']

//Ancillary Logical Unit Sale
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_ChkALUSale']

//COver image Path
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtCover_img_Path']

//ProductID
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtProductID']

//Price Display Option

//Lowest Chapter Price
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkLCP']

//Default Price
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkDP']

//Series
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtSeries']

//Audience Age Minimum
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtAud_Age_Minimum']

//Audience Age Maximum
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtAud_Age_Maximum']

//Grade Minimum
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtAud_Grd_Minimum']

//Grade Maximum
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_Aud_Grd_Maximum']

//Sale Model(Drop down)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_drpdnSalesModel']

//Imprint
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtImprint']

//CustomData
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtCustomData']

//Royaltly Percentage
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtRoyaltyPercentage']

//Set Content Availability
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_btAddRegion']

//Globally Available(check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkGlobAvailable']

//Ok(button)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_btOk']

//Submit
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_imgbtnSubmit']


------------------------------------------------------------------------------------------------------------------------------------------------------------------


              //Content Tab=.//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent']


//content Title
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtContentTitle']

//SubTitle
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtSubtitle']

//Content Order
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtContentOrder']

//Publisher Name
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtPublisherAutoComplete']

//Reset(button)
.//*[@id='btnPubClear']

//Author Name
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtAuthorAutoComplete']

//+ (button) for author
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_btnMultipleAuthor']

//Reset button for author
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_btnRestAuthor']

//Available From Qbend(Date picker)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtAvailableFrom_dateInput_text']

//Available From Snap (date picker)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_DtPkrAvailableSnap_dateInput_text']


//Selling Mode

//Purchase(check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkPurchase']

//Rental(check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkRent']

//XPath
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtXPath']


//Download

//Free(check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkFree']

//Available for Store(check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkActive']



//Available for Snap(check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkActiveSnap']

//Show Parts XML(check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkShowParts']



------------------------------------------------------------------------------------------------------------------------------------------------------------


                     Keyword Tab
                   .//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpKeywords']


//Content Keyword
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpKeywords_Ctrl_ContentKeywords1_txtContentKeyword']


//Submit
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpKeywords_Ctrl_ContentKeywords1_imgbtnSaveKeyword']

//Clear
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpKeywords_Ctrl_ContentKeywords1_imgbtnKeywordClear']


-------------------------------------------------------------------------------------------------------------------------------------------------------
                         

                    ContentRoleMap
                  .//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap']


                //Inside the grid//

//Role Name(dropdown box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_drpAddSnapRoles']


//Xpath
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_txtAddXPath']


//Show Xpath  XML(check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_ChkAddShowParts']

//Active
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_chkAddActive']

//Edit
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_lnkAdd']

----------------------------------------------------------------------------------------------------------------------------------------------------------


              Index AnD Toc
         .//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC']


//Index File(Browse)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_fupIndex']

//Reset
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_btnResetindexfileupload']


//Index Content

//Active
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_chkindexActive']

//Submit
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_imgbtnindxSubmit']

//Reset
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_imgbtnindxClear']


//Toc file
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_fupTOCImage']

//toc file reset
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_btnResettocfileupload']


//Active
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_chkActive']

//Submit
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_imgbtnTOCSubmit']


//Reset
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_imgbtnTOCClear']

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                      File Location
                      .//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile']



          //Preview File Upload

//File Upload


//Active
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkpreviewactive']

//Browse
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_Fuppreview']


//Store Preview Upload

//Active
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkbxzippreview']

//Browse
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_Fuppreviewupload']

//SNAP preview File uploaded

//Active
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chksnappreviewactive']

//Browse
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_FUSnappreview']


//Submit
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_imgbtnpreviewupload']


//Aggregator
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_drpAggregator']


//File Location(browse)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_fupContentFileLocation']


//Reset
.//*[@id='file_input_container']/input[2]

//Thumb Location(browse)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_fupContentThumbFileLocation']


//FileType(drop down)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_drpFileType']


//Make As default
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkdefaultfiletype']

//Active
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkfilelocationactive']

//DRM Download
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkDRM']

//Display single Device
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkDisplaySingleDevice']

//GLobally Avaliable
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkglobalAvailable']

//Store Display Option

//Display
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkDisplay']

//Print
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkPrint']

//Copy
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkCopy']

//Share
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkShare']


//ISBN 10
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_txtFTISBN10']

//ISBN 13
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_txtFTISBN13']

//Submit
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_imgbtnfileuploadSubmit']

//clear
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_imgbtnfileuploadClear']

//Submit
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_imgbtnoverallsubmit']


//DMR Rights

//Purchase Permission

//select File Type(dropdown)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_drpPurchasrFileType']

//Display(check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_chkpurchaseDisplay']


//Relative(radio button)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_RBpurchaseDisp_Relative']


//Expires
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_txtpurchaseRelative']

//Seconds(Dropdown)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_DrpDwnduration']


//Absolute
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_RBpurchaseDisp_Absolute']

//Expires at
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_txtpurchaseAbsolute']


//Copy (Check box)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_chkpurchaseCopy']


//Selection Every
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_txtpurchaseCopy_2']

//seconds(dropdown)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_drpdwnpurcpyduration']


//Print(checkbox)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_chkpurchasePrint']


//Page every
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_txtpurchasePrint_2']

//Seconds(dropdown)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_drpdwnpurprntduration']


//Submit

.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_imgbtnpurchasepermissionsave']

//Clear
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_imgbtnpurchasepermissionClear']


//Rental Premission

.//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights']


//Select File Type(Dropdown)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_drpRentFileType']


//Copy(checkbox)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_chkrentCopy']

//Selection  Every
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_txtrentCopy_2']

//Seconds(Dropdown)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_drpdwnrentcpyduration']

//print(checkbox)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_chkrentPrint']

//Page Every
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_txtrentPrint_2']

//Seconds(dropdown)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_drpdwnrentprntduration']


//Submit
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_imgbtnnrentpermissionsave']

//Clear
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_imgbtnnrentpermissionclear']



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                     //Pricing
                     .//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing']


//Inside Grid table


//File Format
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_DrpdwnFileType']

//Location
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_Drpdwnlocation']

//Currency
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_Drpdwncurrency']

//SaleType
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_DropDownListSaleType']

//Unit type
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_DropDownListUnitType']

//Unit price
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_txtUnitPrice']

//List Price
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_txtListPrice']

//Active
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_chkboxactive']

//Edit(insert)
.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_lnkAdd']
*/
}
