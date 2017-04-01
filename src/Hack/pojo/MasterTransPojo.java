package Hack.pojo;

import java.util.ArrayList;
import java.util.List;

public class MasterTransPojo {
	
private List<MasterPojo> masDataLst = new ArrayList<MasterPojo>();

private List<Transaction> tranDataLst = new ArrayList<Transaction>();

public List<MasterPojo> getMasDataLst() {
	return masDataLst;
}

public void setMasDataLst(List<MasterPojo> masDataLst) {
	this.masDataLst = masDataLst;
}

public List<Transaction> getTranDataLst() {
	return tranDataLst;
}

public void setTranDataLst(List<Transaction> tranDataLst) {
	this.tranDataLst = tranDataLst;
}



}
