package Hack.constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Constants {
	
	private static final String CONFIG_FILE = "config" + File.separator + "master.properties";
	private static Properties props = new Properties();
	static
	{
		loadProperties();
	}
	
	public static final String CUST_DATA_FILE_NAME = props.getProperty("input_cust_file_name");
	public static final String TXN_DATA_FILE_NAME = props.getProperty("input_txn_file_name");
	public static final String LOW_SALARY_VAL = props.getProperty("lowsal");
	public static final String MID_SALARY_VAL = props.getProperty("midsal");
	public static final String HIGH_SAL_VAL = props.getProperty("highsal");
	public static final String LOW_SAL_NORMAL_CREDIT_VAL = props.getProperty("lowsal_normal_credit");
	public static final String LOW_SAL_NORMAL_DEBIT_VAL = props.getProperty("lowsal_normal_debit");
	public static final String MID_SAL_NORMAL_CREDIT_VAL = props.getProperty("midsal_normal_credit");
	public static final Integer LOW_SAL_CUST_PERCENTAGE = Integer.parseInt(props.getProperty("lowsal_cust_count"));
	public static final Integer MID_SAL_CUST_PERCENTAGE = Integer.parseInt(props.getProperty("midsal_cust_count"));
	public static final Integer HIGH_SAL_CUST_PERCENTAGE = Integer.parseInt(props.getProperty("highsal_cust_count"));
	public static final Integer NUM_OF_CUSTOMERS = Integer.parseInt(props.getProperty("number_of_customers"));
	public static final Integer CUST_ID_BEGIN_VAL = Integer.parseInt(props.getProperty("cust_id_begin_value"));
	public static final String MASTER_DATA_INPUT = props.getProperty("MasterIPData");
	public static final String TRANS_DATA_INPUT =props.getProperty("TransactionIPData");
	public static final String FILE_DELIMITER = props.getProperty("file_delimiter"); 
	public static final String LOW_SALARY_FILE = props.getProperty("lowSalaryFilePath");
	public static final String MID_SALARY_FILE =props.getProperty("MediumSalaryFilePath");
	public static final String HIGH_SALARY_FILE = props.getProperty("HighSalaryFilePath"); 
	
	
	public static final String LOW_SALARY_CODE = "0";
	public static final String MID_SALARY_CODE ="1";
	public static final String HIGH_SALARY_CODE = "2"; 
	
	private static void loadProperties() 
	{
		try 
		{
			props.load(new FileInputStream(CONFIG_FILE));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
