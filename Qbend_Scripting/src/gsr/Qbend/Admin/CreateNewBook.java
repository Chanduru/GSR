package gsr.Qbend.Admin;

import gsr.Qbend.Admin.*;
public class CreateNewBook {
	
	QBactionLib Qbact = new QBactionLib();
	QBTransactionLib QbTrans = new QBTransactionLib();
	
	
	{
		try {
			Qbact.clickButton(QbTrans.Bookcatalog);
			Qbact.clickButton(QbTrans.Addnewbook);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	

}
